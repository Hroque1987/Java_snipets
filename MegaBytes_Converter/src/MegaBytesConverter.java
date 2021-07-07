public class MegaBytesConverter {

    public static void printMegaBytesAndKyloBytes (int kiloBytes){

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes < 1024) {
            System.out.println(kiloBytes + " KB = 0 MB and " + kiloBytes + " KB");
        } else {

            int megaBytes = kiloBytes / 1024;
            int remainingKyloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = "+ megaBytes +" MB and " + remainingKyloBytes + " KB");


        }

    }
}
