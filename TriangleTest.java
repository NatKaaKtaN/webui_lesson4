import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.geom.Area;

public class TriangleTest {

    @Test
    void countAreaTriangleTest() throws Exception {
        Assertions.assertEquals(11.61895003862225, AreaTriangle.countAreaTriangle(4, 6, 8));
    }

    @Test
    void triangleParamTest() {
        Assertions.assertThrows(Exception.class, () -> AreaTriangle.countAreaTriangle(1, 6, 8));
    }

    @Test
    void triangleNegativParamTest() {
        Assertions.assertThrows(Exception.class, () -> AreaTriangle.countAreaTriangle(4, -6, 8));
    }

    @ParameterizedTest
    @ValueSource(doubles = {5.43, 9, 2, 1, -7, 12.07, 87})
    void triangleTest(double number, double expected)throws Exception {
        double result = AreaTriangle.countAreaTriangle(number,number,number);
        Assertions.assertEquals(expected, result);
    }
    // подскажите, что не так в последнем методе, выдает:
    //org.junit.jupiter.api.extension.ParameterResolutionException: No ParameterResolver registered for parameter [double arg1] in method [void TriangleTest.triangleTest(double,double) throws java.lang.Exception]
}
