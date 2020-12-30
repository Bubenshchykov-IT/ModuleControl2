package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Set;


public class Main
{
    private static final int SIZE = 25;
    public static void main(String[] args)
    {
        // цілочисельний масив
        int[] array = new int[SIZE];
        // сет цілих чисел
        HashSet<Integer> hashSet = new HashSet<Integer>();
        // список цілих чисел
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Map цілих чисел
        SortedMap<String, Set<Integer>> map = new TreeMap<>();

        try {
            FileInputStream inputFile = new FileInputStream("module2.txt");
            DataInputStream input = new DataInputStream(inputFile);
            for (int i = 0; i != SIZE; i++) {
                array[i] = input.readInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
