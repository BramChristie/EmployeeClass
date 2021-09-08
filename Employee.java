class Employee {
  private String employeeName;
  private String departmentName;
  private String position;
  private double salary;
  private int yearsEmployed;

  public Employee(String employeeName, String departmentName, String position, double salary, int yearsEmployed) {
    this.employeeName = employeeName;
    this.departmentName = departmentName;
    this.position = position;
    this.salary = salary;
    this.yearsEmployed = yearsEmployed;

  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String newDepartment) {
    this.departmentName = newDepartment;
  }

  public String getPosition() {
    return position;
  }

  public void setPositon(String newPosition) {
    this.position = newPosition;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double newSalary) {
    this.salary = newSalary;
  }

  public int getYearsEmployed() {
    return yearsEmployed;
  }

  public void setYearsEmployed(int newYearsEmployed) {
    this.yearsEmployed = newYearsEmployed;
  }

  

}

