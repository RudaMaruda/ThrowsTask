package task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Bridge {
    synchronized public void driveThrough(Car car){


        System.out.println(" Car " + car.toString() + " is start driving through the bridge");


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        System.out.print(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
        System.out.println(" Car with name "+car.toString()+ " is drive through");


    }
}
