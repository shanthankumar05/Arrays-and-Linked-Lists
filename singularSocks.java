// Question 3: Find the count of singulars in array -

// Skill Mapping: Expert

// Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

// Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}

// Output: Count of singular socks = 3

// Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left

// Socks Id - 20: total count 3 => One pair of socks - 1 singular left

// Socks Id - 30: total count 1 => No pair of socks - 1 singular left

// Socks Id - 50: total count 1 => No pair of socks - 1 singular left

// So, Total number of Singular socks = 3

import java.util.*;
public class singularSocks { 
  public static int countSingularSocks(int[] array)  { 
    HashMap<Integer, Integer> sockCounts = new HashMap<>(); 
    for(int sockId : array)  { 
        if(sockCounts.containsKey(sockId)) 
        { 
          sockCounts.put(sockId, sockCounts.get(sockId) + 1); 
        }
        else 
        {
            sockCounts.put(sockId,1);
        }
    }                  
    int singularSocks =0 ; 
     for(Map.Entry<Integer, Integer> each: sockCounts.entrySet()) {
         if(each.getValue() ==1) 
         singularSocks++; 
        }

        return singularSocks; 
        }
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int[] arrNum = new int[n];
 for (int i = 0; i < n; ++i) {
    arrNum[i] = sc.nextInt();
 }
 int SingularSocksnum = countSingularSocks(arrNum);
 System.out.println("Total  no of singular socks: " + SingularSocksnum);
}
}
