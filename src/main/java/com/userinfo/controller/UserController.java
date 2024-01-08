//package com.userinfo.controller;
//
//import com.userinfo.model.UserData;
//import com.userinfo.repo.UserRepo;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//@Autowired
//private UserRepo userRepo;
//    @GetMapping("/")
//    public ResponseEntity<List<UserData>> getAllUsers(){
//
//        return ResponseEntity.ok(userRepo.findAll());
//    }
//
//    @PostMapping("/add")
//    public  ResponseEntity addUser(HttpServletRequest request, @RequestBody UserData userData){
//
//        return ResponseEntity.ok(userRepo.save(userData));
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity updateUser(HttpServletRequest request, @RequestBody UserData userData){
//
//        return ResponseEntity.ok(userRepo.save(userData));
//    }
//
//    @DeleteMapping("/delete")
//    public ResponseEntity<String> deleteUser(HttpServletRequest request,@PathVariable long userId){
//
//        userRepo.deleteById(userId);
//        return ResponseEntity.ok("user deleted successfully!");
//    }
//
//
//}
