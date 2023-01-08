
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int studentsqtd = 10;

        Scanner scanner = new Scanner(System.in);

        while (studentsqtd > 0 ) {
            String studentName = scanner.nextLine();
            int studentAge = scanner.nextInt();

            System.out.println("The student name is: " + studentName + " and his age is: " + studentAge);

            studentsqtd = studentsqtd -1;
        }



    }
}