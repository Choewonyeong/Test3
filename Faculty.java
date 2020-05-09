public class Faculty extends Person{
    // 교수 성명, 아이디, 과목
    String name, id, major;

    // 교수의 빌린 도서 항목 배열 변수 선언(최대 3권까지)
    String[] books = new String[3];
    
    // 교수 정보 객체 생성자
    public Faculty(String name, String id, String major){
        super();
        this.name = name;
        this.id = id;
        this.major = major;
    }
}