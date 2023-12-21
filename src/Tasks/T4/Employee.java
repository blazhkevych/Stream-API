package Tasks.T4;

/**
 * Class representing an employee with specific attributes.
 */
public class Employee {
    /**
     * The name of the employee.
     */
    private String name;

    /**
     * The surname of the employee.
     */
    private String surname;

    /**
     * The patronymic (middle name) of the employee.
     */
    private String patronymic;

    /**
     * The age of the employee.
     */
    private int age;

    /**
     * Constructs an employee with the specified attributes.
     *
     * @param name       The name of the employee.
     * @param surname    The surname of the employee.
     * @param patronymic The patronymic (middle name) of the employee.
     * @param age        The age of the employee.
     */
    public Employee(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    /**
     * Gets the name of the employee.
     *
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the surname of the employee.
     *
     * @return The surname of the employee.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets the patronymic of the employee.
     *
     * @return The patronymic of the employee.
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Gets the age of the employee.
     *
     * @return The age of the employee.
     */
    public int getAge() {
        return age;
    }

    /**
     * Overrides the toString() method to provide a string representation of the employee.
     *
     * @return A string representation of the employee.
     */
    @Override
    public String toString() {
        return "Employee:" +
                "\n\tname='" + name + '\'' +
                "\n\tsurname='" + surname + '\'' +
                "\n\tpatronymic='" + patronymic + '\'' +
                "\n\tage=" + age +
                "\n";
    }
}