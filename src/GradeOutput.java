import java.util.Scanner;
public class GradeOutput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter in your grade as an integer: ");
        int grade = keyboard.nextInt();
        if(grade >= 98){
            System.out.println("A+");
        }
        else if(grade >= 93){
            System.out.println("A");
        }
        else if(grade >= 90){
            System.out.println("A-");
        }
        else if(grade >= 88){
            System.out.println("B+");
        }
        else if(grade >= 83){
            System.out.println("B");
        }
        else if(grade >= 80){
            System.out.println("B-");
        }
        else if(grade >= 78){
            System.out.println("C+");
        }
        else if(grade >= 73){
            System.out.println("C");
        }
        else if(grade >= 70){
            System.out.println("C-");
        }
        else if(grade >= 68){
            System.out.println("D+");
        }
        else if(grade >= 63){
            System.out.println("D");
        }
        else if(grade >= 60){
            System.out.println("D-");
        }
        else{
            System.out.println("F");
        }
    }

}
