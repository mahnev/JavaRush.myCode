package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader kostik=new BufferedReader(new InputStreamReader(System.in));
        String name1= kostik.readLine();
        String name2= kostik.readLine();
        String name3= kostik.readLine();
        System.out.print(name1+" + "+name2+" + "+name3+" = Чистая любовь, да-да!");
    }

}