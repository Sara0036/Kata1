package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.parse("2000-06-03");
        Person person = new Person("Sara",nacimiento);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}
