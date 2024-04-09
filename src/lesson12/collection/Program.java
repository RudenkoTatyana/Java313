package lesson12.collection;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("red");
        states.addFirst("blue");
        states.push("white");
        states.addLast("green");
        states.add("black");
        System.out.println(states);
        System.out.println(states.getFirst());
        System.out.println(states.getLast());
        System.out.println(states.size());
        while (states.peek() != null){
            System.out.println(states.pop());
        }
        System.out.println(states);
    }
}
