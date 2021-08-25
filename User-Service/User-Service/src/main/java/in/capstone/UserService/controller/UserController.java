package in.capstone.UserService.controller;

import in.capstone.UserService.model.User;
import in.capstone.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User saveUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

}
