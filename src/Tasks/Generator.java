package Tasks;

import Tasks.T1.Car;
import Tasks.T2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Utility class for generating lists of cars and students.
 */
public class Generator {

    // Array to store possible car names
    private final List<String> carNames = Stream.of("Volvo", "BMW", "Ford", "Mazda",
                    "Mercedes", "Audi", "Toyota", "Honda", "Lexus", "Nissan",
                    "Volkswagen", "Hyundai", "Kia", "Chevrolet", "Skoda",
                    "Opel", "Renault", "Peugeot", "Citroen", "Fiat",
                    "Jeep", "Subaru", "Mitsubishi", "Porsche", "Jaguar",
                    "Land Rover", "Maserati", "Bentley", "Aston Martin",
                    "Lamborghini", "Bugatti", "Ferrari", "Rolls-Royce",
                    "Alfa Romeo", "Dodge", "Chrysler", "Infiniti", "Tesla",
                    "Lotus", "Suzuki", "Seat", "Mini", "Smart", "Dacia",
                    "Daewoo", "Lada", "ZAZ", "GAZ", "Moskvich", "UAZ",
                    "ZIL", "KAMAZ", "MAZ", "KrAZ", "BelAZ", "Izh", "Zaporozhets",
                    "Tavria", "LuAZ", "Bogdan", "Zastava", "Yugo", "Wartburg",
                    "Trabant", "Lancia", "Rover", "Saab", "Volga", "Tatra",
                    "Trabant", "Wartburg", "Zastava", "Yugo", "Lancia",
                    "Rover", "Saab", "Volga", "Tatra", "Trabant", "Wartburg")
            .collect(Collectors.toCollection(ArrayList::new));

    // Array to store possible car colors
    private final List<String> carColors = Stream.of("Red", "Green", "Blue", "Yellow",
                    "Black", "White", "Grey", "Silver", "Brown", "Orange", "Purple", "Pink",
                    "Gold", "Beige", "Bronze", "Cyan", "Lime", "Magenta", "Olive", "Teal",
                    "Turquoise", "Violet", "Maroon", "Navy", "Indigo", "Aquamarine", "Azure",
                    "Coral", "Crimson", "Fuchsia", "Khaki", "Lavender", "Lemon", "Lilac"
            )
            .collect(Collectors.toCollection(ArrayList::new));

    // Array to store possible car maximum speeds (in km/h) from 100 to 400
    private final List<Integer> carMaxSpeeds = Stream.iterate(100, i -> i + 1).limit(301).collect(Collectors.toCollection(ArrayList::new));

    // Static method to generate a list of 100 cars
    public static List<Car> generateCars() {
        Generator generator = new Generator();
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cars.add(new Car(generator.carNames.get((int) (Math.random() * generator.carNames.size())),
                    generator.carColors.get((int) (Math.random() * generator.carColors.size())),
                    generator.carMaxSpeeds.get((int) (Math.random() * generator.carMaxSpeeds.size()))));
        }
        return cars;
    }

    // Array to store possible full names of students
    private final List<String> studentFullNames = Stream.of("Тарас Григорович Шевченко", "Леся Петрівна Курбас", "Іван Франкович Франко",
                    "Олена Петрівна Теліга", "Михайло Сергійович Грушевський", "Лариса Петрівна Косач-Квітка", "Павло Ігорович Тичина",
                    "Леонтій Левович Коцюбинський", "Марія Михайлівна Заньковецька", "Володимир Васильович Винниченко", "Іван Михайлович Сирко",
                    "Марина Іванівна Цвєтаєва", "Микола Олександрович Амосов", "Софія Яковлівна Русова", "Іван Семенович Нечуй-Левицький",
                    "Ольга Федорівна Кобилянська", "Максим Гордійович Кривенко", "Сергій Олександрович Корольов",
                    "Валентина Василівна Терешкова", "Степан Григорович Кондратюк", "Богдан Михайлович Хмельницький", "Євгенія Іванівна Шовкопляс",
                    "Олександр Сергійович Пушкін", "Ліна Василівна Костенко", "Богдан Зиновійович Ступка", "Марія Омелянівна Кравченко",
                    "Іван Андрійович Гончар", "Софія Пантеліївна Ротару", "Іван Якович Мазепа", "Маргарита Данилівна Турбова",
                    "Валерій Антонович Лобановський", "Катерина Миколаївна Білокур", "Борис Олексійович Патон", "Наталія Михайлівна Ужвій",
                    "Артем Володимирович Франков", "Марія Іванівна Литвиненко", "Григір Іванович Сковорода", "Марія Іллівна Крупник",
                    "Олександр Олександрович Барвінський", "Катерина Петрівна Білокур", "Петро Петрович Вергун", "Олександр Іванович Лищук",
                    "Євген Петрович Гребінка", "Марія Євгенівна Калиновська", "Петро Йосипович Яцик", "Марія Ігорівна Заньковецька",
                    "Григір Опанасович Тютюнник", "Валентина Миколаївна Терешкова", "Святослав Всеволодович Ріхтер", "Іван Олександрович Гончар",
                    "Ольга Олександрівна Кобилянська", "Олександр Дмитрович Зіневич", "Олена Василівна Теліга", "Артем Валерійович Аваков",
                    "Любов Олександрівна Брусова", "Артур Янович Відаль", "Олена Іванівна Пчілка", "Володимир Іванович Самойленко",
                    "Олександр Васильович Сухомлинський", "Лідія Петрівна Іванченко", "Святослав Всеволодович Ріхтер", "Марія Ігорівна Заньковецька",
                    "Григір Опанасович Тютюнник", "Валентина Миколаївна Терешкова", "Святослав Всеволодович Ріхтер", "Іван Олександрович Гончар",
                    "Ольга Олександрівна Кобилянська", "Олександр Дмитрович Зіневич", "Олена Василівна Теліга", "Артем Валерійович Аваков",
                    "Любов Олександрівна Брусова", "Артур Янович Відаль", "Олена Іванівна Пчілка", "Володимир Іванович Самойленко",
                    "Олександр Васильович Сухомлинський")
            .collect(Collectors.toCollection(ArrayList::new));

    // Method to return a random age from 10 to 100 years
    private int generateAge() {
        return (int) (Math.random() * 91 + 10);
    }

    // Method to return a random alphanumeric string of length 5
    private String generateGroup() {
        String group = "";
        for (int i = 0; i < 5; i++) {
            group += (char) (Math.random() * 26 + 65);
        }
        return group;
    }

    // Static method to generate a list of 100 students
    public static List<Student> generateStudents() {
        Generator generator = new Generator();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(new Student(
                    generator.studentFullNames.get((int) (Math.random() * generator.studentFullNames.size())),
                    generator.generateAge(),
                    generator.generateGroup()));
        }
        return students;
    }

    // Static method to generate a list of 100 students with points (grades) from 1 to 12
    public static List<Tasks.T3.Student> generateStudentsWithPoints() {
        Generator generator = new Generator();
        List<Tasks.T3.Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(new Tasks.T3.Student(
                    generator.studentFullNames.get((int) (Math.random() * generator.studentFullNames.size())),
                    generator.generateAge(),
                    generator.generateGroup(),
                    (int) (Math.random() * 12 + 1)));
        }
        return students;
    }
}