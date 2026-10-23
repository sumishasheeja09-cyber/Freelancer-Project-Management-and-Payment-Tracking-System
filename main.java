import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Client
        System.out.print("Enter Client ID: ");
        int cid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Client Name: ");
        String cname = sc.nextLine();

        System.out.print("Enter Client Email: ");
        String email = sc.nextLine();

        Client client = new Client(cid, cname, email);

        // Create Project
        System.out.print("Enter Project ID: ");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Project Name: ");
        String pname = sc.nextLine();

        System.out.print("Enter Budget: ");
        double budget = sc.nextDouble();

        Project project = new Project(pid, pname, client, budget);

        // Payment
        System.out.print("Enter Payment ID: ");
        int payId = sc.nextInt();

        System.out.print("Enter Amount Paid: ");
        double amount = sc.nextDouble();

        Payment payment = new Payment(payId, project, amount);

        // Display Data
        System.out.println("\n===== DETAILS =====");
        project.displayProject();
        payment.displayPayment();

        sc.close();
    }
}