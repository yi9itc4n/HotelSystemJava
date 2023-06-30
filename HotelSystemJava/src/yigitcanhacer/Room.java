package yigitcanhacer;

public class Room {
    private int roomNumber;
    private String roomType;
    private int price;
    private boolean isAvailable=true;

    public Room(int roomNumber, String roomType, int price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean b) {
        this.isAvailable = b;
    }
    public boolean IsAvailable(){
        return isAvailable;
    }

}
