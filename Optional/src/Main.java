import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Properties;

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
    public static int readDuation(Properties props, String name){
        String value = props.getProperty(name);
        if(value!=null){
            try{
                int i= Integer.parseInt(value);
                if(i>0){
                    return i;
                }
            }
            catch (NumberFormatException e){}

        }
        return 0;
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