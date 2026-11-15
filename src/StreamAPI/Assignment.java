package StreamAPI;
/*
    Create a list of employees
    convert it to stream
    filter all the employees
    and print employees working in Tech.
     */

import java.util.Arrays;
import java.util.List;

class Employees{
    private int empId;
    private String empName;
    private String empDept;

    public Employees(int empId, String empName, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }
}

public class Assignment {


    static void main() {

        List<Employees> employees = Arrays.asList(
                new Employees(1, "Alamgir", "Tech"),
                new Employees(2, "Muwahhid", "HR"),
                new Employees(3, "Fatimah", "CEO"),
                new Employees(4, "Mohammed", "Tech"),
                new Employees(5,"Altayr", "Tech"),
                new Employees(6,"Prince", "Marketing"),
                new Employees(7,"Alakazam", "Marketing")
        );
        employees.stream(); // converts the collection to stream

        System.out.println("Working in Tech!");
        // let's find who all are working in tech
        employees.stream()
                .filter((emp) -> emp.getEmpDept().equals("Tech"))
                .map((name) -> name.getEmpName())
                .forEach((emp-> System.out.println(emp)));
        System.out.println();

        // let us find employees working in Marketing

        System.out.println("Working in Marketing!");

        employees.stream()
                .filter((emp) -> emp.getEmpDept().equals("Marketing"))
                .map((emp) ->emp.getEmpName())
                .forEach((emp) -> System.out.println(emp));
    }

}
