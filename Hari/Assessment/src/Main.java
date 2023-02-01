import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Hari","Hyd",22));
        emp.add(new Employee("Kumar","Vij",25));
        emp.add(new Employee("Ravi","Kadapa",39));
        emp.add(new Employee("B","Hyd",27));
        emp.add(new Employee("Ram","Vij",28));
        emp.add(new Employee("A","Hyd",30));

        Map<String, List<Employee>> filteredEmployee =
        emp.stream().sorted((n1,n2)-> n1.getEname().compareTo(n2.getEname()))
                .filter(age -> age.getEage()>=25 && age.getEage() <=40)
                .collect(Collectors.groupingBy(Employee::getEloc));
        for(String name : filteredEmployee.keySet()) {
            System.out.print(name + " " + "-> ");
            for (Employee i : filteredEmployee.get(name)) {
                System.out.println(i.getEname()+" "+i.getEage()+",");
            }
        }
    }
}