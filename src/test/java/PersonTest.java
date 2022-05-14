import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {
    @DataProvider(name = "isTeenagerProvider")
    Object [][] dataProvider() {
        return new Object[][] {
                {5, false},
                {12, false},
                {13, true},
                {16, true},
                {19, true},
                {20, false},
                {30, false}
        };
    }

    @Test(dataProvider = "isTeenagerProvider")
    void testIsTeenager(int age, boolean expected) {
        boolean result = Person.isTeenager(age);
        System.out.println(result);
        assertEquals(result, expected);
    }
}
