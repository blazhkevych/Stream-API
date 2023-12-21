package Tasks.T1;

/**
 * Represents a car with specific attributes.
 */
public class Car {
    /**
     * The name of the car.
     */
    private String name;

    /**
     * The color of the car.
     */
    private String color;

    /**
     * The maximum speed of the car.
     */
    private int maxSpeed;

    /**
     * Constructs a car with the specified attributes.
     *
     * @param name     The name of the car.
     * @param color    The color of the car.
     * @param maxSpeed The maximum speed of the car.
     */
    public Car(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Gets the name of the car.
     *
     * @return The name of the car.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the color of the car.
     *
     * @return The color of the car.
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the maximum speed of the car.
     *
     * @return The maximum speed of the car.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Returns a string representation of the car.
     *
     * @return A string representation of the car.
     */
    @Override
    public String toString() {
        return "Car:" +
                "\n\tname='" + name + '\'' +
                "\n\tcolor='" + color + '\'' +
                "\n\tmaxSpeed=" + maxSpeed +
                "\n";
    }
}