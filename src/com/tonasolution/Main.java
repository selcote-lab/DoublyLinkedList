package com.tonasolution;

public class Main {

    public static void main(String[] args) {

        Employee zouhaire = new Employee("zouhaire", "elakioui", 123);
        Employee jack = new Employee("jack", "ali", 1234);
        Employee kali = new Employee("kali", "maeckel", 12345);

       EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

       list.addToFront(zouhaire);
       list.addToFront(jack);
       list.addToFront(kali);

       list.printList();
       System.out.println(list.getSize());
       list.removeFromTheFront();
       System.out.println(list.getSize());
       list.printList();

       list.removeFromEnd();
       list.printList();
    }
}
