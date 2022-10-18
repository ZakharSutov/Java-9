import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class LambdaDemoTest {
    @Test
    public void lengthStringTest() {
        Assert.assertEquals(Optional.of(3), Optional.of(LambdaRunner.biFunction(LambdaDemo.length, "123")));
    }

    @Test
    public void firstCharTest() {
        Assert.assertEquals(Optional.of('t'), Optional.of(LambdaRunner.biFunction(LambdaDemo.firstChar, "test")));
        Assert.assertNull(LambdaRunner.biFunction(LambdaDemo.firstChar, ""));
        Assert.assertNull(LambdaRunner.biFunction(LambdaDemo.firstChar, null));
    }

    @Test
    public void isSpaceTest() {
        Assert.assertFalse(LambdaRunner.biFunction(LambdaDemo.isNotSpace, "a b"));
    }

    @Test
    public void countWordsTest() {
        Assert.assertEquals(Optional.of(3), Optional.of(LambdaRunner.biFunction(LambdaDemo.countWords, "a,b,c")));
        Assert.assertEquals(Optional.of(3), Optional.of(LambdaRunner.biFunction(LambdaDemo.countWords, "a,,,,b,,,,,c")));
        Assert.assertEquals(Optional.of(3), Optional.of(LambdaRunner.biFunction(LambdaDemo.countWords, ",,a,,,,b,,,,,c")));
        Assert.assertEquals(Optional.of(3), Optional.of(LambdaRunner.biFunction(LambdaDemo.countWords, "a,,,,b,,,,,c,")));
    }

    @Test
    public void getAgeTest() {
        Assert.assertEquals(Optional.of(18), Optional.of(
                LambdaRunner.biFunction(LambdaDemo.getAge, new Human("Avdoyan", "Rustam", "Ruslanovich", 18, Sex.MALE))));
    }

    @Test
    public void isEqualLastNameTest() {
        Assert.assertTrue(LambdaRunner.tripleFunction(LambdaDemo.isEqualLastName, new Human("Avdoyan", "Rustam", "Ruslanovich", 10, Sex.MALE),
                        new Human("Avdoyan", "Rustam", "Ruslanovich", 18, Sex.MALE)
                )
        );
    }

    @Test
    public void getFullNameTest() {
        Assert.assertEquals("Avdoyan Rustam Ruslanovich",
                LambdaRunner.biFunction(LambdaDemo.getFullName, new Human("Avdoyan", "Rustam", "Ruslanovich", 18, Sex.MALE))
        );
    }

    @Test
       public void addYearToHumanTest() {
        Assert.assertEquals(new Human("Avdoyan", "Rustam", "Ruslanovich", 19, Sex.MALE),
                LambdaRunner.biFunction(LambdaDemo.addYearToHuman, new Human("Avdoyan", "Rustam", "Ruslanovich", 18, Sex.MALE)
        ));
    }

    @Test
    public void isAgesLowerMaxAgesTest() {
        Assert.assertTrue(LambdaRunner.iOperation(LambdaDemo.isAgesLowerMaxAges, new Human("Avdoyan", "Rustam", "Ruslanovich", 18, Sex.MALE),
                new Human("Ivanov", "Roman", "Ilych", 6, Sex.FEMALE),
                new Human("Sivov", "Alex", "Dmitrievich", 42, Sex.MALE)
                , 50
        ));
    }

}
