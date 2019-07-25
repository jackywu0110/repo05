package com.itheima;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int data[] = {8,24,13,12,44,53,42,3,13,67};

        sortArray(data);    //[3, 8, 12, 13, 13, 24, 42, 44, 53, 67]

        sortArray02(data);    //[3, 8, 12, 13, 13, 24, 42, 44, 53, 67]  for git  aaaa
    }

    public static void sortArray(int data[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int x=0;x<= data.length-1;x++){
            list.add(data[x]);
        }

        Collections.sort(list);

        System.out.println(list);
    }


    public static void sortArray02(int data[]){
        int temp =0;
        for(int x=0; x < data.length; x++){
            for(int y =x +1; y < data.length -1; y++){
                if (data[x]> data[y]){
                    temp = data[x];
                    data[x] = data[y];
                    data[y] = temp;
                }
            }

            if (x==0){
                System.out.print("[");
            }
            System.out.print(data[x]);
            if (x<data.length-1) {
                System.out.print(',');
                System.out.print(" ");
            }
            if (x == data.length-1){
                System.out.println("]");
            }
        }



    }



}
