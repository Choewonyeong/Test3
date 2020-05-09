public class Faculty extends Person{
    // 교수 성명, 아이디, 과목
    String name, id, major;

    // 교수가 빌릴 수 있는 최대 도서량
    int lim = 5;

    // 교수의 빌린 도서 항목 배열 변수 선언(최대 3권까지)
    String[] books = new String[lim];

    // 교수 정보 객체 생성자
    public Faculty(String name, String id, String major){
        this.name = name;
        this.id = id;
        this.major = major;
        super.name = name;
        super.id = id;
        super.major = major;
        super.lim = lim;
    }
}