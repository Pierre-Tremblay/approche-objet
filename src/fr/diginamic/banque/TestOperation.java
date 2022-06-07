package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.util.ArrayList;

public class TestOperation {
    public static void main(String[] args) {
        double total = 0;

        ArrayList<Operation> allOperations = new ArrayList<>();
        allOperations.add(new Credit("26-02-2015", 250));
        allOperations.add(new Credit("15-02-2016", 136));
        allOperations.add(new Debit("23-09-2010", 250));
        allOperations.add(new Debit("19-08-2013", 300));


        for (Operation operation : allOperations
        ) {
            if (operation.getType().equals("DEBIT")) {
                total -= operation.getMontantOperation();

            } else if (operation instanceof Credit) {
                total += operation.getMontantOperation();
            }
            System.out.println(operation.getType() + " Date : " + operation.getDateOperation() + " Montant : " + operation.getMontantOperation());

        }
        if (total < 0) {
            System.out.println("Vous êtes dans la panade");
            System.out.println("Solde total : " + total);
        } else {
            System.out.println("Vous êtes en positif, bien joué");
            System.out.println("Solde total : " + total);
        }

    }
}
