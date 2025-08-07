package org.example;

import java.time.LocalDate;

public class Commentaire {
    private String content;
    private User author;
    private LocalDate date;

    public Commentaire(String content, User author, LocalDate date) {
        this.content = content;
        this.author = author;
        this.date = date;
    }
}
