package Seminar4.Task2;

import java.util.LinkedList;

/*
 * :
 * enqueue() — помещает элемент в конец очереди,
 * dequeue() — возвращает первый элемент из очереди и удаляет его,
 * first() — возвращает первый элемент из очереди, не удаляя.
 */
public class program {
    public static void enqueue(LinkedList<Integer> list, int elem) {
        list.add(elem);
    }
    public static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }
    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
    public static void main(String[] args) {
        LinkedList<Integer> myList= new LinkedList<Integer> ();
        enqueue(myList, 5);
        enqueue(myList, 6);
        enqueue(myList, 7);
        enqueue(myList, 8);
        System.out.println(myList);
        System.out.println(dequeue(myList));
        System.out.println(first(myList));
    }
}
