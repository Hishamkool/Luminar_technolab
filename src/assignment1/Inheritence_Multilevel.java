package assignment1;
//MULTILEVEL INHERITENCE hisham

class  Employee{
     int basic_pay = 30000;
     int working_days=20;
     int working_hours = 8;
     void text(){
         System.out.println("Im a normal employee");
     }

}
class Manager extends Employee{
    int basic_pay1 = 40000;
    void text1(){
        System.out.println("Im the manager of the company and,");
    }

//    @Override
//    void text() {
//        super.text();
//        System.out.println("Im the manager of the company and,\n");
//    }
}
class CEO extends Manager{
    int pay= 50000;
    int working_hours2 = 6;
    int working_days2=10;
    void text2(){
        System.out.println("Im the CEO of the company and,");
    }
}
public class Inheritence_Multilevel {
    public static void main(String[] args) {
    CEO ceo = new CEO();
    ceo.text();
    System.out.println("I work "+ceo.working_hours+" hours a day and "+ceo.working_days+" days a month"+"\nand get paid ₹"+ceo.basic_pay+".\n");
    ceo.text1();
    System.out.println("I work "+ceo.working_hours+" hours a day and "+ceo.working_days+" days a month"+"\nand get paid ₹"+ceo.basic_pay1+".\n");
    ceo.text2();
    System.out.println("I work "+ceo.working_hours2+" hours a day and "+ceo.working_days2+" days a month"+"\nand get paid ₹"+ceo.pay+".\n");
    }
}
