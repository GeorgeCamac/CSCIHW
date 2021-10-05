

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");

        Pyramid.Output();
        Pyramid test = new Pyramid();
        test.Output();
        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        
<<<<<<< HEAD
        Adlibs me = new Adlibs();
        System.out.println(me.story("george", "18", "blue"));
        System.out.println(me.story("george", "18", "orange"));;
=======
>>>>>>> 7c8452a8e6d8fa0877c7887930820d34ca65de6b
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        String hi = "hello people";
        Replace testString = new Replace();
        System.out.println(testString.charReplace(hi, 6,'c'));
        
    }
}
