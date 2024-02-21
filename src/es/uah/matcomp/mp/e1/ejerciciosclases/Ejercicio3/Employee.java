package es.uah.matcomp.mp.e1.ejerciciosclases.Ejercicio3;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int i,String fn,String ln,int s){
        this.id = i;
        this.firstName = fn;
        this.lastName = ln;
        this.salary = s;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return 12 * salary;
    }

    public int raiseSalary(int percent) {
        int subido = (salary + ((salary * percent)/100));
        this.salary = subido;
        return subido;
    }

    public String toString() {
        return "Employee[id=" + id + ", Name=" + firstName + " " + lastName + ", salary=" + salary + "]";
    }
}
