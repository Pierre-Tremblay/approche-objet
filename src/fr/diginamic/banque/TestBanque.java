package fr.diginamic.banque;

import fr.diginamic.banque.dao.CompteDao;
import fr.diginamic.banque.dao.CompteDaoMem;
import fr.diginamic.banque.entites.*;

import java.util.List;
import java.util.Scanner;

public class TestBanque {
    static CompteDao compteDao = new CompteDaoMem();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        initMenu();


    }

    public static void afficherMenu() {
        System.out.println("***** Administration des comptes *****");
        System.out.println("1. Lister les comptes");
        System.out.println("2. Ajouter un nouveau compte");
        System.out.println("3. Ajouter une opération à un compte");
        System.out.println("4. Supprimer un compte");
        System.out.println("99. Sortir");

    }

    public static void initMenu() {


        int choix;
        do {
            afficherMenu();
            choix = sc.nextInt();
            switch (choix) {
                case 1 -> lister();
                case 2 -> ajouterCompte();
                case 3 -> {
                    lister();
                    ajouterOperationCompte();
                }
                case 4 -> {
                    lister();
                    supprimerCompte();
                }
                case 99 -> {
                    System.out.println("Au revoir");
                    sc.close();
                }
                default -> System.out.println("Merci de renseigner un des nombres exigés");
            }
        } while (choix != 99);


    }

    public static void lister() {
        List<Compte> comptes = compteDao.lister();
        if (comptes.size() == 0) {
            System.err.println("Aucun compte trouvé");
        } else {
            for (Compte compte : comptes) {
                System.out.println(compte);
            }
        }
    }

    public static void ajouterCompte() {
        sc.nextLine();
        System.out.println("Veuillez sasir le numéro :");
        String numCompte = sc.nextLine();
        System.out.println("Veuillez sasir le solde initial :");
        int soldCompte = sc.nextInt();
        System.out.println("Veuillez sasir le type de compte (1: NORMAL, 2: REMUNERE):");
        int typeCompte = sc.nextInt();

        if (typeCompte == 1) {
            compteDao.sauvegarder(new Compte(numCompte, soldCompte));
        } else if (typeCompte == 2) {
            System.out.println("Veuillez saisir le taux :");
            double tauxCompte = sc.nextDouble();
            compteDao.sauvegarder(new CompteTaux(numCompte, soldCompte, tauxCompte));

        } else {
            System.err.println("Choix incorrect");
        }


    }

    public static void ajouterOperationCompte() {
        sc.nextLine();

        System.out.println("Veuillez choisir le numéro de compte concerné ");
        String numCompte = sc.nextLine();
        if (!compteDao.existe(numCompte)) {
            System.err.println("Aucun compte trouvé");
        } else {
            System.out.println("Veuillez saisir le type d’opération (1 : CREDIT, 2 : DEBIT):");
            int typeOperation = sc.nextInt();
            sc.nextLine();
            System.out.println("Veuillez saisir la date :");
            String dateOperation = sc.nextLine();
            System.out.println("Veuillez saisir le montant :");
            double montantOperation = sc.nextDouble();

            Compte compteActuel = compteDao.getCompte(numCompte);
            double montantInital = compteActuel.getSoldCompte();
            int ajouterOperation = compteActuel.getNbOperations();

            if (typeOperation == 1) {
                Operation credit = new Credit(dateOperation, montantOperation);
                compteActuel.setSoldCompte(montantInital + credit.getMontantOperation());

                compteActuel.setNbOperations(++ajouterOperation);

            } else if (typeOperation == 2) {
                Operation debit = new Debit(dateOperation, montantOperation);
                compteActuel.setSoldCompte(montantInital - debit.getMontantOperation());
                compteActuel.setNbOperations(++ajouterOperation);
            } else {
                System.err.println("Choix incorrect");
            }
        }


    }

    public static void supprimerCompte() {
        sc.nextLine();
        System.out.println("Veuillez saisir le numéro de compte à supprimer :");
        String numCompte = sc.nextLine();

        if (!compteDao.existe(numCompte)) {
            System.err.println("Aucun compte trouvé");

        } else {
            compteDao.supprimer(numCompte);
            System.out.println(numCompte + "Compte supprimé");
        }

    }


}
