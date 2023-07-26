package org.example;

import java.util.Scanner;

public class factorialCalculator {
    Scanner sc;
    int output;
    private int num;

    public factorialCalculator() {
        sc = new Scanner(System.in);
    }
    public String solve(){
        System.out.println("Please input a number: ");
       this.num = sc.nextInt();
       return solveFactorial(this.num,1);
    }

    public String testSolve(int testNum){
        return solveFactorial(testNum,1);
    }

    public String solveFactorial(int num,int divFactor){
        if (num/divFactor == 1) {
            return (num + "!");
        } else if (num<divFactor) {
            return "None";
        } else {
            return solveFactorial(num / divFactor, divFactor + 1);
        }
    }
}
