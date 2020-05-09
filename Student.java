public class Student extends Person{
    public String name, id, major;
    String[] books = new String[3];


    public Student(String name, String id, String major){
        super();
        this.name = name;
        this.id = id;
        this.major = major;
    }
    
    public String getUserName(){
        return this.name;
    }

    void study(){
    }

    void borrowBook(Book book){
    }
}