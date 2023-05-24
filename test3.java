// โปรแกรมประมวลผลการเรียน(ตัดเกรด)

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int score;
        char grade = ' ';
        Scanner kb = new Scanner(System.in);
        System.out.print("Input your score: ");
        score = kb.nextInt();

        if(score >= 90) {
            grade = 'A';
        }
        else if(score >= 80 && score <=89 ) {
            grade = 'B';
        }
        else if(score >= 70 && score <=79 ) {
            grade = 'C';
        }
        else if(score >= 60 && score <=69 ) {
            grade = 'D';
        }
        else if(score < 60) {
            grade = 'F';
        } 
        System.out.println("Grade: " + grade);
    }
}
