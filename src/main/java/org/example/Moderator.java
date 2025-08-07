package org.example;

import java.time.LocalDate;

public class Moderator extends User {
    public Moderator(String userId, String name, String email, LocalDate dateOfCreation) {
        super(userId, name, email, dateOfCreation);
    }

    @Override
    public String toString() {
        return "Moderator{}";
    }
}
