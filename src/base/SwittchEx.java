package base;

public class SwittchEx {
    public static void main(String[] args) {
        String month = "May";

        switch (month){
            case "Jan" :
                System.out.println("Month is Jan");
//                should not use duplicate case , also case sensitive

            case "May" :
                System.out.println("Month is May");
                break;   // if break statement is not given everything below  this case(True case) will be executed.
            case "June" :
                System.out.println("Month is June");
            case "june" :    // case sensitive
                System.out.println("Month is small letter  june");
            case "nov" :
                System.out.println("Month is nov");

            default :                 System.out.println("None of the above ");  // no break for default


        }

    }
}
