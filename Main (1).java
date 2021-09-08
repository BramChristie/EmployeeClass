public class Main {
  public static void main(String[] args) {
    
    // instantiates Employee object
    Employee bram = new Employee("Bram Christie", "Tech Department", "Professor", 47000, 5);

    System.out.println("Your old salary was " + bram.getSalary());

    if (bram.getDepartmentName().equals("Tech Department") && bram.getYearsEmployed() >= 5) {
      bram.setSalary(bram.getSalary() * 1.05);
    

    }

    System.out.println("Your new salary is " + bram.getSalary());
    
    

    
    


    

    
  }
}