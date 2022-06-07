package fr.diginamic.banque.dao;

import fr.diginamic.banque.entites.Compte;

import java.util.ArrayList;
import java.util.List;

public class CompteDaoMem implements CompteDao {

    private final List<Compte> comptes = new ArrayList<>();

    @Override
    public List<Compte> lister() {
        return comptes;
    }

    @Override
    public void sauvegarder(Compte nvCompte) {
        comptes.add(nvCompte);

    }

    @Override
    public boolean supprimer(String numero) {
        for (Compte compte : comptes) {
            if (compte.getNumCompte().equals(numero)) {
                comptes.remove(compte);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existe(String numero) {
        for (Compte compte : comptes) {
            if (compte.getNumCompte().equals(numero)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Compte getCompte(String numero) {
        for (Compte compte : comptes) {
            if (compte.getNumCompte().equals(numero)) {
                return compte;
            }
        }
        return null;
    }
}
