class NeedForSpeed {

    int speed;
    int batteryDrain;
    int distanceDriven = 0;
    int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public void drive() {
        if (this.battery < this.batteryDrain) {
            this.distanceDriven = 0;
        } else {
            this.distanceDriven += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public boolean batteryDrained() {
        if (this.battery == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canCarFinish(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        if (car.distanceDriven() >= this.distance) {
            return true;
        } else {
            return false;
        }
    }
}
