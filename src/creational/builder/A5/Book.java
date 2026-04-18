package creational.builder.A5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title,author;
    private  int page;
    private List<String> chapters;
    private Book(Builder b){
        this.title = b.title;
        this.page = b.page;
        this.author = b.author;
        this.chapters = b.chapters;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", page=" + page +
                ", chapters=" + chapters +
                '}';
    }

    public static class Builder{
        private String title,author;
        private  int page;
        private List<String> chapters = new ArrayList<>();
        public Builder buildTitle(String title){
            this.title=title;
            return this;
        }
        public Builder buildPage(int page){
            this.page=page;
            return this;
        }
        public Builder buildAuthor(String author){
            this.author=author;
            return this;
        }
        public Builder buildChapter(String chapter){
            this.chapters.add(chapter);
            return this;
        }
        public Book build(){
            return new Book(this);
        }
    }
}
