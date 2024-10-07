public class Cart implements HotelService{
    @Override
    public void provideService() {
    }

    public void requestCart(int numberOfCarts) {
        System.out.println(numberOfCarts + " cart/s are on their way!");
    }
}
