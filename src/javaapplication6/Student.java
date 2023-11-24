
package javaapplication6;


public class Student {
    private String major;
    private int yearOfBirth;
    
    public Student(String name, int yearOfBirth, String major){
        this.major = major;
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getMajor(){
        return major;
    }
    
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    
   public void setName(String name){
        this.major = major;
    }
    
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    
    public String toString(){
        return "Student Major:" + major + ",Year of Birth:" + yearOfBirth;
    }
    
}
