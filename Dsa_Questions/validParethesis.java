package Dsa_Questions;

import java.util.Stack;

public class validParethesis {
    public boolean isValid(String s) {
        Stack<Character> ch=new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='{'||c=='('|| c=='['){
                ch.push(c);
            }
            else {
                if(ch.isEmpty()){
                    return false;
                }
                char top=ch.pop();
                if((c==')'&& top!='(')||(c=='}'&& top!='{') ||( c==']' && top!='[')){
                    return false;
                }
            }
        }
        return ch.isEmpty();
    }

    public static void main(String[] args) {
        validParethesis obj=new validParethesis();
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("()[{}"));
        System.out.println(obj.isValid("([]{})"));
    }
}
