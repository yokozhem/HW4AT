import org.junit.jupiter.api.*;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.logging.Logger;


public class HW4Test {
    @Test
     @DisplayName("Позитивная проверка площади треугольника")
    void givenTreeSidesWhenAreaTriangleThenPositive(){
        Double result = HW4.areaTriangle(3,4,5);
        Assertions.assertEquals(result, 6);
    }

    @Test
    @DisplayName("Негативная проверка на невалидные значения сторон")
 void givenThreeSidesIsNotValidWhenAreaTriangleThenNegative(){
        Double result = HW4.areaTriangle(30,40, 5);
        Assertions.assertEquals(result, null);
    }


    //public static Logger logger = (Logger) LoggerFactory.getLogger(HW4Test.class);
}


