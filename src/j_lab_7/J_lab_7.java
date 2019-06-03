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
public class J_lab_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int[] arr = { 5, 1, 8, -2, 0, 3, 10 };


 DynamicArray da = new DynamicArray();
    da.popElement(arr,7);
   da.showAllElements(da.popElement(arr,7));
   da.showAllElements(da.doneFirstElement(arr));
    
    }
    
}
