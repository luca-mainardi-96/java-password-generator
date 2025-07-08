import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String name = scan.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String surname = scan.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String favouriteColor = scan.nextLine();

        System.out.print("Inserisci la tua data di nascita (DD/MM/YYYY): ");
        String dateOfBirth = scan.next();

        String dayString = dateOfBirth.substring(0, 2);
        String monthString = dateOfBirth.substring(3, 5);
        String yearString = dateOfBirth.substring(6, 10);

        int day = Integer.parseInt(dayString);
        int month = Integer.parseInt(monthString);
        int year = Integer.parseInt(yearString);

        int dateSum = day + month + year;

        System.out.print("la tua password è " + name + "-" + surname + "-" + favouriteColor + "-" + dateSum);

    }
}


