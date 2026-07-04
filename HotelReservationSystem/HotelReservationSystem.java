import java.util.Scanner;
public class HotelReservationSystem {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
        HotelManager manager = new HotelManager();
        boolean exit = false;

        while (!exit) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");

            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");

            System.out.print("Choose Option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.showAvailableRooms();
                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();

                    manager.bookRoom(name, roomNo);
                    break;

                case 3:

                    System.out.print("Enter Room Number: ");
                    int cancelRoom = sc.nextInt();

                    manager.cancelReservation(cancelRoom);
                    break;

                case 4:
                    manager.viewBookings();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}