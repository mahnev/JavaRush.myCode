package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String name=scan.readLine();
        String first1=scan.readLine();
        String two1=scan.readLine();
        int first=Integer.parseInt(first1);
        int two=Integer.parseInt(two1);

        System.out.println(name+" получает "+first+" через "+two+" лет.");

    }
}