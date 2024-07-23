
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sanidhya Singh
 */
public class Grade_calculator {

    public static void main(String args[]) {
        System.out.println("This is a Student Grade Calculator.So, it will help you to check your grade"
                + " with in just a quick steps");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("The Grade are distibuted in the following patterns:"
                + "\nGrade O: 90-100 percentage"
                + "\nGrade A: 70-90 percentage"
                + "\nGrade B: 50-70 percentage"
                + "\nGrade C: 30-50 percentage"
                + "\nGrade F: Below 30");
        System.out.println("--------------------------------------------------------------------------");
        System.out.print("Enter the number of subjects: ");
        Scanner total = new Scanner(System.in);
        float no = total.nextFloat();
        float all = 0;
        for (int i = 1; i <= no; i++) {
            System.out.print("Enter the " + i + " subject numbers you got: ");
            float sum = total.nextInt();
            all = sum + all;
        }
        float ans = all / no;
        if ((ans >= 90) && (ans <= 100)) {
            System.out.println("Congratulations you got an 'O' Grade!");
        }
        if ((ans >= 70 && ans <= 90)) {
            System.out.println("You got an 'A' grade!");
        }
        if ((ans >= 50 && ans <= 70)) {
            System.out.println("You got a 'B' grade");
        }
        if ((ans >= 30 && ans <= 50)) {
            System.out.println("You got a 'C' grade");
        }
        else{
        System.out.println("Sorry you are fail you gat a F !!");
        }
    }
}
