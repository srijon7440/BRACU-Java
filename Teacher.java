public class Teacher{
  Course[] courses=new Course[3];
  public String name;
  public int idx;
  public String initial;
  Teacher(String name,String initial){
    this.name=name;
    this.initial=initial;
    System.out.println("A new teacher has been created");
    
  }
  public void addCourse(Course c1){
    courses[idx++]=c1;
  }
  public void printDetail(){
    System.out.println("Name: "+name+"\nInitial: "+initial+
                      "\nList of course:");
    for(int i=0;i<idx;i++){
      System.out.println(courses[i].course);
    }
  }
}
class Course{
  public String course;
  Course(String c){
    course=c;
  }
}