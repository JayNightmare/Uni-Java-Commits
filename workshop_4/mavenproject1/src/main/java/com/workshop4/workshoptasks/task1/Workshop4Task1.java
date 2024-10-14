/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.workshop4.workshoptasks.task1;

/**
 *
 * @author jorda
 */

import java.util.Arrays;
import java.util.List;

public class Workshop4Task1 {
    
    public static int processNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13);
        
        int sum = numbers.stream().filter(n -> n % 2 !=0).map(n -> n + 1).mapToInt(Integer::intValue).sum();
        
        System.out.println("Sum: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        processNumbers();
    }
}
