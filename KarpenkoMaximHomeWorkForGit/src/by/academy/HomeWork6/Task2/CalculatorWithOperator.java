package by.academy.HomeWork6.Task2;

import java.io.Serializable;

public class CalculatorWithOperator {
    public double division(double firstVariable, double secondVariable) {
        double result = firstVariable / secondVariable;
        return result;
    }

    public double multiplication(double firstVariable, double secondVariable) {
        double result = firstVariable * secondVariable;
        return result;
    }

    public double summation(double firstVariable, double secondVariable) {
        double result = firstVariable + secondVariable;
        return result;
    }

    public double subtraction(double firstVariable, double secondVariable) {
        double result = firstVariable - secondVariable;
        return result;
    }

    public double exponentiation(double number, int degree) {
        double result = 1;
        if (degree != 0) {
            for (int i = 0; i < numberModule(degree); i++) {//Math.abs
                result = result * number;
            }
        }
        if (degree < 0) {
            result = 1 / result;
        }
        return result;
    }

    public double numberModule(double number) {
        double result;
        if (number < 0) {
            result = -1 * number;
        } else {
            result = number;
        }
        return result;
    }


    public  Serializable extractionOfRoots(double number, int degreeOfTheRoot) {
        double result = 1;
        if (degreeOfTheRoot % 2 != 0) {//a degree that is not a multiple of two , can be extracted from any number other than 0
            if (degreeOfTheRoot == 0) {//a number to the degree of 0 is equal to 1, except 0
            } else {//search for the root by matching, the degree is not equal to 0
                CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
                result = numberModule(number);//Math.abs
                do {
                    result = result - 0.000001;
                } while (Math.round(calculatorWithOperator.exponentiation(result, (int)numberModule(degreeOfTheRoot))) != numberModule(number) && result != 0);//Math.abs
            }
            if (degreeOfTheRoot < 0) {
                result = 1 / result;
            }
            if (number < 0) {
                result = result * (-1);
            }
            return result;
        } else if (degreeOfTheRoot % 2 == 0 && number > 0) {// degree multiple of two , the root can be extracted from positive numbers
            if (degreeOfTheRoot == 0) {/// / a number to the degree of 0 is equal to 1, except for the number 0
            } else {//search for the root by matching, the degree is not equal to 0
                CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
                result = number;
                do {
                    result = result - 0.000001;//by step 0.1 the root is not extracted from 27
                } while (Math.round(calculatorWithOperator.exponentiation(result, (int)numberModule(degreeOfTheRoot))) != number && result != 0);//Math.abs
            }
            if (degreeOfTheRoot < 0) {
                result = 1 / result;
            }
            return result;
        } else if (degreeOfTheRoot == 0 && number != 0) {
            return result;
        } else {//the degree is a multiple of two and the number is negative or equal to zero
            return "To extract degree that are multiples of 2, the number must be positive or not equal to zero";
        }
    }


}




