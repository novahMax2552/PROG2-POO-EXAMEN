package org.example;

import java.time.LocalDate;

public class User {
    private String userId;
    private String name;
    private String email;
    private LocalDate dateOfCreation;

    public User(String userId, String name, String email, LocalDate dateOfCreation) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.dateOfCreation = LocalDate.now();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }
}
