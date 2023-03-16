package Seminar4.Task1;

import java.util.LinkedList;
/*
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернёет «перевёрнутый» список.
 */
public class program {
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reverseList = new LinkedList<Integer>();
        while (list.isEmpty() == false) {
            reverseList.add(list.pollLast());
        }
        return reverseList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> myList= new LinkedList<Integer> ();
        myList.add(5);
        myList.add(10);
        myList.add(12);
        myList.add(0);
        myList.add(1);
        System.out.println(myList);
        System.out.println(reverseLinkedList(myList));        
    }

}
