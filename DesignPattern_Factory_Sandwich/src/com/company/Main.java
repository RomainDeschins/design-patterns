package com.company;

import com.company.Sandwiches.Sandwich;
import com.company.Shops.*;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserInputValidation userInputValidation = new UserInputValidation();
        LaSandwicherie userSandwicherie = userInputValidation.chooseLocation();
        userInputValidation.chooseSandwich(userSandwicherie);

    }
}
