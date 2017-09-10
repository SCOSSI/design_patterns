package com.builder;

/**
 * Created by gabriel on 10/09/17.
 */
public class Main {
    public static void main(String[] args){
        User user = new User.UserBuilder("Gabriel","Scossi").age(24).address("Do not interest to you!").build();
        System.out.println(user.toString());
    }
}
