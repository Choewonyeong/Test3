public class LibraryStaff {
    void callStudent(Student student, Book book){
        System.out.println(student.name);
        System.out.println(book.bookTitle);
    }
    void callFaculty(Faculty faculty, Book book){
        System.out.println(faculty.name);
        System.out.println(book.bookTitle);
    }
}