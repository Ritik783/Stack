package Stack;
import java.util.*;
public class ReverseString {
    public static String reversestring_1(String str){
    Stack<Character> s = new Stack<>();
    int i=0;
    while(i<str.length()){
        s.push(str.charAt(i));
        i++;
    }
    StringBuilder result = new StringBuilder("");
    while(!s.isEmpty()){
        char curr = s.pop();
        result = result.append(curr);
    }
    return result.toString();
}
    public static void main(String[] args) {
        String str= "the name is vaibhav88";
        System.out.println(reversestring_1(str));
    }
}
