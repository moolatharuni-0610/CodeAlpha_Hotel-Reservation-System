# 🏨 Hotel Reservation System

A Java-based **Hotel Reservation System** developed as part of the **CodeAlpha Java Programming Internship**. This application allows users to search available rooms, make reservations, cancel bookings, simulate payments, and manage hotel room availability using Object-Oriented Programming (OOP) and File I/O.

---

## 📌 Features

- 🔍 Search available hotel rooms
- 🛏️ Room categorization:
  - Standard
  - Deluxe
  - Suite
- 📅 Book hotel rooms
- ❌ Cancel reservations
- 💳 Payment simulation
- 📋 View booking details
- 💾 Store room and booking data using File I/O
- 🧩 Object-Oriented Programming (OOP) implementation
- 🖥️ Simple console-based user interface

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections (ArrayList)
- File Handling (File I/O)
- Exception Handling

---

## 📁 Project Structure

```
HotelReservationSystem/
│
├── HotelReservationSystem.java
├── HotelManager.java
├── Room.java
├── Reservation.java
├── rooms.txt
├── bookings.txt
└── README.md
```

---

## ⚙️ How It Works

1. View available hotel rooms.
2. Select a room by entering its room number.
3. Enter customer details to book the room.
4. Payment is simulated before confirming the booking.
5. Booking information is stored in `bookings.txt`.
6. Room availability is updated in `rooms.txt`.
7. Users can view or cancel existing reservations.

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/HotelReservationSystem.git
```

### 2. Open the project

Open the project in your preferred Java IDE such as:
- IntelliJ IDEA
- Eclipse
- NetBeans
- VS Code (Java Extension Pack)

### 3. Compile the project

```bash
javac *.java
```

### 4. Run the application

```bash
java HotelReservationSystem
```

---

## 📂 Data Storage

### rooms.txt

Stores room details in the following format:

```
RoomNumber,Category,Price,Availability
```

Example:

```
101,Standard,1000,true
201,Deluxe,2000,false
301,Suite,3500,true
```

### bookings.txt

Stores booking information in the following format:

```
CustomerName,RoomNumber
```

Example:

```
Priyasha,201
Rahul,301
```

---

## 💻 Sample Menu

```
===== HOTEL RESERVATION SYSTEM =====

1. View Available Rooms
2. Book Room
3. Cancel Reservation
4. View Bookings
5. Exit
```

---

## 🎯 Concepts Implemented

- Classes & Objects
- Encapsulation
- Constructors
- ArrayList
- File Handling
- Exception Handling
- Modular Programming
- User Input Handling

---

## 📌 Future Enhancements

- User Login and Registration
- Admin Dashboard
- Database Integration (MySQL)
- Online Payment Gateway
- Email Confirmation
- Booking History
- Room Images
- Search and Filter Rooms
- GUI or Web Interface

---

## 👨‍💻 Internship Task

**CodeAlpha Java Programming Internship**

**Task 4 – Hotel Reservation System**

Design a system to:
- Search hotel rooms
- Book rooms
- Manage room availability
- Categorize rooms (Standard, Deluxe, Suite)
- Cancel reservations
- Simulate payments
- Store booking data using File I/O

---

## 📄 License

This project is created for educational and internship purposes.

---

⭐ If you found this project helpful, consider giving it a star on GitHub!
