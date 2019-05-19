package coreJava;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class HasMapPractice {
    public static void main(String[] args) {

        HashMap <Integer,String> hm = new HashMap<Integer, String>();

        hm.put(101,"Jeff");
        hm.put(102,"Akli");
        hm.put(103,"Sohan");
        hm.put(104,"Daljeet");
        hm.put(105,"Jannat");

        System.out.println(hm);

        hm.remove(101);

        //Map.Entry m = hm.entrySet();

        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}
