package hehe;
class Employee{
    String Name,address;
    int age,phno,salary;
    /*Employee(String Name, String address, int age, int phno, int salary){
        this.Name=Name;
        this.address = address;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
    }*/
    void print_salary(){
        System.out.println("Salary: "+salary);
    }
}

class Officer extends Employee{
    String Specialization;
    public Officer(String Name, String address,int age, int phno, int salary, String Specialization){
        this.Name = Name;
        this.address = address;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.Specialization = Specialization;
    
    }
}

class Manager extends Employee{
    String Department;
    public Manager(String Name, String address,int age, int phno, int salary, String Department){
        this.Name = Name;
        this.address = address;
        this.age = age;
        this.phno = phno;
        this.salary = salary;
        this.Department = Department;
    
    }
}




public class Emp_det {
    public static void main(String[] args) {
        Officer O = new Officer("Rahul", "Abc", 10, 911, 10000, "hmt");
        Manager M = new Manager("John", "Def", 25, 876,10000,"feck");
        System.out.println(O.Name+O.Specialization+O.address+O.age + O.phno);
        System.out.println(M.Name+"\n"+M.Department);

    }
}
