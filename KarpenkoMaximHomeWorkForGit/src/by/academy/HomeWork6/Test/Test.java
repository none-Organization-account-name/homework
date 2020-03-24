package by.academy.HomeWork6.Test;

import by.academy.HomeWork6.Task2.CalculatorWithOperator;

import java.io.Serializable;
//Ou
public class Test {//для решений
    public static void main(String[] args) {
        System.out.println(extractionOfRoots(27, 0));
    }

    public static Serializable extractionOfRoots(double a, int b) {// don't work for negative number
        double c = 1;
        if (b % 2 != 0) {//степень не кратная двум, можно извлекать из любого числа кроме 0
            if (b == 0) {//число в степени 0 равно 1, кроме 0
            } else {//поиск корня методом подбора, степень не равна 0
                CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
                c = Math.abs(a);
                do {
                    c = c - 0.000001;
                } while (Math.round(calculatorWithOperator.exponentiation(c, Math.abs(b))) != Math.abs(a) && c != 0);
            }
            if (b < 0) {
                c = 1 / c;
            }
            if (a < 0) {
                c = c * (-1);
            }
            return c;
        } else if (b % 2 == 0 && a > 0) {//степень кратная двум, корень можно извлекать из положительных чисел
            if (b == 0) {//число в степени 0 равно 1, кроме 0
            } else {//поиск корня методом подбора, степень не равна 0
                CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
                c = a;
                do {
                    c = c - 0.000001;//при 0,1 из 27 не извлекает корень
                } while (Math.round(calculatorWithOperator.exponentiation(c, Math.abs(b))) != a && c != 0);
            }
            if (b < 0) {
                c = 1 / c;
            }
            return c;
        } else if (b==0 && a < 0) {
            return c;
        } else {//степень квадратная и число отрицательное или равно нулю
            return "To extract powers that are multiples of 2, the number must be positive";
        }
    }
}
