//Task03
public class Student{
  public String name;
  public double cg;
  private int id;
  public void setId(int id){
    this.id=id;
  }
  public int getId(){
    return id;
  }
  Student(String name,int id,double cg){
    this.name=name;
    this.cg=cg;
    setId(id);
  }
}

class Department{
  Student list[]=new Student[6];
  public String name;
  public int totalStudents;
  //constructor
  Department(String s){
    name=s;
  }
  //addStudent1
  public void addStudent(Student s1,Student s2,Student s3){
    System.out.println("Welcome to CSE department, "+s1.name);
    list[totalStudents++]=s1;
    System.out.println("Welcome to CSE department, "+s2.name);
    list[totalStudents++]=s2;
    System.out.println("Welcome to CSE department, "+s3.name);
    list[totalStudents++]=s3;
  }
  //addStudent2
  public void addStudent(Student s){
    boolean flag=false;
    for(int i=0;i<totalStudents;i++){
      if(list[i].getId()==s.getId()){
        System.out.println("Student with the same ID already exists, Please try with another ID");
        flag=true;
        break;
      }
    }
    if(flag==false){
      System.out.println("Welcome to CSE department, "+s.name);
      list[totalStudents++]=s;
    }
  }
  //details
  public void details(){
    System.out.println("Department Name: CSE"+
                       "\nNumber of student: "+totalStudents+
                       "\nDetails of the students:");
    for(int i=0;i<totalStudents;i++){
      System.out.println("Student name: "+list[i].name+", ID: "+list[i].getId()+", CGPA: "+list[i].cg);
    }
  }
  //findStudent
  public void findStudent(int id){
    if(id<=0) System.out.println("Student with this ID doesn't exist, Please give a valid ID");
    else{
      for(int i=0;i<totalStudents;i++){
        if(list[i].getId()==id)
          System.out.println("Student info: "+
                             "\nStudent Name: "+list[i].name+
                             "\nID: "+id+
                             "\nCGPA: "+list[i].cg);
      }
    }
  }
}