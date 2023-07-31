package reverse_linked_list;

import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(0);
        Node tail = head;
        String s = sc.nextLine();
        String []str = s.split(" ", -1);
        for(String s1 : str){
            tail.next = new Node(Integer.parseInt(s1));
            tail = tail.next;
        }
        printLinkedList(head.next);
        Node reversedHead = reverseLinkedList(head.next);
        printLinkedList(reversedHead);
    }

    private static void printLinkedList(Node reversedHead) {
        while(reversedHead != null){
            System.out.print(reversedHead.val+"->");
            reversedHead = reversedHead.next;
        }
        System.out.println("");
    }

    private static Node reverseLinkedList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
}
