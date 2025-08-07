package org.example;

import javax.swing.*;
import java.util.List;

public class Groupe {
    private String name;
    private List<User> users;
    private List<Moderator> moderators;
    private List<Administrator> administrators;

    public Groupe(String name, List<User> users, List<Moderator> moderators, List<Administrator> administrators) {
        this.name = name;
        this.users = users;
        this.moderators = moderators;
        this.administrators = administrators;
    }

    public List<Moderator> getModerators() {
        return moderators;
    }

    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public List<User> getUsers() {
        return users;
    }

    public Publication getPublication(String keyWords) {
        if (moderators.size() > 0) {
            for (Moderator moderator : moderators) {

            }
        }
    }

    public String getUser (String userId){
        if (userId == null){
            return null;
        }
        for (User user : users) {
            if(user.getUserId().equals(userId)){
                return user.getName();
            }
        }
    }


}
