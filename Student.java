public class Student extends Person{
    // 학생의 이름, 아이디, 전공
    public String name, id, major;

    // 학생의 빌린 도서 항목 배열 변수 선언(최대 3권까지)
    String[] books = new String[3];


    // 객체에 성명, 아이디, 과목 정보 재구성
    public Student(String name, String id, String major){
        super.student = new Student(name, id, major);
        this.name = name;
        this.id = id;
        this.major = major;
    }

    // 객체를 넘겨주었는지 확인용
    public String getUserName(){
        return this.name;
    }

    void study(){
    }

    void borrowBook(Book book){
    }
}