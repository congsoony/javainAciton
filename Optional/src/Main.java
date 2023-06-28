import javax.swing.text.html.Option;
import java.util.Optional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        Optional<Person> optPerson = Optional.of(p);
        String name = optPerson.flatMap(Person::getCar).flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknow");
    }
}
class Person{
    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }
}
class Car{
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}

class Insurance{
    private String name;
    public String getName(){return name;}
}