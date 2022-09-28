package kata1;


import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    
    private LocalDate birthdate;

    
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    
    public int getAge(){
        LocalDate hoy = LocalDate.now();
        Period period = Period.between(birthdate,hoy);
        return (period.getYears());
    }
}

