package org.example;

import java.time.LocalDate;

public class Publication {
    private String title;
    private User author;
    private String content;
    private LocalDate dateOfPublication;

    public Publication(String title, User author, String content, LocalDate dateOfPublication) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.dateOfPublication = LocalDate.now();
    }

    void createPublication() {
        this.title = title;
        this.content = content;
    }
}
