package com.udaan.lld.covid.demo.RiskCalculation;

import com.udaan.lld.covid.demo.Exceptions.CovidTrackerException;
import com.udaan.lld.covid.demo.Model.Character;

public interface IRiskCalculation {

    public int calculateRisk(Character character) throws CovidTrackerException;
}
