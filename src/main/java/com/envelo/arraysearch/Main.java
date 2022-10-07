package com.envelo.arraysearch;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podal liczbę elementów tablicy: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Uzupełnij tablicę liczbami ałkowitymi malejąco: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Pdaj szukaną liczbę: ");
        int x = scanner.nextInt();
        ArraySearch arraySearch = new ArraySearch();

        if (!arraySearch.search(arr, x))
            System.out.println("Nie znaleziono liczby " + x + " w tablicy");
        else
            System.out.println("Znaleziono liczbę " + x + " w tablicy.");
    }
}
