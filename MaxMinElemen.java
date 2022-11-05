/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searchingarray;

/**
 *
 * @author Acer
 */
public class MaxMinElemen {
    public static int getMax(int[] param) {
        int value = param[0];
        for (int i = 0; i < param.length; i++) {
            if (param[i] > value) {
                value = param[i];
            }
        }
        return value;
    }

    public static int getMin(int[] param) {
        int value = param[0];
        for (int i = 0; i < param.length; i++) {
            if (param[i] < value) {
                value = param[i];
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {44, 23, 55, 76, 21, 100};

        int max = getMax(arr);
        System.out.println("Bilangan terbesar dari array adalah : " + max);

        int min = getMin(arr);
        System.out.println("Bilangan terkecil dari array adalah : " + min);

    }
}
