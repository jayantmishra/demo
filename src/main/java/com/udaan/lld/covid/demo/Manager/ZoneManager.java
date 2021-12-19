package com.udaan.lld.covid.demo.Manager;


import com.udaan.lld.covid.demo.Model.Character;
import com.udaan.lld.covid.demo.Model.Zone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZoneManager {

   HashMap<String, Zone> zoneMap = new HashMap<>();

    UserManager userManager;


    public Zone getZone(String pinCode){
        return zoneMap.get(pinCode);
    }

    public Zone getZoneStatus(String pinCode){
        Map<String , ArrayList<Character>> pinUserMap = userManager.userPinMap;

        for (String pin : pinUserMap.keySet()){
            List<Character> users = pinUserMap.get(pin);
            int count  =0 ;

            for (Character user: users){
                if (user.getAssessment().isPatient())
                    count++;
            }

        }

        return null;
    }
}
