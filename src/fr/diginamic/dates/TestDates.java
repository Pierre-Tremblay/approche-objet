package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) throws ParseException {


        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy" );
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" );

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String chaineDate = formateur.format(date);
        System.out.println(chaineDate);

        String chaineDate2 = formateur2.format(date);
        System.out.println(chaineDate2);







    }
}
