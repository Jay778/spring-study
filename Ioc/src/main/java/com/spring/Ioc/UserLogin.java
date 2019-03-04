package com.spring.Ioc;

/**
 * Created by 94921 on 2019/3/4.
 */
public class UserLogin {
private User user;
    public UserLogin(User user) {
        this.user = user;
    }
public UserLogin(){

}
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean userLogin(User user){
     if (user.getAccount().equals("admin")&&user.getPassword().equals("111")){
         return true;
     }
         return false;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "user=" + user +
                '}';
    }
}
