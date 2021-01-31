package com.company.Sauces;

import com.company.Sandwich;
import com.company.Sauces.Sauces;

public class BBQSauce extends Sauces {

    public BBQSauce(Sandwich sandwich) {
        this.name = "BBQ Sauce";
        this.sandwich = sandwich;
    }

}