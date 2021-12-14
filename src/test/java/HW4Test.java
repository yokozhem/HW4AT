import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HW4Test {
    private static Logger logger = LoggerFactory.getLogger(HW4Test.class);
    @BeforeAll
    static void beforeAll(){
        System.out.println("Метод выполнится перед всеми тестами 1 раз ");
    }

    @Test
     @DisplayName("Позитивная проверка площади треугольника")
       void givenTreeSidesWhenAreaTriangleThenPositive(){
        logger.trace("trace log");
        logger.info("info log");
        logger.debug("debug log");

        Double result = HW4.areaTriangle(3,4,5);
        Assertions.assertEquals(result, 6);
    }

    @Test
    @DisplayName("Негативная проверка на невалидные значения сторон")
 void givenThreeSidesIsNotValidWhenAreaTriangleThenNegative(){
        logger.trace("trace log");
        logger.info("info log");
        logger.debug("debug log");

        Double result = HW4.areaTriangle(30,40, 5);
        Assertions.assertEquals(result, null);
    }
}


