import java.io.*;
import java.util.*;

public class HotelManager {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    private final String ROOM_FILE = "rooms.txt";
    private final String BOOKING_FILE = "bookings.txt";

    public HotelManager() {
        loadRooms();
        loadBookings();
    }

    private void loadRooms() {

        File file = new File(ROOM_FILE);

        if (!file.exists()) {

            rooms.add(new Room(101, "Standard", 1000, true));
            rooms.add(new Room(102, "Standard", 1000, true));
            rooms.add(new Room(201, "Deluxe", 2000, true));
            rooms.add(new Room(202, "Deluxe", 2000, true));
            rooms.add(new Room(301, "Suite", 3500, true));

            saveRooms();
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(ROOM_FILE))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                rooms.add(new Room(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2]),
                        Boolean.parseBoolean(data[3])
                ));
            }

        } catch (Exception e) {
            System.out.println("Error Loading Rooms");
        }
    }

    private void saveRooms() {

        try (PrintWriter pw = new PrintWriter(new FileWriter(ROOM_FILE))) {

            for (Room room : rooms) {
                pw.println(room);
            }

        } catch (Exception e) {
            System.out.println("Error Saving Rooms");
        }
    }

    private void loadBookings() {

        File file = new File(BOOKING_FILE);

        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                reservations.add(
                        new Reservation(
                                data[0],
                                Integer.parseInt(data[1])
                        )
                );
            }

        } catch (Exception e) {
            System.out.println("Error Loading Bookings");
        }
    }

    private void saveBookings() {

        try (PrintWriter pw = new PrintWriter(new FileWriter(BOOKING_FILE))) {

            for (Reservation r : reservations) {
                pw.println(r);
            }

        } catch (Exception e) {
            System.out.println("Error Saving Bookings");
        }
    }

    public void showAvailableRooms() {

        System.out.println("\nAvailable Rooms");

        for (Room room : rooms) {

            if (room.isAvailable()) {

                System.out.println(
                        "Room: " + room.getRoomNumber()
                                + " | Category: " + room.getCategory()
                                + " | Price: ₹" + room.getPrice()
                );
            }
        }
    }

    public void bookRoom(String name, int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {

                System.out.println("\nProcessing Payment...");
                System.out.println("Payment Successful!");

                room.setAvailable(false);

                reservations.add(
                        new Reservation(name, roomNumber)
                );

                saveRooms();
                saveBookings();

                System.out.println("Room Booked Successfully!");
                return;
            }
        }

        System.out.println("Room Not Available!");
    }

    public void cancelReservation(int roomNumber) {

        Reservation found = null;

        for (Reservation r : reservations) {

            if (r.getRoomNumber() == roomNumber) {
                found = r;
                break;
            }
        }

        if (found != null) {

            reservations.remove(found);

            for (Room room : rooms) {

                if (room.getRoomNumber() == roomNumber) {
                    room.setAvailable(true);
                }
            }

            saveRooms();
            saveBookings();

            System.out.println("Reservation Cancelled!");
        } else {
            System.out.println("No Reservation Found!");
        }
    }

    public void viewBookings() {

        System.out.println("\nBooking Details");

        for (Reservation r : reservations) {

            System.out.println(
                    "Customer: " + r.getCustomerName()
                            + " | Room Number: " + r.getRoomNumber()
            );
        }
    }
}