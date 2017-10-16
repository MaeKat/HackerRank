/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This program is made for the compare the triplets java problem for Hacker Rank
 * This program will take the input of three numbers and award a point to 
 * one of the sets depending on which set gets the points.
 * @author Vanessa Hoffmann
 * @since 10/15/17
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
       int[] arrA = {a0,a1,a2};
       int[] arrB = {b0,b1,b2};
       int [] arrResult = new int [2];
        for(int i =0;i<3;i++){
            if(arrA[i]== arrB[i]){
              continue;   
            }
            else if(arrA[i] > arrB[i]){
                arrResult[0]+=1;
            }
            else {
                arrResult[1]+=1;
            }     
        }   
        return arrResult;
    }
      

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}

