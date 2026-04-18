package creational.builder.A5;

public class Main_Book {
    static void main(String[] args) {
        Book b= new Book.Builder().buildTitle("Làm giàu").buildPage(200).buildAuthor("Nagasuki").buildChapter("24 Chương").build();
        System.out.println(b);
    }
}
