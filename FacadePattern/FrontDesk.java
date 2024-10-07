package FacadePattern;

public class FrontDesk {
    private Valet valetService;
    private HouseKeeping houseKeepingService;
    private Cart cartService;

    public FrontDesk() {
        this.valetService = new Valet();
        this.houseKeepingService = new HouseKeeping();
        this.cartService = new Cart();
    }

    public void pickUpVehicle(String plateNumber) {
        valetService.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        houseKeepingService.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cartService.requestCart(numberOfCarts);
    }
}