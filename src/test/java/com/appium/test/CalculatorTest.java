package com.appium.test;

import com.appium.action.CalculatorMainAction;
import com.appium.config.AndroidBaseTestConfiguration;
import com.appium.page.MainPageCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest extends AndroidBaseTestConfiguration {

    @Test
    public void simpleTest(){
        CalculatorMainAction calculator = new CalculatorMainAction(new MainPageCalculator(driver));
        calculator.enterFormula("1234+4321");
        calculator.calculate();
        assertEquals(5555, calculator.getResult());
    }

}
