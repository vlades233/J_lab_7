/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import j_lab_7.DynamicArray;
import org.junit.Test;


/**
 *
 * @author Vlad
 */
public class DynamicArrayTest {
@Test 
    public  void popElementTest() {
        int[] arr = {5, 1, 8, -2, 0, 3, 10};
        int[] test_arr = {5, 1, 8, -2, 0, 3, 10, 7};

        DynamicArray da = new DynamicArray();

        Arrays.equals(test_arr, da.popElement(arr, 7));
    }
@Test 
    public  void doneFirstElementTest() {
        int[] arr = {5, 1, 8, -2, 0, 3, 10};
        int[] test_arr = {1, 8, -2, 0, 3, 10};

        DynamicArray da = new DynamicArray();

        Arrays.equals(test_arr, da.doneFirstElement(arr));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
