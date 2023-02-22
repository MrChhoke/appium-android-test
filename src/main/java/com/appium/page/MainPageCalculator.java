package com.appium.page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainPageCalculator {

    protected AndroidDriver driver;

    protected final By digitZeroButton = By.id("com.google.android.calculator:id/digit_0");
    protected final By digitOneButton = By.id("com.google.android.calculator:id/digit_1");
    protected final By digitTwoButton = By.id("com.google.android.calculator:id/digit_2");
    protected final By digitThreeButton = By.id("com.google.android.calculator:id/digit_3");
    protected final By digitFourButton = By.id("com.google.android.calculator:id/digit_4");
    protected final By digitFiveButton = By.id("com.google.android.calculator:id/digit_5");
    protected final By digitSixButton = By.id("com.google.android.calculator:id/digit_6");
    protected final By digitSevenButton = By.id("com.google.android.calculator:id/digit_7");
    protected final By digitEightButton = By.id("com.google.android.calculator:id/digit_8");
    protected final By digitNineButton = By.id("com.google.android.calculator:id/digit_9");

    protected final By operationPlusButton = By.id("com.google.android.calculator:id/op_add");
    protected final By operationMinusButton = By.id("com.google.android.calculator:id/op_sub");
    protected final By operationMultiplyButton = By.id("com.google.android.calculator:id/op_mul");
    protected final By operationDivideButton = By.id("com.google.android.calculator:id/op_div");

    protected final By formulaField = By.id("com.google.android.calculator:id/formula");
    protected final By calculateButton = By.id("com.google.android.calculator:id/eq");

    public MainPageCalculator(AndroidDriver driver) {
        this.driver = driver;
    }


    public void clickDigitOne(){
        driver.findElement(digitOneButton).click();
    }

    public void clickDigitTwo(){
        driver.findElement(digitTwoButton).click();
    }

    public void clickDigitThree(){
        driver.findElement(digitThreeButton).click();
    }

    public void clickDigitFour(){
        driver.findElement(digitFourButton).click();
    }

    public void clickDigitFive(){
        driver.findElement(digitFiveButton).click();
    }

    public void clickDigitSix(){
        driver.findElement(digitSixButton).click();
    }

    public void clickDigitSeven(){
        driver.findElement(digitSevenButton).click();
    }

    public void clickDigitEight(){
        driver.findElement(digitEightButton).click();
    }

    public void clickDigitNine(){
        driver.findElement(digitNineButton).click();
    }

    public void clickZero(){
        driver.findElement(digitZeroButton).click();
    }

    public void clickPlus() {
        driver.findElement(operationPlusButton).click();
    }

    public void clickMinus() {
        driver.findElement(operationMinusButton).click();
    }


    public void clickMultiply() {
        driver.findElement(operationMultiplyButton).click();
    }


    public void clickDivide() {
        driver.findElement(operationDivideButton).click();
    }

    public String getFormula(){
        return driver.findElement(formulaField).getText();
    }

    public void clickCalculate(){
        driver.findElement(calculateButton).click();
    }

    public double getResultCalculation() {
        var element = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        return Double.parseDouble(element.getText()
                .replace("=", "")
                .replace(",", ".")
        );
    }
}
