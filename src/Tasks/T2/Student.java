package Tasks.T2;

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
     * Constructs a student with the specified attributes.
     *
     * @param fullName The full name of the student.
     * @param age      The age of the student.
     * @param group    The group to which the student belongs.
     */
    public Student(String fullName, int age, String group) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
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
                "\n";
    }
}