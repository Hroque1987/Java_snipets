public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature) {
        int maxPlayingTemperature = 35;
        if (summer) {
            maxPlayingTemperature = 45;
        }
        if (temperature >= 25 && temperature <= maxPlayingTemperature) {
            return true;
        } else {
            return false;
        }
    }
}
