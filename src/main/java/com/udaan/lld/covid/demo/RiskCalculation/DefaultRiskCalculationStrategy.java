package com.udaan.lld.covid.demo.RiskCalculation;

import com.udaan.lld.covid.demo.Exceptions.CovidTrackerException;
import com.udaan.lld.covid.demo.Model.Character;

public class DefaultRiskCalculationStrategy implements IRiskCalculation{
    @Override
    public int calculateRisk(Character character) throws CovidTrackerException {

        if (character.getAssessment().contactWithPatient == false
        && character.getAssessment().travelHistory ==false
        && character.getAssessment().getSymptoms().size() == 0)
            return 5;

        else if (character.getAssessment().getSymptoms().size() == 1
                && (character.getAssessment().contactWithPatient == true||
                character.getAssessment().travelHistory == true))
            return 50;

        else if (character.getAssessment().getSymptoms().size() == 2
                && (character.getAssessment().contactWithPatient == true||
                character.getAssessment().travelHistory == true))
            return 75;

        else
            return 95;
    }
}
