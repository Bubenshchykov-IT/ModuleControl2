package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Menu
{
    public static void menu(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userAnswer;
        do {
            System.out.println("User Menu:");
            System.out.println("1. Unique values (set)");
            System.out.println("2. %2 values (list)");
            System.out.println("3. Couples (map)");
            System.out.println("quit");
            System.out.println("Choose action:");
            userAnswer = reader.readLine();
            switch (userAnswer) {
                case "set":
                    break;
                case "list":
                    break;
                case "map":
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("ERROR! Wrong value.");
            }
        } while(true);
    }
    private static void menuSet(int[] array) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i!=array.length;i++) {
            set.add(array[i]);
        }
        for (Integer elements : set) {
            System.out.print(elements +",");
        }
        System.out.println();
    }
    private static void menuList(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i != array.length; i++) {
            if(array[i] % 2 == 0)
                list.add(array[i]);
        }
        for (Integer elements : list) {
            System.out.print(elements + ",");
        }
        System.out.println();
    }
    private static void menuMap(int[] array) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0;i != array.length; i++) {
            map.put("Element("+(i+1)+"", array[i]);
        }
        for (HashMap.Entry<String, Integer> elements : map.entrySet()) {
            System.out.print(elements.getKey() + ": " +elements.getValue());
        }
        System.out.println();
    }
}

