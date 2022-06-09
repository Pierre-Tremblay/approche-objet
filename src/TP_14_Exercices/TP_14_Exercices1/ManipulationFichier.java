package TP_14_Exercices.TP_14_Exercices1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path pathOrigine = Paths.get("E:/Diginamic/Cours/Java_Poo/recensement.csv");
        Path pathDestination = Paths.get("E:/Diginamic/approche-objet/src/TP_14_Exercices/TP_14_Exercices1/fichier/recensement2.csv");

        List<String> inputLines = Files.readAllLines(pathOrigine);
        List<String> outputLines = new ArrayList<>();

        /*
        Code Departement: colonne 3
        Nom de ville : colonne 7
        population totale 10
         */

        for (String line : inputLines) {
            if (inputLines.indexOf(line) != 0) {
                String[] items = line.split(";");
                String sansEspace = items[9].trim().replaceAll(" ", "");
                long populationTotal = -1;
                try {
                    populationTotal = Long.parseLong(sansEspace);
                } catch (NumberFormatException e) {

                }


                if (populationTotal > 25000) {
                    String codeDepartement = items[2];
                    String nomville = items[6];
                    outputLines.add(nomville + ";" + codeDepartement + ";" + populationTotal);
                }
            }

        }


      Files.write(pathDestination, outputLines, StandardOpenOption.APPEND);


    }
}
