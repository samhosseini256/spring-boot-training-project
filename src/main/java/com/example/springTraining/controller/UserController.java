package com.example.springTraining.controller;

import com.example.springTraining.model.UserModel;
import com.example.springTraining.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register-new-user")
    public ResponseEntity<UserModel> registerNewUser(@RequestBody @Valid UserModel userModel){
        return ResponseEntity.ok(userService.registerNewUser(userModel));
    }

    @PostMapping("/register-new-user-mapper")
    public ResponseEntity<UserModel> registerNewUserWithMapper(@RequestBody @Valid UserModel userModel){
        return ResponseEntity.ok(userService.registerNewUserWithMapper(userModel));
    }

    @PostMapping("/register-new-user-bean-utils")
    public ResponseEntity<UserModel> registerNewUserWithBeanUtils(@RequestBody @Valid UserModel userModel){
        return ResponseEntity.ok(userService.registerNewUserWithBeanUtils(userModel));
    }

    @GetMapping("/find-all-users-with-bean-utils")
    public ResponseEntity<List<UserModel>> findAllUsersWithBeanUtils(){
        return ResponseEntity.ok(userService.findAllUsersWithBeanUtils());
    }

    @GetMapping("/find-all-users-with-mapper")
    public ResponseEntity<List<UserModel>> findAllUsersWithMapper(){
        return ResponseEntity.ok(userService.findAllUsersWithMapper());
    }

}