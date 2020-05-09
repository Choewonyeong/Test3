public class LibraryStaff {
    // 학생 정보, 책 정보의 객체를 넘겨주는 메소드
    void callStudent(Student student, Book book){
        System.out.println(student.name);
        System.out.println(book.bookTitle);
    }
    
    // 교수 정보, 책 정보의 객체를 넘겨주는 메소드
    void callFaculty(Faculty faculty, Book book){
        System.out.println(faculty.name);
        System.out.println(book.bookTitle);
    }
}