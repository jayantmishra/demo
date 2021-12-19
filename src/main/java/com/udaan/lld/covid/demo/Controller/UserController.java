package com.udaan.lld.covid.demo.Controller;

import com.udaan.lld.covid.demo.Manager.UserManager;
import com.udaan.lld.covid.demo.Model.Character;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserManager userManager;

    @PostMapping("/registerUser")
    public ResponseEntity registerUser(String userName, String userNumber, String userPinCode){

       int userId =  userManager.create(new Character(userName, userNumber, userPinCode, false));
       return ResponseEntity.ok("{userId : " + userId);
    }

    @PostMapping("/addSymptom")
    public ResponseEntity addSymptom(int userId, String symptom){

        userManager.addSymptom(userId, symptom);
        return ResponseEntity.ok("");
    }

    @PostMapping("/addTravelHistory")
    public ResponseEntity addTravelHistory(int userId){

        userManager.addTravelHistory( userId);
        return ResponseEntity.ok("");

    }

    @PatchMapping("/addContactWithPatient")
    public ResponseEntity addContactWithPatient(int userId){

        userManager.addContactHistory( userId);
        return ResponseEntity.ok(" ");
    }
}
