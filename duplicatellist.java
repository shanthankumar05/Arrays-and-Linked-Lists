// Question 6: Remove Duplicates from Linked-List

// Skill Mapping: Intermediate

// Description: Consider a Linked-List with N number of repeated integers in Data-Node.

// Task - WAP in Java to remove the repeated integer numbers from Linked-List.

// Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5

// Output:- 2->5->12->3->1


import java.util.HashSet;
import java.util.Scanner;

public class duplicatellist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();
        Node head = null;
        
        int data1 = scanner.nextInt();
            Node newNode1 = new Node(data1);
            head = newNode1;
        Node current = head;
        for (int i = 1; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            current.next = newNode;
            current = newNode;
        }

        head = removeDuplicates(head);
        System.out.println("The linked list after removing duplicates:");
        printLinkedList(head);
    }

    private static Node removeDuplicates(Node head) {
    
        if (head == null || head.next == null) {
            return head;
        }

        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (set.contains(current.data)) {
                prev.next = current.next;
            } else {
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println();
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
