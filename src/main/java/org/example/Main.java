package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {


        // Aktuelles Datum
        LocalDate currentDate = LocalDate.now();
        System.out.println("Aktuelles Datum: " + currentDate);

        // Aktuelle Uhrzeit
        LocalTime currentTime = LocalTime.now();
        System.out.println("Aktuelle Uhrzeit: " + currentTime);

        //Datum mit Zeitspanne
        LocalDate dateInTwoWeeks = currentDate.plusWeeks(2);
        System.out.println("Datum in 2 Wochen: " + dateInTwoWeeks);

        // Angegebenes zukünftiges Datum
        LocalDate futuredate = LocalDate.of(2024,5,3);
        System.out.println("Angegebenes zukünftiges Datum: " + futuredate);

        if(futuredate.isBefore(currentDate)) {
            System.out.println("Das aktuelle Datum liegt vor dem angegebenen zukünftigen Datum. ");
        }else if(futuredate.isAfter(currentDate)) {
            System.out.println("Das aktuelle Datum liegt nach dem angegebenen zukünftigen Datum. ");
        }else {
            System.out.println("Das aktuelle Datum ist das gleiche wie das angegbene zukünftige Datum. ");
        }

        // Differenz Berechnung in Tagen

        // Erste Datum
        LocalDate firstDate = LocalDate.of(2024,6,1);
        System.out.println("Erstes Datum: " + firstDate);

        // Zweite Datum
        LocalDate secondDate = LocalDate.of(2024,7,1);
        System.out.println("Zweites Datum: " + secondDate);

        // Differenz in Tagen berechnen
        long daysDifference = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Differenz in Tagen: " + daysDifference);









    }
}