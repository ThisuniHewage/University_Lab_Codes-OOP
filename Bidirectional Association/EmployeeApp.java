package Question02;

class Department{
    private String deptName;
    Employee [] employees;
    int count=0;
    int size=10;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new Employee[size];
    }

    public void addEmployees(Employee e){
        if(count<=size){
            employees[++count]=e;
            }
    }

    public String getDeptName() {
        return deptName;
    }

    public void display(){
        System.out.println("Department: "+deptName);
        System.out.println("Employees: ");
        for(Employee e:employees){
            System.out.println("- " + e.getName());
        }
    }
}

class Employee{
    private String name;
    private Department department;

    public String getName() {
        return name;
    }

    public void displayDetails(){
        if(department!=null){
            System.out.println("Employee: " + name + ", Department: " + department.getDeptName());
        }

        else{
            System.out.println("Employee: " + name + ", Not Assigned");
        }
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Employee(String name) {
        this.name = name;
    }
}


public class EmployeeApp {
    public static void main(String[] args) {
        Department dept = new Department("IT");
        Employee e1 = new Employee("Alice", dept);
        Employee e2 = new Employee("Bob", dept);
        Employee e3 = new Employee("Carl");

        dept.addEmployees(e1);
        dept.addEmployees(e2);

        dept.display();
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
