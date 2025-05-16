public class week9 {
    public static void main(String[] args) {
        
        Student s = new Student("Alice", 18, "NTU", "B1234567");
        s.printInfo();  // 呼叫 Student 的 printInfo 方法
    }
}

class Person {
    protected String name;
    protected int age;

    //todo
    public Person(String name, int age) {
        //todo
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    private String school;   
    private String studentId; 

    // todo
    public Student(String name, int age, String school, String studentId) {
        super(name, age);  
        this.school = school;
        this.studentId = studentId;
    }

    @Override
    public void printInfo() {
        super.printInfo();  
        System.out.println("School: " + this.school);
        System.out.println("Student ID: " + this.studentId);
    }
}


