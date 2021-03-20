package task1;

public class Car {
    private String name;
    private String typeCar;

    public Car(String name, String typeCar) {
        this.name = name;
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car with name " + name + '\'' +
                ", and typeCar " + typeCar;
    }
}
