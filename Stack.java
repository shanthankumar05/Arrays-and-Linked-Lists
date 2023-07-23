// Question 8: Java Stack

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-stack/problem


import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			            String input = sc.next();
            Stack<Character> stk = new Stack<Character>();

            for (char c : input.toCharArray()) {
                if (stk.isEmpty()) {
                    stk.push(c);
                } else {
                    char top = stk.peek();
                    if ((c == '}' && top == '{') || (c == ']' && top == '[') || (c == ')' && top == '(')) {
                        stk.pop();
                    } else {
                        stk.push(c);
                    }
                }
            }

            String toPrint = (stk.isEmpty()) ? "true" : "false";
            System.out.println(toPrint);
        }
    }
}
