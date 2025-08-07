package org.example;

import java.util.ArrayList;
import java.util.List;

public class Groupe {
    private String name;
    private List<User> users;
    private List<Moderator> moderators;
    private List<Administrator> administrators;
    private List<Publication> publications;
    private List<Commentaire> commentaires;

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
    public String getUser (String userId){
        if (userId == null){
            return null;
        }
        for (User user : users) {
            if(user.getUserId().equals(userId)){
                return user.getName();
            }
        }
        return null;
    }

    public static List<Publication> getPublications (String keyWord){
        List<Publication> publications = new ArrayList<>();
        for (Publication publication : publications) {
            String content = publication.getContent();
            if (content.contains(keyWord)){
                return publications;
            }
        }
        return publications;
    }

    public int countNumberOfpublications(){
        return publications.size();
    }

    public void deletePublication(String publicationId){

    }


    public static void main(String[] args) {

    }

}
