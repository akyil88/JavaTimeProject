package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Aktuelles Datum: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Aktuelle Uhrzeit: " + currentTime);
    }
}