package org.example.Arrays;

public class ArrayMethods {

    public int findIndex(int[] arr, int num){
        int index = -1;
        for(int i = 0; i < arr.length; ++i)
            if(arr[i] == num) {
                index = i;
                break;
            }
        return index;
    }

    public void printArray(int arr[], int index){
        System.out.println(arr[index]);
    }

    public boolean searchNumber(int[] arr, int num){
        boolean found = false;
        for(Integer i : arr)
            if(i == num){
                found = true;
                break;
            }
        return found;
    }
}
