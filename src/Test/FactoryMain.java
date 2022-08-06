package Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class FactoryMain {
    public static void main(String[] args) {
//        FactoryOfSource factoryOfSource = new FactoryOfSource();
//        IngestionService ingestionService = new IngestionService(factoryOfSource);
//        ingestionService.ingestToMyDatabase("API");
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.addLast(2);
        deque.removeFirst();
        System.out.println(deque);
    }
}