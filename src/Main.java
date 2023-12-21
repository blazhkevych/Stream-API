import Tasks.Generator;
import Tasks.T1.Car;
import Tasks.T2.Student;
import Tasks.T4.Employee;

import java.util.List;

public class Main {

    /**
     * Test method for the Car class.
     */
    public static void testCar() {
        System.out.print("/ / / ".repeat(10));
        System.out.print("testCar Start ");
        System.out.println("/ / / ".repeat(10));

        // Create a list of 100 different cars.
        List<Car> cars = Generator.generateCars();
        System.out.println("List of 100 different cars:");
        System.out.println(cars);

        System.out.println("* * * ".repeat(20));

        // Use stream API to find the fastest red car.
        Car fastestRedCar = cars.stream()
                .filter(car -> car.getColor().equals("Red"))
                .max((car1, car2) -> car1.getMaxSpeed() - car2.getMaxSpeed())
                .orElse(null);
        System.out.println("The fastest red car:");
        System.out.println(fastestRedCar);

        System.out.print("/ / / ".repeat(10));
        System.out.print("testCar End ");
        System.out.println("/ / / ".repeat(10));
    }

    /**
     * Test method for the Student class.
     */
    public static void testStudent() {
        System.out.print("/ / / ".repeat(10));
        System.out.print("testStudent Start ");
        System.out.println("/ / / ".repeat(10));

        // Create a list of 100 different students.
        List<Student> students = Generator.generateStudents();

        System.out.println("List of 100 different students:");
        System.out.println(students);

        System.out.println("* * * ".repeat(20));

        // Use stream API to find the surnames (last names only) of all students younger than 16.
        // Assume that the surname of a student is the last word in their full name.
        String surnamesOfStudentsYoungerThan16 = students.stream()
                .filter(student -> student.getAge() < 16)
                .map(student -> student.getFullName().split(" ")[2])
                .toList()
                .toString();

        System.out.println("Surnames of all students younger than 16:");
        System.out.println(surnamesOfStudentsYoungerThan16);

        System.out.print("/ / / ".repeat(10));
        System.out.print("testStudent End ");
        System.out.println("/ / / ".repeat(10));
    }

    /**
     * Test method for the Student class with points.
     */
    public static void testStudentWithPoints() {
        System.out.print("/ / / ".repeat(10));
        System.out.print("testStudentWithPoints Start ");
        System.out.println("/ / / ".repeat(10));

        // Create a list of 100 different students with points.
        List<Tasks.T3.Student> students = Generator.generateStudentsWithPoints();

        System.out.println("List of 100 different students with points:");
        System.out.println(students);

        System.out.println("* * * ".repeat(20));

        // Use stream API to find the average points of all students (see reduce, map).
        double averagePoints = students.stream()
                .mapToInt(Tasks.T3.Student::getPoints)
                .average()
                .orElse(0);

        System.out.println("Average points of all students:");
        System.out.println(averagePoints);

        System.out.print("/ / / ".repeat(10));
        System.out.print("testStudentWithPoints End ");
        System.out.println("/ / / ".repeat(10));
    }

    /**
     * Test method for the Employee class.
     */
    public static void testEmployee() {
        System.out.print("/ / / ".repeat(10));
        System.out.print("testEmployee Start ");
        System.out.println("/ / / ".repeat(10));

        // Create a list of 100 different students.
        List<Student> students = Generator.generateStudents();

        System.out.println("List of 100 different students:");
        System.out.println(students);

        System.out.println("* * * ".repeat(20));

        // Use stream API to transform the list of students into a list of employees.
        List<Employee> employees = students.stream()
                .map(student -> new Employee(
                        student.getFullName().split(" ")[0],
                        student.getFullName().split(" ")[2],
                        student.getFullName().split(" ")[1],
                        student.getAge()))
                .toList();

        System.out.println("Transform the list of students into a list of employees:");
        System.out.println(employees);

        System.out.print("/ / / ".repeat(10));
        System.out.print("testEmployee End ");
        System.out.println("/ / / ".repeat(10));
    }

    /**
     * Main method to run all test methods.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        testCar();
        testStudent();
        testStudentWithPoints();
        testEmployee();
    }
}