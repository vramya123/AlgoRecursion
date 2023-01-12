
/*
Reference Youtube Link for explanation : https://www.youtube.com/watch?v=or-hWONlCgg&list=PLvg-AaxR3aaZk13DjSEznf848b9lBTeY1&index=5
- Recursion on subsequence
- Subsequence in all possible combination which may be contiguous or not contiguous.
eg : {1,2,3} => {}, {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}

- i/p:- abcd

- o/p of code:-
abcd
abc
abd
ab
acd
ac
ad
a
bcd
bc
bd
b
cd
c
d

  
 */

public class Solution{
    
    public static void helper(String s, String tmp, int index){
        //Base condition
        if(index == s.length()) {
            System.out.println(tmp);
            return;
        }
        
        //Consider the subsequence with addition of the new char
        helper(s,tmp+s.charAt(index),index+1);
        
        //Dp not Consider the subsequence with addition of the new char
        helper(s,tmp,index+1);
        
    }
    
    public static void main(String[] args){
        String s = "abcd";
        helper(s,"",0);
    }
    
}
