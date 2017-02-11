package com.bolivia.login.system;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class Users {
    
    private List<User> usersList = new ArrayList<User>();
    
    
    public Users(){
        
        User user1 = new User();
        user1.setName("daniela");
        user1.setPassword("1234");
        user1.setMail("daniela@gmail.com");
        user1.setPhoto(new ImageIcon(getClass().getResource("/com/bolivia/login/res/user_photo.png")));        
        usersList.add(user1);
        
        User user2 = new User();
        user2.setName("manuel");
        user2.setPassword("1234");
        user2.setMail("manuel@gmail.com");
        user2.setPhoto(new ImageIcon(getClass().getResource("/com/bolivia/login/res/user_photo2.jpg")));        
        usersList.add(user2);
    }
    
    /**
     * Valida nick de usuario
     * @return User
     */
    public User validateUser( String nick ){
        for(User u : usersList){
           if(u.getName().equals(nick)) {
               return u;
           }
        }
        return null;
    }
    
    
    
}
