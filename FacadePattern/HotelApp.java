package FacadePattern;

public class HotelApp {
    public static void main(String[] args) {
        // Create an instance of the FrontDesk
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.pickUpVehicle("XYZ-1234");
        System.out.println();
        frontDesk.cleanRoom(42);
        System.out.println();
        frontDesk.requestCart(3);
    }
}
