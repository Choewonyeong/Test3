import java.util.Scanner;

public class Operator{
    // 입력 스캐너 변수 초기화
    Scanner input = new Scanner(System.in);
    // 학생 정보 객체 선언
    Student student;
    // 교수 정보 객체 선언
    Faculty faculty;
    // 첵 정보 객체 선언
    Book book;
    // 메뉴 문자열 변수 초기화
    String menu = "";

    // 책 정보 2차원 배열 초기화
    String[][] bookInformation = {{"book","exam"},
                                  {"c언어","홍길동"},
                                  {"자바언어","임꺽정"},
                                  {"파이썬","김개똥"},
                                  {"자료구조","김강사"},
                                  {"네트워크","최교수"}};
    // 학생 정보 2차원 배열 초기화
    String[][] studentInformation = {{"user","T11","컴퓨터공학"},
                                     {"김철호","S11","컴퓨터공학"}, 
                                     {"이철호","S12","컴퓨터공학"}, 
                                     {"강철호","S13","전자공학"}, 
                                     {"최철호","S14","일어일본"}, 
                                     {"윤철호","S15","컴퓨터공학"}};

    // 교수 정보 2차원 배열 초기화
    String[][] facultyInformation = {{"최재성","F11","컴퓨터공학"},
                                     {"김정동","F12","컴퓨터공학"},
                                     {"이진성","F13","전자공학"}};
    // 책 정보 배열 객체 초기화
    Book[] books = new Book[bookInformation.length];
    // 학생 정보 배열 객체 초기화
    Student[] students = new Student[studentInformation.length];
    // 교수 정보 배열 객체 초기화
    Faculty[] faculties = new Faculty[facultyInformation.length];
    // 도서관 관리자 객체 초기화
    LibraryStaff libStaff = new LibraryStaff();

    // 각 객체에 배열의 정보 입력하는 메소드 선언
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

    // 인사말 출력하는 메소드 선언
    void welcome(){
        System.out.println("도서관리 프로그램을 이용해주셔서 감사합니다.");
    }

    // 메뉴 구성 및 출력하는 메소드 선언
    void setMenu(){
        // 무한루프 돌면서 메뉴에 없는 명령어 입력 시 재입력하도록 함
        // 메뉴에 있는 명령어 입력 시 루프 종료
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
                break;
            }
            else if(menu.equals("P")){
                break;
            }
            else if(menu.equals("Q")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("\n메뉴를 다시 입력하세요.\n");
            }
        }
    }
    
    // 학생 이름 입력 및 유효성 검사 메소드 선언
    void searchStudent(){
        // 무한루프 돌면서 유효성 검사에 통과하지 못했을 경우 재입력 받도록 함.
        while(true){
            System.out.print("학생 이름 : ");
            String name = input.nextLine();
            // 학생 이름 유효성 검사 메소드 호출
            if (checkStudent(name) == 1){
                break;
            }
            else{
                System.out.println("존재하지 않은 학생입니다. 다시 입력하세요.");
            }
        }
    }

    // 학생 이름 유효성 검사 메소드 선언
    int checkStudent(String name){
        int result = 0;
        for (int i=0; i<students.length; i++){
            if (students[i].name.equals(name)){
                result = 1;
                student = students[i];
                break;
            }
        }
        return result;
    }

    // 교수 이름 입력 및 유효성 검사 메소드 선언
    void searchFaculty(){
        // 무한루프 돌면서 유효성 검사에 통과하지 못했을 경우 재입력 받도록 함.
        while(true){
            System.out.print("교수 이름 : ");
            String name = input.nextLine();
            // 교수 이름 유효성 검사 메소드 호출
            if (checkFaculty(name) == 1){
                break;
            }
            else{
                System.out.println("존재하지 않은 교수입니다. 다시 입력하세요.");
            }
        }
    }

    // 교수 이름 유효성 검사 메소드 선언
    int checkFaculty(String name){
        int result = 0;
        for (int i=0; i<students.length; i++){
            if (faculties[i].name.equals(name)){
                result = 1;
                faculty = faculties[i];
                break;
            }
        }
        return result;
    }

    // 책 제목 입력 및 유효성 검사 메소드 선언
    void searchBook(){
        // 무한루프 돌면서 유효성 검사에 통과하지 못했을 경우 재입력 받도록 함.
        while(true){
            System.out.print("책 제목 : ");
            String title = input.nextLine();
            // 책 제목 유효성 검사 메소드 호출
            if (checkBook(title) == 1){
                break;
            }
            else{
                System.out.println("존재하지 않은 책입니다. 다시 입력하세요.");
            }
        }
    }

    // 책 제목 유효성 검사 메소드 선언
    int checkBook(String title){
        int result = 0;
        for (int i=0; i<students.length; i++){
            if (books[i].bookTitle.equals(title)){
                result = 1;
                book = books[i];
                System.out.println(book.getClass().getName());
                break;
            }
        }
        return result;
    
    }

    // 정보 입력 및 입력받은 정보의 객체를 넘겨주는 메소드 선언
    // 정보 객체 : 학생 또는 교수의 객체, 책 정보 객체
    void run(){
        // 학생도서대출 메뉴의 명령어룰 입력했을 경우
        if(menu.equals("S")){
            searchStudent();
            searchBook();
            libStaff.callStudent(student, book);
        }
        // 교수도서대출 메뉴의 명령어룰 입력했을 경우
        else if(menu.equals("P")){
            searchFaculty();
            searchBook();
            libStaff.callFaculty(faculty, book);
        }
    }

    public static void main(String[] args) {
        // 실행 클래스 호출(자신)
        Operator controller = new Operator();
        // 객체 정보 초기화 메소드 호출
        controller.setObjects();
        // 인사말 출력하는 메소드 호출
        controller.welcome();
        // 메뉴 구성 및 선택 메소드 호출
        controller.setMenu();
        // 주 실행 메소드 호출
        controller.run();
    }
}