//Task-04;
public class Employee{
  public String name;
  public double salary;
  public String designation;
  public double tax;
  public void newEmployee(String str){
    name=str;
    salary=30000.0;
    designation="junior";
  }
  public void displayInfo(){
    System.out.println("Employee Name: "+name+
                       "\nEmployee Salary: "+salary+" TK"+
                       "\nEmployee Designation: "+designation);
  }
  public void calculateTax(){
    if(salary<=30000.0) System.out.println("No need to pay tax");
    else if(salary>30000&&salary<=50000){
      tax=(salary/100)*10;
      System.out.println(name+" Tax Amount: "+tax+" TK");
    }
    else if(salary>50000){
      tax=(salary/100)*30;
      System.out.println(name+" Tax Amount: "+tax+" TK");
    }
    }
    public void promoteEmployee(String st){
      designation=st;
      if(designation=="senior") salary+=25000.00;
      else if(designation=="lead") salary+=50000.00;
      else if(designation=="manager") salary+=75000.00;
      System.out.println(name+" has been promoted to "+designation);
      System.out.println("New Salary: "+salary+" TK");
    
  }
}