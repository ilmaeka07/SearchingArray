/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package searchingarray;

/**
 *
 * @author Acer
 */
public class MaxElemen {
    public static void main(String []args){
    int[] arr = new int[] {44, 23, 55, 76, 21, 100};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >  max) {
                max = arr[i];
            }
        }
        System.out.println("Bilangan terbesar dari array adalah : " + max);
    }
}
