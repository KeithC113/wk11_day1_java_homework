public class Runner {
    public static void main(String[] args) {
        WaterBottle myWaterBottle = new WaterBottle(100);
        int volume = myWaterBottle.getVolume();

        System.out.println("Initial volume in bottle is " + myWaterBottle.getVolume());
        System.out.println("New volume in bottle is " + myWaterBottle.drinkLiquid(10));

    }

}
