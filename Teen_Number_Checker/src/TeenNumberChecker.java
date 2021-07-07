public class TeenNumberChecker {

    public static boolean hasTeen (int number1, int number2, int number3) {

        if (number1 >= 13 && number1 <= 19) {
            return true;
        } else if (number2 >= 13 && number2 <= 19) {
            return true;
        } else if (number3 >= 13 && number3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int number){
        if (number >= 13 && number <= 19) {
            return true;
        } else {
            return false;
        }

    }
}
