
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// EX I MAKE BREAD, 2, T
//    I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {
    public String charReplace(String s, int x, char z) {
        String newString = "";
        int counter = 0;
        if (s.charAt(x) != z){
            while (counter != x){
                newString = newString + s.charAt(counter);
                counter ++;
            }
            newString = newString + z;
            counter++;
            while (newString.length() != s.length()){
                newString = newString + s.charAt(counter);
                counter++;
            }
            return newString;
        }
        else{
            return s;
        }        
    }
    
}
