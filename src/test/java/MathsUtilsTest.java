import org.example.MathsUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsUtilsTest {

    @Test
    void test_add(){
        MathsUtils mathsUtils = new MathsUtils();
        int expected = 23;
        int actual = mathsUtils.add(11,12);
        assertEquals(expected,actual,"This test is for add two number a , b");


    }

    @Test
    void test_sub(){
        MathsUtils mathsUtils = new MathsUtils();
        int expected = 22;
        int actual_sub = mathsUtils.sub(33,11);
        assertEquals(expected,actual_sub);
    }

}
