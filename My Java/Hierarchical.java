class Person{
    String name;
    long mobileNo;

    Person(String nm, long mobile)
    {
        System.out.println("Person Constructor");
        

        name = nm;
        mobileNo = mobile;
    }
    

       void  displayData()
    {
        System.out.println("Name is " + name);
        System.out.println("Mobile No is " + mobileNo);
    }
}
class Employee extends  Person {

    String deptName;
    int salary;

    Employee(String nm,long mobile, String dName, int sal)
    {
        super(nm,mobile);
        deptName = dName;
        salary = sal;
        System.out.println("Employee Constructor");
        //System.out.println();
    }
    void displayData()
    {
        System.out.println("Name is " + name);
        System.out.println("Mobile No is " + mobileNo);
        System.out.println("DeptName  is " + deptName);
        System.out.println("Salary  is " + salary);
    }
}
class  Student extends Person{

    String collegeName;
    String course;

    Student(String nm, long mobile , String cname, String crs)
    {
        super(nm ,mobile);
        collegeName = cname;
        course= crs;
        System.out.println("Student  Constructor");
        
    }
    void displayData()
    {
        System.out.println("Name is " + name);
        System.out.println("Mobile No is " + mobileNo);
        System.out.println("College name is  " + collegeName);
        System.out.println("Course  is " + course);
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Person p1 = new Person("Avani", 69745123);
        p1.displayData();
        Employee e1 = new Employee("Suresh", 741258963, "Sales", 80000);
        e1.displayData();
        Student s1 = new Student("Rohit", 741852963, "IIT Delhi", "BSC");
        s1.displayData();

    }
    
}
