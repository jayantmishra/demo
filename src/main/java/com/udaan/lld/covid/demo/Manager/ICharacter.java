package com.udaan.lld.covid.demo.Manager;

import com.udaan.lld.covid.demo.Exceptions.CovidTrackerException;
import com.udaan.lld.covid.demo.Model.Character;

public interface ICharacter {

    public int create(Character character) throws CovidTrackerException;
}
