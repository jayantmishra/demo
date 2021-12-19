package com.udaan.lld.covid.demo.RiskCalculation;

import com.udaan.lld.covid.demo.Model.Character;

public class RiskCalculationContext {

    IRiskCalculation riskCalculation ;

    public RiskCalculationContext(IRiskCalculation riskCalculation) {
        this.riskCalculation = riskCalculation;
    }

    public int calculateRisk(Character character){

        return riskCalculation.calculateRisk(character);
    }
}
