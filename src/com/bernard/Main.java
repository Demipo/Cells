package com.bernard;

public class Main {

    public static void main(String[] args) {
        CellState cellState = new CellState();
//        int[] arr = {1, 0, 0, 0, 0, 1, 0, 0};
        int[] arr = {1, 1, 1, 0, 1, 1, 1, 1};
        cellState.iterator(arr, 2);
    }
}
