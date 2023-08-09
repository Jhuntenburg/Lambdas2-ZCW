import org.junit.Assert;
import org.junit.Test;

import java.time.Month;

import static org.junit.Assert.*;

public class PersonTest {

    @org.junit.Test
    public void getAgeTest() {
        int expected = 13;
        Person p = new Person();
        p.setBirthday(2010, Month.APRIL, 24);

        int actual = p.getAge();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void  getGenderTest(){
        Person.Sex expected = Person.Sex.FEMALE;
        Person p = new Person();
        p.setGender(expected);
        Person.Sex actual = p.getGender();
        Assert.assertEquals(expected,actual);
    }
}