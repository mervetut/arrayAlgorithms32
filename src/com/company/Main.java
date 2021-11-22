package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {-4, 11, 7, -12, 6, 1};
        int N = numbers.length;
        boolean changed = true;
        while (changed)
        {
            changed = false;
            for (int i = 0; i <= N -2; i++)
            {
                if (numbers [i] > numbers [i + 1])
                {
                    swap (numbers, i, i + 1);
                    changed = true;
                }
            }
        }
        for (int n : numbers)
            System.out.print(n + " ");
    }
    public static void swap (int [] array, int ind1, int ind2){
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}
