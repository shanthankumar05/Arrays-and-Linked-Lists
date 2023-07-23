// Question 9: Java Dequeue

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-dequeue/problem

    import java.util.*;
 
    public class test {
        public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        Scanner in = new Scanner(System.in);
        int totalIntegers = in.nextInt();
        int subarraySize = in.nextInt();
        int maxUnique = Integer.MIN_VALUE;

        for (int i = 0; i < totalIntegers; i++) {
            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == subarraySize) {
                if (set.size() > maxUnique)
                    maxUnique = set.size();

                int first = deque.remove();
                if (!deque.contains(first))
                    set.remove(first);
            }
        }
        System.out.println(maxUnique);
    }
}



