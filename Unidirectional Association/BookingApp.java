package Question04;

class Room{
    private int roomNumber;
    private int capacity;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public void getRoomDetails(){
        System.out.println("Room Number: " + roomNumber + " Capacity: " + capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}

class Booking{
    private String bookingId;
    private int numGuests;
    private Room room;

    public Booking(String bookingId, int numGuests, Room room) {
        this.bookingId = bookingId;
        this.numGuests = numGuests;
        this.room = room;
    }

    public void confirmBooking(){
        if(numGuests <= room.getCapacity()){
            System.out.println("Booking " + bookingId + " confirmed for ");
            room.getRoomDetails();
        }

        else{
            System.out.println("Booking " + bookingId + " rejected: Room capacity exceeded for Room: " );
            room.getRoomDetails();
        }
    }
}


public class BookingApp {
    public static void main(String[] args) {
        Room room = new Room(101, 4);
        Booking booking1 = new Booking("B001", 3, room);
        Booking booking2 = new Booking("B002", 6, room);
        booking1.confirmBooking();
        booking2.confirmBooking();
    }
}
