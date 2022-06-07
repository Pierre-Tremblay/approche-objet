package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;

public class TestBanque {
    public static void main(String[] args) {
        Compte newCompte = new Compte(1250, 1000);
        System.out.println(newCompte);
        CompteTaux newCompteTaux = new CompteTaux(120364, 20000, 5);

        Compte[] allComptes = {new Compte(120503, 60000), new CompteTaux(684614521, 80000, 3)};

        ArrayList<Compte> compteArray = new ArrayList<>();
        compteArray.add(new Compte(685298, 120000));
        compteArray.add(new CompteTaux(798521, 78000, 4));

        for (Compte compte : allComptes){
            System.out.println(compte);
        }



    }


}
