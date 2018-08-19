package com.priya.algorithms;

/**
 * Created by priya on 07/08/18.
 */
public class RecursionSample {
    public static void main(String args[]){
        reduceByOne(5);
    }

    public static void reduceByOne(int value){
        if(value>=0){
            reduceByOne(value-1);
        }

        System.out.println(value);
    }
}
