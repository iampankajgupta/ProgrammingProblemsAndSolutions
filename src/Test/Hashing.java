package Test;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(1,1);
        map.put(1,2);
        System.out.println(map.get(1));
        System.out.println(map.size());
    }
}
