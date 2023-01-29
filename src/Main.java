public class Main {
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        int distance = 100;
        RaceTrack race = new RaceTrack(distance);

        car.drive();
        System.out.println(car.distanceDriven());  // => 5
        System.out.println(car.batteryDrained());   // => false

        NeedForSpeed car1 = NeedForSpeed.nitro();
        car1.drive();
        System.out.println(car1.distanceDriven());  // => 50

        System.out.println(race.canCarFinish(car)); // => true
    }
}