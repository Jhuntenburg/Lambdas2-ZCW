import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CheckPersonTest {

    @Test
    public void checkPersonWithLocalClass() {
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Joe Huntenburg", LocalDate.of(2010, Month.APRIL, 24), Person.Sex.MALE, "jhunt@gmail.com"));
//        listOfPeople.add(new Person());
        listOfPeople.add(new Person("Minsoo Jo", LocalDate.of(2020, Month.APRIL, 24), Person.Sex.MALE, "chef@gmail.com"));
        listOfPeople.add(new Person("Maggie Snyder", LocalDate.of(2010, Month.DECEMBER, 25), Person.Sex.FEMALE, "MS@gmail.com"));

        CheckPersonConcrete tester = new CheckPersonConcrete();

        System.out.println();
        Person.printPersons(listOfPeople, tester);
    }

    @Test
    public void checkNotPersonWithLocalClass() {

        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Joe Huntenburg", LocalDate.of(2010, Month.APRIL, 24), Person.Sex.MALE, "jhunt@gmail.com"));
        listOfPeople.add(new Person());
        listOfPeople.add(new Person("Minsoo Jo", LocalDate.of(2020, Month.APRIL, 24), Person.Sex.MALE, "chef@gmail.com"));
        listOfPeople.add(new Person("Maggie Snyder", LocalDate.of(2010, Month.DECEMBER, 25), Person.Sex.FEMALE, "MS@gmail.com"));

        CheckPersonConcrete tester = new CheckPersonConcrete();

        System.out.println();
        Person.printPersons(listOfPeople, tester);
    }
}

