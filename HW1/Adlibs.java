<<<<<<< HEAD
import javax.lang.model.util.ElementScanner14;

// make a method that accepts 3 Strings (Someones name, age, and favorite color and then returns a story about them)
=======
package HW1;
// make a method that accepts 2 Strings and 1 int (Someones name, age, and favorite color and then returns a story about them)
>>>>>>> 7c8452a8e6d8fa0877c7887930820d34ca65de6b
// Hint1: The objects name is Adlibs and you require a name age and favoriteColor all in strings
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"
public class Adlibs {
<<<<<<< HEAD
    public  String story(String name, String age, String favoriteColor) {
        String badColor = "blue";
        String badColor1 = "purple";
        if (favoriteColor.contains(badColor)){
            return "Hi everyone I am " + name + " I have been on this earth for " + age + 
            " years and I hate the color " + badColor1 + " but love the color " + favoriteColor;
        }
        else {
            return "Hi everyone I am " + name + " I have been on this earth for " + age + 
            " years and I hate the color " + badColor + " but love the color " + favoriteColor;
        }
        
=======
    public  String story(String name, int age, String favoriteColor) {
        return null;
>>>>>>> 7c8452a8e6d8fa0877c7887930820d34ca65de6b
    }
}
