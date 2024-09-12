package lavisores;

import java.util.Scanner;

public class Account {
    Accounts accountsManager = new Accounts();

    public void collectAccounts() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of accounts to add: ");
        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("First Name: ");
            String fName = input.next();
            System.out.print("Last Name: ");
            String lName = input.next();
            System.out.print("Email: ");
            String emailAddr = input.next();
            System.out.print("Username: ");
            String user = input.next();
            System.out.print("Password: ");
            String pass = input.next();

            accountsManager.addAccount(fName, lName, emailAddr, user, pass);
        }

        accountsManager.displayAccounts();
    }
}
