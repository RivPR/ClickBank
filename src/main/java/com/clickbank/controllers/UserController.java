package com.clickbank.controllers;

import com.clickbank.models.User;
import com.clickbank.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by riveramoreira on 7/12/16.
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/email")
    @ResponseBody
    public User getByEmail(String email) {
        String userId, firstName, lastName;

        User user;
        try {

            user = userDao.findByEmail(email);
            userId = String.valueOf(user.getId());
            firstName = String.valueOf(user.getFirstname());
            lastName = String.valueOf(user.getLastname());
            System.out.print("last in try: " + firstName + " " + lastName);
        } catch (Exception exc) {
            System.out.println("ERROR! " + exc.toString());
            user = null;
            return user;
        }
        return user;
    }

    @RequestMapping("/login/{email}/{password}")
    @ResponseBody
    public User login(@PathVariable String email, @PathVariable String password){
        User user;
        System.out.println("Before try in login " + email + " " + password);
        String userId, firstName, lastName;
        try{
            user = userDao.findByEmailAndPassword(email, password);
            userId = String.valueOf(user.getId());
            firstName = String.valueOf(user.getFirstname());
            lastName = String.valueOf(user.getLastname());
            System.out.print("last in try in login: " + firstName + " " + lastName);

        } catch (Exception exc){
            user = null;
            System.out.println("ERROR! " + exc.toString());
            return user;
        }
        return user;
    }


}

