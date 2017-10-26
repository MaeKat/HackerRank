
package binary.numbers;

/*
 * Hacker rank Daily challenge Binary Numbers
 * @ ref https://www.hackerrank.com/challenges/30-binary-numbers/problem
 * @author Vanessa Hoffmann
 */

/**
 *
 * @author Mousefire
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static int numOne(String result){
      int num1 = 1;
     int max = 1;  
    for(int i =0; i < result.length()-1; i++){
      
        if (result.charAt(i) == '1' ) {
            if (result.charAt(i) == result.charAt(i+1)){
                 num1++;
                if (num1 > max){
                     max = num1;
                }
             }
         }
        else if (result.charAt(i)=='0'){
             num1 = 1;
             if (num1 > max){
             max = num1;   
              }

            
    }
    }
    return max;
}
    
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
       String result = "";
while(num > 0) {
    int r = num % 2;
    num /= 2;
   result = result + r;
}
      int maxCon = numOne(result)  ;
        
        
System.out.println(maxCon);
    }
}