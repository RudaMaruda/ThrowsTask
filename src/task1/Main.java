package task1;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Polo","osobowe");
        Car car2 = new Car("Volvo","ciezarowe");

       Bridge tiltBridge = new Bridge();

        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tiltBridge.driveThrough(car1);
            }
        });

        Thread myThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tiltBridge.driveThrough(car2);
            }
        });


        myThread1.start();
        myThread2.start();



    }
}
