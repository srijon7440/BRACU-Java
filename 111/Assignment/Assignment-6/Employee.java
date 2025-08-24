//Task02
public class Employee{
  private String name;
  private String job;
  private int id;
  Employee(){
    System.out.println("A default employee has been created");
  }
  Employee(String name,int id,String job){
    this.name=name;
    this.id=id;
    this.job=job;
  }
  public String getJob(){
    return job;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
}
class Company{
  public int totalEmployees;
  Employee list[]=new Employee[3];
  //addEmploye
  public void addEmployee(Employee E){
    if(totalEmployees==3) System.out.println("No more vacancy");
    else{
    list[totalEmployees++]=E;
    System.out.println(E.getName()+" has joined the company");
    }
  }
  //removeEmployee
  public void removeEmployee(Employee E){
    System.out.println(E.getName()+" has left the company");
    totalEmployees--;
    E=null;
  }
  //details
  public void details(){
    System.out.println("Company Name: ABC Company"+
                       "\nTotal Employee: "+totalEmployees+
                       "\nFulltime Employees:");
    if(totalEmployees!=0){
      for(int i=0;i<totalEmployees;i++){
        if(list[i]==null) continue;
        if(list[i].getJob().equals("Fulltime"))
         System.out.println("Name: "+list[i].getName()+", ID: "+list[i].getId());
      }
    }
    System.out.println("Part-Time Employees: ");
    if(totalEmployees!=0){
      for(int i=0;i<totalEmployees;i++){
        if(list[i]==null) continue;
        if(list[i].getJob().equals("Part-time"))
         System.out.println("Name: "+list[i].getName()+", ID: "+list[i].getId());
      }
    }
  }
}