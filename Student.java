public class Student extends Person{
    // 학생의 이름, 아이디, 전공
    public String name, id, major;
    
    // 학생이 빌릴 수 있는 최대 도서량
    int lim = 3;

    // 학생의 빌린 도서 항목 배열 변수 선언(최대 3권까지)
    String[] books = new String[lim];

    // 학생 정보 객체 생성자
    public Student(String name, String id, String major){
        this.name = name;
        this.id = id;
        this.major = major;
        super.name = name;
        super.id = id;
        super.major = major;
        super.lim = lim;
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