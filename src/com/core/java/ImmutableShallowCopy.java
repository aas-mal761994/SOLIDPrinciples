package com.core.java;

import java.util.HashMap;

final public class ImmutableShallowCopy {
    private final int id;

    private final String name;

    private final HashMap<String, String> testMap;

    //shallow copy
    public ImmutableShallowCopy(int i, String n, HashMap<String, String> hm) {
        this.id = i;
        this.name = n;
        this.testMap = hm;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    /**
     * Accessor function for mutable objects
     */
    public HashMap<String, String> getTestMap() {
        //return testMap;
        return (HashMap<String, String>) testMap.clone();
    }

    public static void main(String[] args) {
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");
        String s = "original";
        int i=10;

        ImmutableShallowCopy obj = new ImmutableShallowCopy(i, s, h1);
        System.out.println("Name:"+ obj.getName());
        System.out.println("ID: "+ obj.getId());
        System.out.println("Map: "+ obj.getTestMap());

        i=20;
        s="modified";
        h1.put("3", "third");

        System.out.println("After Change Name:"+ obj.getName());
        System.out.println("After Change ID: "+ obj.getId());
        System.out.println("After Change Map: "+ obj.getTestMap());

    }
}
