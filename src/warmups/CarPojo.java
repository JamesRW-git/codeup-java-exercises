package warmups;

public class CarPojo {
    //Properties
    private String color;
    private int horsepower;
    private int numberDoors;
    private boolean isRunning;
    private int cost;
    private int numberOccupants;

    //Constructors
    public CarPojo() {}

    public CarPojo(String color, int horsepower, int numberDoors, boolean isRunning,
                   int cost, int numberOccupants) {
        this.color = color;
        this.horsepower = horsepower;
        this.numberDoors = numberDoors;
        this.isRunning = isRunning;
        this.cost = cost;
        this.numberOccupants = numberOccupants;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getNumberDoors() {
        return this.numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumberOccupants() {
        return this.numberOccupants;
    }

    public void setNumberOccupants(int numberOccupants) {
        this.numberOccupants = numberOccupants;
    }
}
