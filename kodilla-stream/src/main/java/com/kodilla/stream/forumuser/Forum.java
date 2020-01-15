package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Ania", 'F', LocalDate.of(1997, Month.DECEMBER, 23),1));
        forumUserList.add(new ForumUser(2, "Hania", 'F', LocalDate.of(1986, Month.DECEMBER, 12),0));
        forumUserList.add(new ForumUser(3, "Maciek", 'M', LocalDate.of(1991, Month.DECEMBER, 9),9));
        forumUserList.add(new ForumUser(4, "Zosia", 'F', LocalDate.of(1989, Month.DECEMBER, 11),3));
        forumUserList.add(new ForumUser(5, "Kuba", 'M', LocalDate.of(2003, Month.DECEMBER, 10),0));
        forumUserList.add(new ForumUser(6, "Kasia", 'F', LocalDate.of(2001, Month.DECEMBER, 3),7));
        forumUserList.add(new ForumUser(7, "Zenek", 'M', LocalDate.of(1985, Month.DECEMBER, 15),0));
        forumUserList.add(new ForumUser(8, "Michał", 'M', LocalDate.of(2007, Month.DECEMBER, 6),5));
        forumUserList.add(new ForumUser(9, "Gosia", 'F', LocalDate.of(1993, Month.DECEMBER, 29),1));
        forumUserList.add(new ForumUser(10, "Bartek", 'M', LocalDate.of(1992, Month.DECEMBER, 30),10));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}