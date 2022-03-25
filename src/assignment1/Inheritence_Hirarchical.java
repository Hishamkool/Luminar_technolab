package assignment1;

class animals {
    void details(String color, int age, String name) {
//         String sithsence ="Do not  have";
        System.out.println("Colour is " + color);
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }
}
    class dog extends animals {
        String food = "busicuts";
        String lifeexpectency = " between 10 and 13 years";
        String start = "The dogs ,";

    }
    class cat extends animals {
        String food = "Fish";
        String lifeexpectancy = "13 to 17 years";
        String start = "The cats ,";
    }
  public class Inheritence_Hirarchical {
        public static void main(String[] args) {
        dog puppy = new dog();
        System.out.println(puppy.start);
        puppy.details("brown", 7, "Bob");
        System.out.println("Eats  " + puppy.food +"\n"+"and average lifespan is" + puppy.lifeexpectency+"\n"+"__________________");
        cat kitty = new cat();
        System.out.println(kitty.start);
        kitty.details("white with brown", 3, "Mittu");
        System.out.println("The cats food is " + kitty.food + " and average lifespan is" + kitty.lifeexpectancy);
        }
    }
