package com.javaspringdatarestendpoint.javaspringdatarest.contollers;

import com.javaspringdatarestendpoint.javaspringdatarest.entities.User;
import com.javaspringdatarestendpoint.javaspringdatarest.entities.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    UserRepository userRepository = null;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/start")
    public String start(){
        return "Hellow Spring Data Rest";
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {

        List<User> users = null;
        User user = new User();
        user.setUserId("Test user id");
        user.setFirstName("Test1");
        user.setLastName("test1");
        user.setPhone("phone");
        users.add(user);

        return users;
    }
}
