package com.si.profile.userprofile.controller;

import com.si.profile.userprofile.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/users",method = RequestMethod.GET)
public class UserController {


    @RequestMapping(path = "/{user_id}",method = RequestMethod.GET)
    public @ResponseBody User fetchUser(@PathVariable(name = "user_id",required = true) Integer user_id)
    {
        if(null == user_id) {
            throw new IllegalArgumentException("User ID cannot be null");
        }

        User u = new User();
            u.setAge(44);
            u.setName("Rajat Mehta");
            u.setEmail("raajta.@.asdfa.com");
            u.setStatus("Looking for job");

            return u;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User registerNewUser(User inputUser) {
        return null;
    }

}
