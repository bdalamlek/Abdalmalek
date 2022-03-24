
import java.util.Scanner;

/**
 * Created by Arabic on 10/01/22.
 */
public class Managemant {
    public static void main(String[] args) {
        Student []team= new Student[3];
//        Student s1= new Student(1,"ahmed");
//        team[0]=s1;
//        Student s2= new Student(2,"yasser");
//        team[1]=s2;
//        Student s3= new Student(3,"Mohammed");
//        team[2]=s3;
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <team.length ; i++) {
         Student s= new Student(in.nextInt(),in.next());
            team[i]=s;
        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }

    }
}
