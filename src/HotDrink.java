
public class HotDrink extends Product {
    int temperature;
    int volume;

    // public HotDrink(String name) {
    //     super(name);
    // }

    public HotDrink(String name, int temperature, int vol) {
        super(name);
        this.temperature = temperature;
        this.volume = vol;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof HotDrink))
            return false;
        
        HotDrink that = (HotDrink) obj; 
        
        return super.getName().equalsIgnoreCase(that.getName())
        && getTemperature() == that.getTemperature()
        && this.getVolume() == that.getVolume();
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + this.getName() + '\'' +
               ", temperature=" + this.temperature + 
               ", volume=" + this.volume + 
               '}';
    }

}
