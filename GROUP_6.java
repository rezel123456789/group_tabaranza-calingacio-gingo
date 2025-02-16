import java.util.Scanner;
import java.util.Arrays;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class StudentArray {
    int[] array;
    int arrayIndex;

    public StudentArray(int size) {
        array = new int[size];
        arrayIndex = 0;
    }
    public boolean insert(int number) {
        if (arrayIndex < array.length) {
            array[arrayIndex] = number;
            arrayIndex++;
            return true;
        } else {
            return false;
        }
    }
    public void display() {
        int[] trimmedArr = Arrays.copyOf(array, arrayIndex);
        System.out.println(Arrays.toString(trimmedArr));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        StudentArray studentArray = new StudentArray(10);
        int number;

        while (true) {
            System.out.println("\nEnter number:");
            number = scanner.nextInt();

            System.out.println("\nOperations:");
            System.out.println("1. Insert " + number + " into the array");
            System.out.println("2. Insert " + number + " into the Linked List");
     

            int option = scanner.nextInt();

            if (option == 1) {
                if (studentArray.insert(number)) {
                    System.out.println("Array after insertion:");
                    studentArray.display();
                } else {
                    System.out.println("Array is full!");
                }
            } else if (option == 2) {
                System.out.println("Linked List Options:");
                System.out.println("1. Insert " + number + " at the beginning");
                System.out.println("2. Insert " + number + " at the end");

                int linkedListOption = scanner.nextInt();

                if (linkedListOption == 1) {
                    linkedList.insertAtBeginning(number);
                    System.out.println("Linked List after insertion at beginning:");
                } else if (linkedListOption == 2) {
                    linkedList.insertAtEnd(number);
                    System.out.println("Linked List after insertion at end:");
                } else {
                    System.out.println("Wrong choice!");
                    continue;
                }
                linkedList.display();
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("\nOperations:");
            System.out.println("1. Enter new number");
            System.out.println("2. End");
            int endOption = scanner.nextInt();

            if (endOption == 2) {
                break;
            }else if (endOption== 1){
            	continue;
        }else{
        	System.out.println("Wrong number!");

        }}
    }
}