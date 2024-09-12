package lavisores;

import java.util.ArrayList;

public class Accounts {
    ArrayList<AccountDetails> accounts = new ArrayList<>();

    public void addAccount(String fName, String lName, String emailAddr, String user, String pass) {
        accounts.add(new AccountDetails(fName, lName, emailAddr, user, pass));
    }

    public void displayAccounts() {
        for (AccountDetails acc : accounts) {
            System.out.println(acc);
        }
    }
}

class AccountDetails {
    static int accountIdCounter = 0;
    int accId;
    String fName, lName, emailAddr, user, pass;

    public AccountDetails(String fName, String lName, String emailAddr, String user, String pass) {
        this.accId = ++accountIdCounter;
        this.fName = fName;
        this.lName = lName;
        this.emailAddr = emailAddr;
        this.user = user;
        this.pass = pass;
    }

    public String toString() {
        return "ID: " + accId + ", " + fName + " " + lName + ", Email: " + emailAddr + ", Username: " + user + 
               ", Password: " + pass;
    }
}
