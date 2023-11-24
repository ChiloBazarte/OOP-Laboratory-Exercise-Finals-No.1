
package javaapplication6;


public class Instructor {
    private double salary;
    private int yearOfBirth;
    
    public Instructor(String name, int yearOfBirth, double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String toString(){
        return "Instructor Salary:" + salary + ",Year of Birth:" + yearOfBirth;
    }
    
}
