package org.example;

import java.time.LocalDate;

public class Administrator extends Moderator{

    public Administrator(String userId, String name, String email) {
        super(userId, name, email, LocalDate.now());
    }

}
