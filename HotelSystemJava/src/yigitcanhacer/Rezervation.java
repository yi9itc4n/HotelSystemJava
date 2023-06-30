package yigitcanhacer;

public class Rezervation {
    private static int counter=20230001;
    private int rezervationID;
    private Hotel hotel;
    private int day;
    private int roomNumber;

    public Rezervation(Hotel hotel, int day, int roomNumber) {
        this.hotel = hotel;
        this.day = day;
        this.roomNumber = roomNumber;
        this.rezervationID = counter;
        counter++;
    }


    public int getRezervationID() {
        return rezervationID;
    }

    public void setRezervationID(int rezervationID) {
        this.rezervationID = rezervationID;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int calculatePayment(){
        int price=0;
        for(int i=0;i<hotel.getRooms().length;i++){
            if(hotel.getRooms()[i].getRoomNumber()==roomNumber){
                price = hotel.getRooms()[i].getPrice();
                break;
            }
        }
        return price*day;
    }

    @Override
    public String toString() {
        return "Rezervation{" +
                "rezervationID=" + rezervationID +
                ", hotel=" + hotel +
                ", roomNumber=" + roomNumber +
                ", day=" + day +
                '}';
    }
}
