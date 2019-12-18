package com.kodilla.testing.forum.statistics;

public class SetStatistics {


    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;



    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    private double calculateAveragePostsPerUser() {
        return (double)quantityOfPosts/quantityOfUsers;
    }

    private double calculateAverageCommentsPerUser() {
        return (double)quantityOfComments/quantityOfUsers;
    }

    private double calculateAverageCommentsPerPost() {
        return (double)quantityOfComments/quantityOfPosts;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        averagePostsPerUser = calculateAveragePostsPerUser();
        averageCommentsPerUser = calculateAverageCommentsPerUser();
        averageCommentsPerPost = calculateAverageCommentsPerPost();

    }

    public void showStatistics() {
        System.out.println("Statistics: ");
        System.out.println("Quantity of users: "+ quantityOfUsers);
        System.out.println("Quantity of posts: "+ quantityOfPosts);
        System.out.println("Quantity of comments: "+ quantityOfComments);
        System.out.println("Posts average per user: "+ quantityOfUsers);
        System.out.println("Comments average per user: "+ quantityOfUsers);
        System.out.println("Comments average per post: "+ quantityOfUsers);
    }
}
