public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        int volume = this.volume;
        return volume;
    }

    public int drinkLiquid(int amount){
        int VolumeLeft = this.volume - amount;
        return VolumeLeft;
    }

    public int emptyBottle () {
        int BottleVolume  = this.volume - this.volume;
        return BottleVolume;
    }
    public int fillBottle (int poured){
        int BottleVolume = + poured;
        return BottleVolume;
    }


}
