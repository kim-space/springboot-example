package com.kimtd.api;

import com.kimtd.api.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/users")
public class UserController {

    private Map<Long,User> users = new ConcurrentHashMap<>();

    @GetMapping
    public List<User> getUsers(){
      return new ArrayList<>(this.users.values());
    }

    @PostMapping
    public String postUser(@ModelAttribute User user){
        users.put(user.getId(),user);
        return "success";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @PutMapping("/{id}")
    public String putUser(@PathVariable Long id,@ModelAttribute User user){
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id,u);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String delUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }



}
