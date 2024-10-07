public class Valet implements HotelService {
    @Override
    public void provideService() {
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Vehicle with Plate Number " + plateNumber + " has been successfully picked up!");
    }
}