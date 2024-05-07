package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

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
    }
}