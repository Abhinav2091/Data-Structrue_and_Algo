package com.luv2code.samplePractice.JavaPractice;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final HashMap<String,String> testMap;




    public ImmutableClass(int id, String name,HashMap<String, String> testMap) {
        //Shallow Copy
        this.id = id;
        this.name = name;
        //this.testMap=testMap;

        HashMap<String, String> tempMap = new HashMap<String, String>();

        String key;
        Iterator<String> it = testMap.keySet().iterator();
        while (it.hasNext()) {
            key = it.next();
            tempMap.put(key, testMap.get(key));
        }
        this.testMap = tempMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>)testMap.clone();
    }
}

class Test {
    public static void main(String ar[]) {
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");
        String name = "original";
        int id=10;

        ImmutableClass immutableClass = new ImmutableClass(id,name,h1);
        //Lets see whether its copy by field or reference
        System.out.println(name==immutableClass.getName());
        System.out.println(h1 == immutableClass.getTestMap());
        //print the ce values
        System.out.println("id:"+immutableClass.getId());
        System.out.println("name:"+immutableClass.getName());
        System.out.println("testMap:"+immutableClass.getTestMap());

        //change the local variable values
        id=20;
        name="modified";
        h1.put("3", "third");
        //print the values again
        System.out.println("ce id after local variable change:"+immutableClass.getId());
        System.out.println("ce name after local variable change:"+immutableClass.getName());
        //it will print thrid too in cae of shallow copy in constructor
        System.out.println("ce testMap after local variable change:"+immutableClass.getTestMap());
    }
}
