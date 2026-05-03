class HotelRoom {

    private int roomsBooked = 0;

    void bookRoom() {
        roomsBooked++;
    }

    void cancelRoom() {

        if (roomsBooked > 0) {
            roomsBooked--;
        }
    }

    int getBookedRooms() {
        return roomsBooked;
    }

    public static void main(String[] args) {

        HotelRoom hotel = new HotelRoom();

        hotel.bookRoom();
        hotel.bookRoom();
        hotel.cancelRoom();

        System.out.println("Booked Rooms: " + hotel.getBookedRooms());
    }
}