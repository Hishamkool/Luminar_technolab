package pack1;

public class a {
     String course ="Andriod"; //can be acces only in the same class
    //                           protected outside package canNot be used

    public static void main(String[] args) {
        a obj  = new a();
        System.out.println("Iam doing a course in "+obj.course);


    }




}

