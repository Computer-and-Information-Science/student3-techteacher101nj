public class Student {
// put data members here
    private String name;
    private int id;
    private double gpa;

// Constructor
    public Student(String name, int id, double gpa) {
    this.name = name;
    this.id = id;
    this.gpa = gpa;
    }

// put getters here
    public String getName() { return name; }
    public int getId() { return id; }
    public double getGpa() { return gpa; }

// put setters here
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setGpa(double gpa) { this.gpa = gpa; }

//other member functions (methods here)
    public void displayStudent() {
        System.out.println("The student "+ this.name + " has an id of " + id + " and a gpa of "+ gpa +".");
    }

    public static void main(String[] args) {
        
    //create a student here
    Student student1 = new Student("Lisa Waddell", 54321, 2.5); 
    //call the displayStudent method here
    student1.displayStudent();
        
    }
}

