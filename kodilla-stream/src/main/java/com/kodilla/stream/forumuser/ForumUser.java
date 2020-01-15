package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int ID;
    private String userName;
    private char sex;
    private LocalDate birthdayDate;
    private int quantityOfPosts;

    public ForumUser(int ID, String userName, char sex, LocalDate birthdayDate, int quantityOfPosts) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", quantityOfPosts=" + quantityOfPosts +
                '}';
    }
}