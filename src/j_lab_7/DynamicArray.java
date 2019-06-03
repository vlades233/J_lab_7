/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j_lab_7;

import java.util.Arrays;

/**
 *
 * @author Vlad
 */
public class DynamicArray implements Stack {

    public int[] doneFirstElement(int[] arr) {
        int[] new_arr = new int[(arr.length - 1)];

        for (int i = 0; i + 1 < arr.length; i++) {
            new_arr[i] = arr[i + 1];
        }
        
        return new_arr;
    }

     public int[] popElement(int[] arr,int elem) {
        int[] new_arr = new int[(arr.length+1)];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];      
        }
        new_arr[new_arr.length-1]=elem;
        return new_arr;
    }

    static void showAllElements(int[] arr) {
        System.out.println("Массив:");
        System.out.println(Arrays.toString(arr));
    }
}
