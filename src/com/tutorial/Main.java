package com.tutorial;

import com.tutorial.generics.GenericsList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var myList = new GenericsList<Integer>();
        myList.add(12);
        int test = myList.get(0);

        var user1 = new User(10);
        var user2=new User(20);
        if (user1.compareTo(user2)<0)
            System.out.println("user1 < user2");
        else if (user1.compareTo(user2) >1)
            System.out.println("user1 > user2");
        else
            System.out.println("user1 == user2");

        var user = Utilities.max(user1,user2);

        //Wild cards
        var instructors = new GenericsList<Instructor>();
        var users = new GenericsList<User>();

        Utilities.printUsers(instructors);
    }
}
