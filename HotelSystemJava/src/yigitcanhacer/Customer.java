package yigitcanhacer;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int IdentityID;

    public ArrayList<Rezervation> getRezervations() {
        return rezervations;
    }

    public void setRezervations(ArrayList<Rezervation> rezervations) {
        this.rezervations = rezervations;
    }

    private ArrayList<Rezervation> rezervations = new ArrayList<Rezervation>();

    public Customer(String name, int identityID) {
        this.name = name;
        IdentityID = identityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentityID() {
        return IdentityID;
    }

    public void setIdentityID(int identityID) {
        IdentityID = identityID;
    }


    public void makeRezervation(Hotel hotel, String roomType,int day) {
        int roomNumber=0;
        int yerlesme=0;
        for(int i=0;i<hotel.getRooms().length;i++){
            if(hotel.getRooms()[i].getRoomType().equals(roomType)&&hotel.getRooms()[i].IsAvailable()==true){
                roomNumber = hotel.getRooms()[i].getRoomNumber();
                yerlesme=1;
                hotel.getRooms()[i].setAvailable(false);
                break;
            }
        }
        if(yerlesme==0){
            System.out.println("There is no room available for this type");
        }
        else {
            Rezervation rezervation = new Rezervation(hotel, day, roomNumber);
            this.rezervations.add(rezervation);
        }
    }
    public void getInvoice(int rezervationID) {
        for(int i=0;i<rezervations.size();i++){
            if(rezervations.get(i).getRezervationID()==rezervationID){
               System.out.println(rezervations.get(i).calculatePayment());
            }
        }
    }
    public void listCustomerRezervations(){
        for(int i=0;i<rezervations.size();i++){
            System.out.println(rezervations.get(i).toString());
        }
    }
}
