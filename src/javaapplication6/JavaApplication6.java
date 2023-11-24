
package javaapplication6;


public class JavaApplication6 {

    
    public static void main(String[] args) {
        Student student = new Student("John",1998,"Computer Science");
        Instructor instructor = new Instructor("Smith", 1975,50000);
        
        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
    
}
