import java.util.Scanner;

public class Operator{
    Scanner input = new Scanner(System.in, "utf-8");
    String[][] bookInformation = {{"c언어","홍길동"}, 
                                  {"자바언어","임꺽정"},
                                  {"파이썬","김개똥"},
                                  {"자료구조","김강사"},
                                  {"네트워크","최교수"}};
    String[][] studentInformation = {{"김철호","S11","컴퓨터공학"}, 
                                     {"이철호","S12","컴퓨터공학"}, 
                                     {"강철호","S13","전자공학"}, 
                                     {"최철호","S14","일어일본"}, 
                                     {"윤철호","S15","컴퓨터공학"}};
    String[][] facultyInformation = {{"최재성","F11","컴퓨터공학"},
                                     {"김정동","F12","컴퓨터공학"},
                                     {"이진성","F13","전자공학"}};
    Book[] books = new Book[5];
    Student[] students = new Student[5];
    Faculty[] faculties = new Faculty[3];
    LibraryStaff libStaff = new LibraryStaff();
    String menu = "";

    void setObjects(){
        for (int i = 0; i < books.length; i++){
            if (i < 3){
                books[i] = new Book(bookInformation[i][0], bookInformation[i][1]);
                students[i] = new Student(studentInformation[i][0], studentInformation[i][1], studentInformation[i][2]);
                faculties[i] = new Faculty(facultyInformation[i][0], facultyInformation[i][1], facultyInformation[i][2]);
            }
            else{
                books[i] = new Book(bookInformation[i][0], bookInformation[i][1]);
                students[i] = new Student(studentInformation[i][0], studentInformation[i][1], studentInformation[i][2]);
                }
        }
    }

    void welcome(){
        System.out.println("도서관리 프로그램을 이용해주셔서 감사합니다.");
    }

    void setMenu(){
        while(true){
            System.out.println("\n아래의 메뉴를 선택하세요.");
            System.out.println("==================");
            System.out.println("명령어    메뉴");
            System.out.println("----- ------------");
            System.out.println("  S : 학생도서대출\n  P : 교수도서대출\n  Q : 종료");
            System.out.println("==================");
            System.out.print("명령어 : ");
            menu = input.nextLine();
            if(menu.equals("S")){
                //input.close();
                break;
            }
            else if(menu.equals("P")){
                //input.close();
                // 교수이름 입력 메소드 실행
            }
            else if(menu.equals("Q")){
                //input.close();
                break;
            }
            else{
                System.out.println("\n메뉴를 다시 입력하세요.\n");
            }
        }
        if(menu.equals("S")){
            searchStudent();
        }

    }
    
    void searchStudent(){
        String name;
        while(true){
            System.out.print("학생 이름 : ");
            name = input.nextLine();
            System.out.println(name);
            if (checkStudent(name) == 1){
                break;
            }
            
        }
    }

    int checkStudent(String name){
        int result = 0;
        for (int i=0; i<students.length; i++){
            System.out.println(students[i].name);
            if (students[i].name.equals(name)){
                result = 1;
                break;
            }
        }
        return result;
        
    }

    void searchFaculty(){
        // System.out.println(menu);
    }

    void searchBook(){
        // System.out.println(menu);
    }

    public static void main(String[] args) {
        Operator controller = new Operator();
        controller.setObjects();
        controller.welcome();
        controller.setMenu();
    }
}