package org.example;

/*
  2) 2 метода работы со строками:
  на вход string 1 и string 2 - возвращается конкатекация строк;
  на вход string 1 и целое число n - возвращается и повторений string 1, т.е. на вход строка "bla" и число 3, получаем строку "blablabla"
*/

/*
Задача:
    1) Реализовать "функциональность";
    2) Покрыть функциональность пункта 1 Unit Test-ами используя 3A Rule и JUnit или TestNG;
    3) Реализовать Design Pattern Facade или пометить комментарием сущность которая в этой простейшей задаче его заменяет;
    4) Покрыть функциональность пункта 3 Unit Test-ами;
    5) Реализовать Rest Service на базе 3 используя библиотеку Spring;
    6) Покрыть API тестами Rest Service используя RestAssured;
    7) Залить решение под git;
*/


public class Main {
    public static void main(String[] args) {
        System.out.println(StringEngine.concatString("Hello ", "world!"));
        System.out.println(StringEngine.multiplicateString("I hate Rest Service\n", 2));
    }
}