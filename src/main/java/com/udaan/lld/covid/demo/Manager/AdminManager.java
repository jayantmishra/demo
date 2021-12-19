package com.udaan.lld.covid.demo.Manager;

import com.udaan.lld.covid.demo.Exceptions.CovidTrackerException;
import com.udaan.lld.covid.demo.Exceptions.InvalidAdminException;
import com.udaan.lld.covid.demo.Exceptions.InvalidUserException;
import com.udaan.lld.covid.demo.Model.Character;
import com.udaan.lld.covid.demo.Utilities.Utils;

import java.util.HashMap;
import java.util.Map;

public class AdminManager implements ICharacter{

    public static  final int MAX_ALLOWED_ADMINS = 10;
    public static int currAdminId = 0;

    Map<Integer, Character> adminMap = new HashMap<>();
    @Override
    public int create(Character character) throws CovidTrackerException {
        if (!Utils.isAdmin(character))
            throw  new InvalidAdminException("user is not admin");
        int id = getNextAdminId();

        return id;
    }

    private int getNextAdminId(){
        int newId = currAdminId+1;
        if (newId > MAX_ALLOWED_ADMINS)
            throw new InvalidUserException("admin limit reached");
        else
            return newId;
    }
}
