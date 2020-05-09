import java.util.Scanner;

public class Student {
    String name, id, major;
    Scanner input = new Scanner(System.in);
    public Student(String name, String id, String major){
        
    }
    Student getStudentInformation(){
        Student student;
        System.out.println("====== 학생 정보 입력 ======");
        System.out.print("이름 : ");
        name = input.next();
        System.out.print("\nID : ");
        id = input.next();
        System.out.print("\n전공 : ");
        major = input.next();
        student = new Student(name, id, major);
        return student;
    }
}