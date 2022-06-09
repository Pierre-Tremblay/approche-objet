package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Locale ruLocale = new Locale("ru");
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy" );
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" );

        SimpleDateFormat formateur3 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE );
        SimpleDateFormat formateur4 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.GERMAN );
        SimpleDateFormat formateur5 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINESE );
        SimpleDateFormat formateur6 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", ruLocale);

        Date date1 = new Date("05/19/2016 23:39:30");
        String chaineDate = formateur.format(date1);
        System.out.println(chaineDate);

        Calendar cal = Calendar.getInstance();
        Date date2 = cal.getTime();
        String chaineDate2 = formateur2.format(date2);
        System.out.println(chaineDate2);

        String chaineDate3 = formateur3.format(date2);
        System.out.println(chaineDate3);

        String chaineDate4 = formateur4.format(date2);
        System.out.println(chaineDate4);

        String chaineDate5 = formateur5.format(date2);
        System.out.println(chaineDate5);

        String chaineDate6 = formateur6.format(date2);
        System.out.println(chaineDate6);




    }
}
