import java.util.Scanner;

public class Vakantie2 {
    public static void main(String[] args) {
        Raden gok1 = new Raden();
        gok1.spelRaden();
        if (gok1.spelRaden() == false){
            Afronden stoppen = new Afronden();
            stoppen.afronden();
        }

    }

}
    class Raden {
        boolean spelRaden() {
            System.out.println("Ik ga op vakantie en neem mee...");
            Scanner input = new Scanner(System.in);
            String attribuut1 = input.nextLine();
            System.out.println("Ik neem mee een " + attribuut1);
            char letter = attribuut1.charAt(0);
            System.out.println("Je volgende woord moet beginnen met de letter " + letter);
            Scanner input2 = new Scanner(System.in);
            String attribuut2 = input2.nextLine();
            char laatsteLetter2 = attribuut2.charAt(0);

            if (laatsteLetter2 != letter) {
                System.out.println("Je bent af");
                return false;
            } else {
                System.out.println("Heel goed!");
                spelRaden();

            }



    

    class Afronden{
        public void afronden() {
            System.out.println("Wil je stoppen?");
        }
    }


