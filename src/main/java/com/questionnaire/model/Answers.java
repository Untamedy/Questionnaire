package com.questionnaire.model;

import com.questionnaire.entity.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YBolshakova
 */
public class Answers {
     private static final Answers instance = new Answers();
     
     private List<User> users;
     
     private Answers(){
         users = new ArrayList<>();
     }

    public static Answers getInstance() {
        return instance;
    }
   

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    public void add(User user){
        users.add(user);
    }
    
    
     public List<String> listOfUser(){
         List<String> userList = new ArrayList<>();
         for(User u: users){
             if(u.isHappy()){
                 userList.add(u.getName() + " " + u.getLastname());
             }             
         }
         return userList;
     }
                 
   

}
