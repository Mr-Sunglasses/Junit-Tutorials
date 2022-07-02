import org.example.MathsUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsUtilsTest {

    @Test
    void test(){
        MathsUtils mathsUtils = new MathsUtils();
        int expected = 22;
        int actual = mathsUtils.add(11,11);
        assertEquals(expected, actual);
    }
}
