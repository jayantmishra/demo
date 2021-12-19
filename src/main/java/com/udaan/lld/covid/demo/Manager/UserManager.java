package com.udaan.lld.covid.demo.Manager;

import com.udaan.lld.covid.demo.Exceptions.CovidTrackerException;
import com.udaan.lld.covid.demo.Exceptions.InvalidUserException;
import com.udaan.lld.covid.demo.Model.Character;
import com.udaan.lld.covid.demo.Utilities.Utils;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class UserManager implements ICharacter{

    public static final int MAX_ALLOWED_USER  = 10000;
    public static int currId= 0;
    Map<Integer, Character> userMap = new HashMap<>();
    @Override
    public int create(Character character) throws CovidTrackerException {
        if(Utils.isAdmin(character))
            throw new InvalidUserException("user is admin instead of user");

        int id = getNextUserId();
        userMap.put(id, character);
        return id;
    }

    public void addSymptom(int userId, String symptom) throws CovidTrackerException{
        if (!userMap.containsKey(userId))
            throw new InvalidUserException("User not present");

        Character character = userMap.get(userId);
        character.getAssessment().getSymptoms().add(symptom);
    }

    public void addTravelHistory(int userId){
        if (!userMap.containsKey(userId))
            throw new InvalidUserException("User not present");

        Character character = userMap.get(userId);
        character.getAssessment().setTravelHistory(true);
    }

    public void addContactHistory(int userId){
        if (!userMap.containsKey(userId))
            throw new InvalidUserException("User not present");

        Character character = userMap.get(userId);
        character.getAssessment().setContactWithPatient(true);
    }


    private int getNextUserId(){
        int newId = currId+1;
        if (newId > MAX_ALLOWED_USER)
            throw new InvalidUserException("user limit reached");
        else
            return newId;
    }



}
