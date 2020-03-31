package com.tutorial.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        //Add multiple elements
        Collections.addAll(collection, "d", "e", "f");
        int size = collection.size();
        collection.remove("e");
        collection.isEmpty();
        boolean x =  collection.contains("a");
        //Array of objects
        collection.toArray();
        //Array of strings
        collection.toArray(new String[collection.size()]);
        System.out.println(collection);
        collection.clear();
    }
}
