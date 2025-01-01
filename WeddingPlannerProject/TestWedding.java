import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get wedding date
        System.out.print("Enter month of wedding: ");
        int month = input.nextInt();
        System.out.print("Enter day of wedding: ");
        int day = input.nextInt();
        System.out.print("Enter year of wedding: ");
        int year = input.nextInt();
        LocalDate weddingDate = LocalDate.of(year, month, day);

        // Get bride details
        System.out.print("Enter first name of bride: ");
        String brideFirstName = input.next();
        System.out.print("Enter last name of bride: ");
        String brideLastName = input.next();
        Person bride = new Person(brideFirstName, brideLastName);

        // Get groom details
        System.out.print("Enter first name of groom: ");
        String groomFirstName = input.next();
        System.out.print("Enter last name of groom: ");
        String groomLastName = input.next();
        Person groom = new Person(groomFirstName, groomLastName);

        // Get location details
        System.out.print("Enter location of wedding: ");
        input.nextLine(); // Consume leftover newline
        String location = input.nextLine();

        // Create Couple and Wedding objects
        Couple couple = new Couple(bride, groom);
        Wedding wedding = new Wedding(couple, weddingDate, location);

        // Display wedding details
        System.out.println("\n" + brideLastName + "/" + groomLastName + " Wedding");
        System.out.println("Date: " + wedding.getWeddingDate() + "   Location: " + wedding.getLocation());
        System.out.println("Bride: " + brideFirstName + " " + brideLastName);
        System.out.println("Groom: " + groomFirstName + " " + groomLastName);

        input.close();
    }
}
