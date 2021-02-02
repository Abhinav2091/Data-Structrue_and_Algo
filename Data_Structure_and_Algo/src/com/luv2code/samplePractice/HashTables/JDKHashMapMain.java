package com.luv2code.samplePractice.HashTables;

import com.luv2code.samplePractice.lists.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JDKHashMapMain {
    
    public static void main(String ar[])
    {

        Employee Abhinav=new Employee("Abhinav", "Sharma", 1);
        Employee Abhi=new Employee("Abhi", "Kumar", 13);
        Employee Himanshu=new Employee("Himanshu", "Tiwari", 1456);
        Employee Sid=new Employee("Sid", "Singh", 10000);
        Employee Aju=new Employee("Aju", "Sri", 11110000);

        Map<String,Employee> hasmap =new HashMap<>();
        hasmap.put("Abhinav",Abhinav);
        hasmap.put("Abhi",Abhi);
        hasmap.put("Himanshu",Himanshu);
        hasmap.put("Sid",Sid);
        hasmap.put("Aju",Aju);

        //this put will return the already present value i.e Aju
        //and replace with new value i.e Abhinav
        hasmap.put("Aju",Abhinav);

        //if you don't want that happen use put if absent
        //value will be the previous value

        //of no value is there it will return null
        System.out.println(hasmap.get("Sidsted"));
        //if you don,t want the null value you can use default value
        //we set Abhi here default value
        System.out.println(hasmap.getOrDefault("Sidsted",Abhi));

        //remove this key
        System.out.println(hasmap.remove("Sid"));
        //remove key with this value only
        System.out.println(hasmap.remove("Sid",Abhi));
        //replace old value with new
        System.out.println(hasmap.replace("Sid",Abhi));
        //replace old value with new only if value matches
        System.out.println(hasmap.replace("Sid",Abhi,Sid));

        /*Iterator<Employee> iterator =hasmap.values().iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }*/
        hasmap.forEach((k,v)-> System.out.println("key:"+k+":value:"+v));

    }
}
