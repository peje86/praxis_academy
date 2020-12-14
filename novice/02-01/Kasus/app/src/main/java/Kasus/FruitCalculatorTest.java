package Kasus;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FruitCalculatorTest {
    @Test
    @Tag("add")
    void addFruitTestTag1() {
        System.out.println("FruitCalculatorTest.addFruitTestTag1");
        FruitCalculator fruitCalculator = new FruitCalculator();
        assertEquals(2, fruitCalculator.addFruit(1, 1), "1 fruit + 1 fruit is 2 fruit");
    }

    @Test
    @Tag("sub")
    void subFruitTestTag1() {
        System.out.println("FruitCalculatorTest.subFruitTestTag1");
        FruitCalculator fruitCalculator = new FruitCalculator();
        assertEquals(1, fruitCalculator.subFruit(2, 1), "2 fruit - 1 fruit is 1 fruit");
    }
}