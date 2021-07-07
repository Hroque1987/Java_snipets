public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0 ) {
            System.out.println("Invalid Value");
        } else{
            long minutesToYears = (int) minutes / (1440 * 365);
            long minutesToDays = (int) (minutes - (minutesToYears * 365 * 1440)) / 1440 ;

            System.out.println(minutes + " min = " + minutesToYears + " y and " + minutesToDays + " d");

        }


    }
}
