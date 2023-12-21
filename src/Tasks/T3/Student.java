package Tasks.T3;

/**
 * Represents a student with specific attributes.
 */
public class Student {
    /**
     * The full name of the student.
     */
    private String fullName;

    /**
     * The age of the student.
     */
    private int age;

    /**
     * The group to which the student belongs.
     */
    private String group;

    /**
     * The points accumulated by the student.
     */
    private int points;

    /**
     * Constructs a student with the specified attributes.
     *
     * @param fullName The full name of the student.
     * @param age      The age of the student.
     * @param group    The group to which the student belongs.
     * @param points   The points accumulated by the student.
     */
    public Student(String fullName, int age, String group, int points) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
        this.points = points;
    }

    /**
     * Gets the full name of the student.
     *
     * @return The full name of the student.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Gets the age of the student.
     *
     * @return The age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the group to which the student belongs.
     *
     * @return The group of the student.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Gets the points accumulated by the student.
     *
     * @return The points accumulated by the student.
     */
    public int getPoints() {
        return points;
    }

    /**
     * Returns a string representation of the student.
     *
     * @return A string representation of the student.
     */
    @Override
    public String toString() {
        return "Student:" +
                "\n\tfullName='" + fullName + '\'' +
                "\n\tage=" + age +
                "\n\tgroup='" + group + '\'' +
                "\n\tpoints=" + points +
                "\n";
    }
}
