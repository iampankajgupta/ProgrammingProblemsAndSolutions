package Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[]args){

        Person a = new Person("Pankaj","Gupta");
        Person b = new Person("someone","Gupta");

        Person c = new Person("Gupta","Gupta");
        Person d = new Person("dheeraj","Gupta");

        List<Person>people = new ArrayList<>();
        people.add(a);
        people.add(b);

        List<Person>personList = new ArrayList<>();
        personList.add(c);
        personList.add(d);

        boolean flag = false;
        for(Person p:personList){
            if(people.contains(p)){
                System.out.println("it contains p ");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("it does not contains p ");
        }
    }
}

