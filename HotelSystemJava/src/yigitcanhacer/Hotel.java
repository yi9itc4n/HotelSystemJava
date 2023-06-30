package yigitcanhacer;

public class Hotel {
    private String hotelName;
    private String address;
    private String telephone;
    private Room room[] = new Room[4];
    public Hotel(String hotelName, String address, String telephone) {
        this.hotelName = hotelName;
        this.address = address;
        this.telephone = telephone;
        room[0] = new Room(101, "standart",100);
        room[1] = new Room(201, "family",200);
        room[2] = new Room(301,"suit",400);
        room[3] = new Room(302,"suit",400);
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public Room[] getRooms() {
        return room;
    }

    public void setRooms(Room[] room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                '}';
    }
}
