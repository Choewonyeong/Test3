import java.util.Scanner;

public class Faculty {
    Scanner input = new Scanner(System.in);
    public Faculty(String name, String id, String major){
        
    }
    Faculty getFacultyInformation(){
        Faculty faculty;
        String name;
        String id;
        String major;
        System.out.println("====== 교수 정보 입력 ======");
        System.out.print("이름 : ");
        name = input.toString();
        System.out.print("\nID : ");
        id = input.toString();
        System.out.print("\n전공 : ");
        major = input.toString();
        faculty = new Faculty(name, id, major);
        return faculty;
    }
}