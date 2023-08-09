import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Joe Huntenburg", LocalDate.of(2010, Month.APRIL, 24), Person.Sex.MALE, "jhunt@gmail.com"));
        listOfPeople.add(new Person());
        listOfPeople.add(new Person("Minsoo Jo", LocalDate.of(2020, Month.APRIL, 24), Person.Sex.MALE, "chef@gmail.com"));
        listOfPeople.add(new Person("Maggie Snyder", LocalDate.of(2010, Month.DECEMBER, 25), Person.Sex.FEMALE, "MS@gmail.com"));

        printing(listOfPeople, new CheckPersonConcrete());
        CheckPerson checkPersonAnonymous= new CheckPerson(){
            public boolean test(Person p){
                return (p.getAge() != -1 || p.getGender()!=null);
            }

        };
        printing(listOfPeople, checkPersonAnonymous);

        printing(listOfPeople, (Person p) -> p.getAge() != -1 || p.getGender()!=null);
    }

//    lamda




    public static void printing(List<Person> people, CheckPerson tester){
        System.out.println();
        Person.printPersons(people, tester);
    }
}
