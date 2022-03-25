package assignment2;


import java.util.Scanner;

class pareent {
    void show() {
        System.out.println("Your account details are:");
    }
}

class persson1 extends pareent {

    //    void details(long ano, int bal, String na) {
//
//        System.out.println("Name =\t" + na + "\naccount no.\t" + ano + "\nBalance =\t₹" + bal);
//    int balance1 =

    //    }
    void details(int selection, int n) {
        int ano = 123456789;
        int bal = 80000;
        if (selection == 2) {
            bal += n;
        }
        if (selection == 3) {
            bal -= n;
        }

//        balance1 = bal;
        String na = "Muhammed hisham";
        System.out.println("Name =\t" + na + "\naccount no.\t" + ano + "\nBalance =\t₹" + bal);
    }
}

class persson2 extends pareent {

    void details1(int selection, int n) {
        int ano = 123456789;
        int bal = 80000;
        if (selection == 2) {
            bal += n;
        }
        if (selection == 3) {
            bal -= n;
        }

//        balance1 = bal;
        String na = "Ravi kumar";
        System.out.println("Name =\t" + na + "\naccount no.\t" + ano + "\nBalance =\t₹" + bal);
    }

}

//class deposit extends person1 {
//    void accept(int n) {
//        System.out.println("Previous balance= " + balance1);
//        balance1 += n;
//        System.out.println("balance= " + balance1);
//        System.out.println("New balance= " + balance1);
//
//    }
//
//}


public class Bankapplication1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        person1 c1 = new person1();
//        c1.details(123456789, 80000, "Muhammed hisham"); //comment this
        person2 c2 = new person2();
//        c2.details1(987654321, 75000, "Ravi"); //comment this
        System.out.println("Services\n1.Check Balance\n2.deposit money\n3.Withdraw money\n \nEnter your choice\t");
        int selection = sc.nextInt();
        System.out.println("Enter cvv and pin to access the data\n [eg. account : cvv: 383 and pin 123 ]");
        System.out.println("Enter cvv:\t");
        int pin = sc.nextInt();

//        deposit dep = new deposit();


        switch (pin) {

            case 383:
                System.out.println("Enter pin");
                int pin1 = sc.nextInt();
                if (pin1 == 123) {
                    c1.details(selection, 0);

                    if (selection == 2) {
                        System.out.println("Enter amount");
                        int n = sc.nextInt();
//                        dep.accept(n);
                        c1.details(selection, n);
                    }
                    if (selection == 3) {
                        System.out.println("Enter amount");
                        int n = sc.nextInt();
//                        dep.accept(n);
                        c1.details(selection, n);
                    }
                }
                break;

            case 127:
                System.out.println("Enter pin");
                int pin2 = sc.nextInt();
                if (pin2 == 123) {
                    c2.details1(selection, 0);

                    if (selection == 2) {
                        System.out.println("Enter amount");
                        int n1 = sc.nextInt();
//                        dep.accept(n);
                        c2.details1(selection, n1);
                    }
                    if (selection == 3) {
                        System.out.println("Enter amount");
                        int n = sc.nextInt();
//                        dep.accept(n);
                        c1.details(selection, n);
                    }
                }
                break;

            default:
                System.out.println("Account no. not found");

        }


    }
}



