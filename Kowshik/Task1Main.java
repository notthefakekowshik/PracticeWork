package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Task1Main
{
    public static void main(String args[])
    {
        List<Task1Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(new Task1Employee("Kowshik",25,"Vijayawada"));
        listOfEmployees.add(new Task1Employee("Hari" , 27,  "Kanchikacharla"));
        listOfEmployees.add(new Task1Employee("Roja" , 28,"Hyd"));
        listOfEmployees.add(new Task1Employee("Elon" , 60 ,"mars"));
        listOfEmployees.add(new Task1Employee("virat",32,"Delhi"));
        listOfEmployees.add(new Task1Employee("dhawan" , 35,"Delhi"));

         Map<String,List<Task1Employee>> filteredEmployeesData;

         List<Task1Employee> currList = listOfEmployees.stream().filter(x -> x.getAge() >= 25 && x.getAge() <= 40).sorted((obj1,obj2) -> obj1.getName().compareTo(obj2.getName())).collect(Collectors.toList());

        filteredEmployeesData = currList.stream().collect(Collectors.groupingBy(Task1Employee :: getLocation));

//        System.out.println(filteredEmployeesData.size());
//        System.out.println();
//        System.out.println(filteredEmployeesData);

         for(String name : filteredEmployeesData.keySet()) {
             System.out.print(name+"->");
             for (Task1Employee curr : filteredEmployeesData.get(name)) {
                 System.out.println(curr.getName()+" "+curr.getAge());
             }
             System.out.println();
         }
    }
}
