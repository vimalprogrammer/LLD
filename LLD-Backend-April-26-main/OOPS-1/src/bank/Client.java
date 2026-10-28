package bank;

public class Client {

    public static void main(String[] args) {
//        Student s = new Student();
//        s.name = "Virat";
//        s.age = 37;
//        s.universityName = "ABC";
//        s.email = "viko@gmail.com";
//        System.out.println("DEBUG");
//        System.out.println(s.name);
//
//        s.attendClass();

      //  BankAccount b1 = new BankAccount();
      //  b1.ownerName = "ABC";
      //  b1.balance = 1000;

      //  b1.withdraw(500);
       // b1.deposit(1000);

        BankAccount b1 = new BankAccount();
        b1.setOwnerName("ABC");
        System.out.println(b1.getOwnerName());
    }
}
