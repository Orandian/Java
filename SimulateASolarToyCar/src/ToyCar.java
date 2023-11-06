public class ToyCar {
    protected double batteryLevel;
    protected final double fullBattery = 1000;
    public ToyCar() {
        batteryLevel = fullBattery;
    }
    public void forward(double distance) {
        System.out.println("Go forward for " + distance + " meters");
        batteryLevel -= distance; // 1 unit of distance -> 1 battery level
    }
    public void turn(Direction dir, double angles) {
        System.out.println("Turn " + dir + " by " + angles + " degrees");
        batteryLevel -= angles; // 1 degree -> 1 battery level
    }
    public double getBattery(){
        return batteryLevel;
    }
    public void chargeBattery(){
        System.out.println("Charge battery from wall socket");
        batteryLevel = fullBattery;
    }
}
