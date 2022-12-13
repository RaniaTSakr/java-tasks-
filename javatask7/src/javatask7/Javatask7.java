/*
 function quick sorting 
 */
package javatask7;

/**
 *
 * @author Rania Tarek
 */
public class QuickSort {
public static void quick_sort(int [] array, int left, int right) {
 if (left < right) {
 int q = position(array, left, right);
 quick_sort(array, left, q-1);
 quick_sort(array, q+1, right);
 }
 }
 private static int position(int array [], int left, int right) {
 int i = left - 1;
 for (int j = left ; j < right ; j++) {
 if (array[j] < array[right]) {
 i++;
 swap(array, i, j);
 }
 }
2
 swap(array, i+1, right);
 return i+1;
 }
 private static void swap(int [] array, int i, int j) {
 int temp = array[i];
 array[i] = array[j];
 array[j] = temp;
 }
 public static void main(String [] args) {
 System.out.println("Hello! World!!");
 int [] array= {3, 1, 5, 4, 2};
 quick_sort(array, 0, array.length - 1);
 for (int i = 0 ; i < array.length ; i++) {
 System.out.println(array[i]);
 }
 }
}