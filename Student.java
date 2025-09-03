public class Student {
// put data members here
    private String name;
    private int id;
    private double gpa;

// Constructor
  public Student(String studentName, int studentId, double studentGPA) {
    this.name = studentName;
    this.id = studentId;
    this.gpa = studentGPA;
  }

// put getters here
    public String getStudentName() {
        return this.name; 
    }

    public int getStudentId() {
        return this.id;
    }
    public double getStudentGpa() {
        return this.gpa;
    }

   
// put setters here
    public void setGpa(double newGpa){
        this.gpa = newGpa;
    }
//other member functions (methods here)
    public void displayStudent() {
        System.out.println("The student "+ this.name + 
        " has an id of " + this.id + " and a gpa of "+ this.gpa +".");
    }

    public static void main(String[] args) {
        
    //create a student here
    Student student1 = new Student("Lisa Waddell", 
    54321, 2.5); 
    
    //call the displayStudent method here
    student1.displayStudent();

    student1.setGpa(3.0);
    System.out.println(student1.getStudentGpa());
    System.out.println(student1.getStudentName());
        
    }
}

