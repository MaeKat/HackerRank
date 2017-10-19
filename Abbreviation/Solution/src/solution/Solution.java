/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

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

    static String abbreviation(String a, String b) {
        a = a.toUpperCase();
        int count = 0;
        for (int j = 0; j < b.length(); j++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == b.length()) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String a = in.next();
            String b = in.next();
            String result = abbreviation(a, b);
            System.out.println(result);
        }
        in.close();
    }
}
