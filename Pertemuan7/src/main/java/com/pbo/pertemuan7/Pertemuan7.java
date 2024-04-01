/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.pertemuan7;

/**
 * @author Oktavina Zahra R
 */
public class Pertemuan7 {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();
        selectionSort(arr);
        stopwatch.stop();

        System.out.println("Waktu yang berlalu untuk mengurutkan 100.000 angka: ");
        System.out.println(stopwatch.getElapsedTime() + " milliseconds");
    }
    
}
