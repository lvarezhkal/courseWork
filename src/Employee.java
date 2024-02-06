public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;
    public Employee(String fullName, int department, int salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = Main.idCounter++;
    }

    public String getFullName () {return fullName;}

    public int getDepartment () {return  department;}

    public int getSalary () {return  salary;}

    public  int getId () {return id;}

    public void setSalary (int salary) {this.salary = salary;}

    public String toString () {return fullName + " " + department + " " + salary + " " + id;}
}
