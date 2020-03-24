package by.academy.HomeWork6;

import by.academy.HomeWork6.Task1.Task1;
import by.academy.HomeWork6.Task2.CalculatorWithOperator;

public class Main {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        System.out.println(task1.sleepIn(false,false)+"  "+task1.sleepIn(true,false)+"  "+task1.sleepIn(false,true));
        System.out.println(task1.diff21(19)+"  "+task1.diff21(10)+"  "+task1.diff21(21));
        System.out.println(task1.nearHundred(93)+"  "+task1.nearHundred(89)+"  "+task1.nearHundred(90));
        System.out.println(task1.missingChar("kitten",1)+"  "+task1.missingChar("kitten",0)+"  "+task1.missingChar("kitten",4));
        System.out.println(task1.backAround("cat")+"  "+task1.backAround("Hello")+"  "+task1.backAround("a"));
        System.out.println(task1.startHi("hi there")+"  "+task1.startHi("hi")+"  "+task1.startHi("hello hi"));
        System.out.println(task1.hasTeen(13,20,10)+"  "+task1.hasTeen(20,19,10)+"  "+task1.hasTeen(20,10,13));
        System.out.println(task1.mixStart("mix snacks")+"  "+task1.mixStart("pix snacks")+"  "+task1.mixStart("piz snacks"));
        System.out.println(task1.close10(8,13)+"  "+task1.close10(13,8)+"  "+task1.close10(13,7));
        System.out.println(task1.stringE("Hello")+"  "+task1.stringE("Heelle")+"  "+task1.stringE("Heelele"));
        System.out.println(task1.everyNth("Miracle", 2)+"  "+task1.everyNth("abcdefg", 2)+"  "+task1.everyNth("abcdefg", 3));
        System.out.println(task1.monkeyTrouble(true, true)+"  "+task1.monkeyTrouble(false, false)+"  "+task1.monkeyTrouble(true, false));
        System.out.println(task1.parrotTrouble(true, 6)+"  "+task1.parrotTrouble(true, 7)+"  "+task1.parrotTrouble(false, 6));
        System.out.println(task1.posNeg(1, 1, false)+"  "+task1.posNeg(-1, 1, false)+"  "+task1.posNeg(-4, -5, true));
        System.out.println(task1.frontBack("code")+"  "+task1.frontBack("super-abra-kadabra")+"  "+task1.frontBack("abc"));
        System.out.println(task1.or35(-3)+"  "+task1.or35(10)+"  "+task1.or35(8));
        System.out.println(task1.icyHot(120,-1)+"  "+task1.icyHot(-1,120)+"  "+task1.icyHot(2,120));
        System.out.println(task1.loneTeen(13,99)+"  "+task1.loneTeen(21,19)+"  "+task1.loneTeen(13,13));
        System.out.println(task1.startOz("ozymandias") +"  "+task1.startOz("bzoo")+"  "+task1.startOz("oxx"));
        System.out.println(task1.in3050(30,31)+"  "+task1.in3050(30,41)+"  "+task1.in3050(40,50));
        System.out.println(task1.lastDigit(-7,17)+"  "+task1.lastDigit(6,17)+"  "+task1.lastDigit(3,113));
        System.out.println(task1.sumDouble(1,2)+"  "+task1.sumDouble(2,3)+"  "+task1.sumDouble(2,2));
        System.out.println(task1.makes10(9,10)+"  "+task1.makes10(9,9)+"  "+task1.makes10(1,9));
        System.out.println(task1.notString("candy")+"  "+task1.notString("x")+"  "+task1.notString("not bad"));
        System.out.println(task1.front3("Java")+"  "+task1.front3("Chocolate")+"  "+task1.front3("abc"));
        System.out.println(task1.front22("kitten")+"  "+task1.front22("Ha")+"  "+task1.front22("abc"));
        System.out.println(task1.in1020(12,99)+"  "+task1.in1020(21,12)+"  "+task1.in1020(8,99));
        System.out.println(task1.delDel("adelbc")+"  "+task1.delDel("adelHello")+"  "+task1.delDel("adedbc"));
        System.out.println(task1.intMax(1,2,3)+"  "+task1.intMax(1,3,2)+"  "+task1.intMax(3,2,1));
        System.out.println(task1.max1020(11,19)+"  "+task1.max1020(19,11)+"  "+task1.max1020(11,9));
        System.out.println(task1.endUp("Hello")+"  "+task1.endUp("hi there")+"  "+task1.endUp("hi"));

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

        var result = calculatorWithOperator.summation(4.1, calculatorWithOperator.summation(calculatorWithOperator.multiplication(15d, 7d), calculatorWithOperator.exponentiation(calculatorWithOperator.division(28, 5), 2)));
        System.out.println(result);
        System.out.println(calculatorWithOperator.extractionOfRoots(27, 3));
        System.out.println(calculatorWithOperator.extractionOfRoots(27, 2));
        System.out.println(calculatorWithOperator.extractionOfRoots(27, 0));
        System.out.println(calculatorWithOperator.extractionOfRoots(27, -3));
        System.out.println(calculatorWithOperator.extractionOfRoots(27, -2));
        System.out.println(calculatorWithOperator.extractionOfRoots(27, 1));
        System.out.println(calculatorWithOperator.extractionOfRoots(27, -1));
        System.out.println(calculatorWithOperator.extractionOfRoots(-27, 3));
        System.out.println(calculatorWithOperator.extractionOfRoots(-27, 2));
        System.out.println(calculatorWithOperator.extractionOfRoots(-27, 0));
        System.out.println(calculatorWithOperator.extractionOfRoots(-27, -3));
        System.out.println(calculatorWithOperator.extractionOfRoots(-27, -2));
        System.out.println(calculatorWithOperator.extractionOfRoots(-27, 1));
        System.out.println(calculatorWithOperator.extractionOfRoots(-27, -1));


    }
}
