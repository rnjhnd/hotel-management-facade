public class HouseKeeping implements HotelService{
    @Override
    public void provideService() {
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Room " + roomNumber + " has been tidied up and refreshed!");
    }
}