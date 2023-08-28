import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Person(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class SecretaryProgram {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Вася", "Пупкин", "987654"));
        personList.add(new Person("Петя", "Пупкин", "987987"));
        personList.add(new Person("Вася", "Пенков", "123456"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию для поиска: ");
        String searchLastName = scanner.nextLine().toLowerCase();

        List<Person> foundPersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getFullName().toLowerCase().contains(searchLastName)) {
                foundPersons.add(person);
            }
        }

        if (foundPersons.isEmpty()) {
            System.out.println("Нет совпадений");
        } else {
            System.out.println("Результаты поиска:");
            for (Person person : foundPersons) {
                System.out.println("Имя: " + person.getFullName() + ", Номер телефона: " + person.getPhoneNumber());
            }
        }
    }
}
