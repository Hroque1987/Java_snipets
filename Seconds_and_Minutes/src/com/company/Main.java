package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 01));
    }

    private static String getDurationString (int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59 ){
            return "Invalid Value";
        }
        int howManyHours = (minutes / 60);
        int remainingMinutes = (minutes - howManyHours * 60);
        return howManyHours + "h " + remainingMinutes + "m " + seconds +"s";


    }

    private static String getDurationString (int seconds) {
        if (seconds <= 0){
            return "Invalid Value";
        }

        int howManyMinutes = seconds / 60;
        int remainingSeconds = seconds - howManyMinutes * 60 ;
        return getDurationString(howManyMinutes, remainingSeconds);

    }




}
