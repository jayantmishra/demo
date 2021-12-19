package com.udaan.lld.covid.demo.Controller;

import com.udaan.lld.covid.demo.Manager.AdminManager;
import com.udaan.lld.covid.demo.Model.Character;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;

public class AdminController {

    private AdminManager adminManager;


    @PatchMapping("/registerAdmin")
    public ResponseEntity registerAdmin(String userName, String userNumber, String userPinCode){

        int userId =  adminManager.create(new Character(userName, userNumber, userPinCode, true));
        return ResponseEntity.ok("{adminId : " + userId);
    }

}
