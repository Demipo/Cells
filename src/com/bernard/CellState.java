package com.bernard;

public class CellState {
    public int[] stateOfCell(int[] arr){
        int[] temp = new int[arr.length];
        int zero = 0;
            for(int i = 0; i < arr.length; i++){
                if(i == 0){
                    if(arr[1] == zero)
                        temp[i] = 0;
                    else
                        temp[i] = 1;
                }
                else if(i == arr.length - 1){
                    if(arr[i-1] == zero)
                        temp[i] = 0;
                    else
                        temp[i] = 1;
                }
                else{
                    if(arr[i-1] == arr[i+1]){
                        temp[i] = 0;
                    }
                    else{
                        temp[i] = 1;
                    }
                }
        }
      return temp;
    }

    public int[] iterator(int[] arr, int n){
        for(int i = 0; i < n; i++){
            arr = stateOfCell(arr);
        }
        System.out.println("{"+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","
                +arr[4]+","+arr[5]+","+arr[6]+","+arr[7]+"}");
        return arr;
    }
}
