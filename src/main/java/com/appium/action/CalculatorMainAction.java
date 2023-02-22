package com.appium.action;

import com.appium.page.MainPageCalculator;

public class CalculatorMainAction {

    protected MainPageCalculator mainPageCalculator;

    public CalculatorMainAction(MainPageCalculator mainPageCalculator) {
        this.mainPageCalculator = mainPageCalculator;
    }

    public void enterFormula(String formula){
        for(Character character : formula.toCharArray()){
            switch (character){
                case ' ' -> {}
                case '+' -> mainPageCalculator.clickPlus();
                case '-' -> mainPageCalculator.clickMinus();
                case '*' -> mainPageCalculator.clickMultiply();
                case '/' -> mainPageCalculator.clickDivide();
                default -> {
                    if(Character.isDefined(character)){
                        clickNum(character);
                        break;
                    }

                    throw new IllegalArgumentException("Unknown argument: " + character);
                }
            }
        }
    }

    public void enterNumber(String number){
        for(Character digit : number.toCharArray()) {
            clickNum(digit);
        }
    }

    public void clickNum(Character num){
        switch (num){
            case '1' -> mainPageCalculator.clickDigitOne();
            case '2' -> mainPageCalculator.clickDigitTwo();
            case '3' -> mainPageCalculator.clickDigitThree();
            case '4' -> mainPageCalculator.clickDigitFour();
            case '5' -> mainPageCalculator.clickDigitFive();
            case '6' -> mainPageCalculator.clickDigitSix();
            case '7' -> mainPageCalculator.clickDigitSeven();
            case '8' -> mainPageCalculator.clickDigitEight();
            case '9' -> mainPageCalculator.clickDigitNine();
            case '0' -> mainPageCalculator.clickZero();
            default -> throw new IllegalArgumentException(num + " is not a number");
        }
    }

    public void calculate(){
        mainPageCalculator.clickCalculate();
    }

    public double getResult(){
        return mainPageCalculator.getResultCalculation();
    }
}
