/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_calculator;
import java.util.Scanner;
/**
 *
 * @author opensuse
 */
public class Exercise_Calculator {
    
    public void Calculator()
    {
        Scanner numin = new Scanner(System.in);
        Scanner opin = new Scanner(System.in);
        float a, b, result = 0;
        String operand;
        
        System.out.println("Exercise Calculator");
        System.out.println("--------------------");
        
        System.out.print("Input first Number: ");
        a = numin.nextFloat();
        System.out.println();
        
        boolean inputop = true;
        do
        {
            System.out.print("Input Operand [+, -, *, /] : ");
            operand = opin.nextLine();
            switch (operand)
            {
                case "+":
                case "-":
                case "*":
                case "/":
                    inputop = false;
                    break;
                default:
                    System.out.println("Input the Right Operand!\n");
                    break;
            }
        }while (inputop);
        
        System.out.println();
        System.out.print("Input Second Number: ");
        b = numin.nextFloat();
        
        switch(operand)
        {
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
        }
        
        System.out.println("The result of "+a+" "+operand+" "+b+"  is "+ result);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exercise_Calculator cal = new Exercise_Calculator();
        cal.Calculator();
    }
    
}
