/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Acitivity4;

/**
 *
 * @author ADMIN
 */
public class Activity4 {
    
    public static void main(String[] args) {
        
          
        int minEntranceScore = 80;
        double minGPA = 1.0;

        int entranceScore = 85;
        double gpa = 3.5;

        if (entranceScore >= minEntranceScore) {
            if (gpa >= minGPA) {
                System.out.println("Congratulations! You are eligible for admission.");
            } else {
                System.out.println("You meet the entrance score requirement but your GPA is below " + minGPA + ".");
            }
        } else {
            System.out.println("Your entrance score is below" + minEntranceScore + ".");
        }
    }
}