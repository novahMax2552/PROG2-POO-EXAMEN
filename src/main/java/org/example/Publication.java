package org.example;

import java.time.LocalDate;

public class Publication {
    private int id;
    private String title;
    private final User author;
    private String content;
    private LocalDate dateOfPublication;

    public Publication(int id, String title, User author, String content, LocalDate dateOfPublication) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.dateOfPublication = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public User getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
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
