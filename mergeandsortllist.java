// Question 5: Merge and Sort the elements in two Linked-List

// Skill Mapping: Intermediate

// Description: Consider two Linked-List with N number of integers in Data-Node respectively.

// Task 1- WAP in Java to merge both Linked-Lists.

// Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.

// Sample input: Linked-List-1:- 25->35->12->4->36->48

// Linked-List-2:- 8->32->22->45->63->49

// Output:- 4->8->12->22->25->32->35->36->45->48->49->63


import java.util.*;

public class mergeandsortllist {
    public static LinkedList<Integer> mergeAndSort(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();

      
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        
        Collections.sort(mergedList);

        return mergedList;
    }

    public static void main(String[] args) {
        try {
            int size1, size2;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the size of the first linked list:");
            size1 = scanner.nextInt();
            System.out.println("Enter the size of the second linked list:");
            size2 = scanner.nextInt();

            if (size1 == 0 && size2 == 0)
                throw new Exception("Both the linked lists should not be empty");

            LinkedList<Integer> list1 = new LinkedList<Integer>();
            LinkedList<Integer> list2 = new LinkedList<Integer>();

            System.out.println("Enter elements for the first linked list:");
            for (int i = 0; i < size1; i++)
                list1.add(scanner.nextInt());

            System.out.println("Enter elements for the second linked list:");
            for (int i = 0; i < size2; i++)
                list2.add(scanner.nextInt());

            LinkedList<Integer> result = mergeAndSort(list1, list2);
            System.out.println("Elements after merging and sorting in ascending order:");
            for (Integer i : result)
                System.out.print(i + " ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
