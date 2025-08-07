package org.example;

import java.time.LocalDate;

public class Publication {
    private String title;
    private final User author;
    private String content;
    private LocalDate dateOfPublication;

    public Publication(String title, User author, String content, LocalDate dateOfPublication) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.dateOfPublication = LocalDate.now();
    }

    public void getPublication() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Date of publication: " + dateOfPublication);
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", content='" + content + '\'' +
                ", dateOfPublication=" + dateOfPublication +
                '}';
    }
}
