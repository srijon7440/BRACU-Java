//Task-03
public class Assignment{
  public int tasks;
  public String difficulty;
  public boolean submission;
  public String makeOptional(){
    submission=false;
    if(difficulty=="Hard") return "Submission is already not required";
    else return ("Assignment will not require submission");
  }
  public void printDetails(){
   System.out.println("Number of tasks: "+tasks+
                       "\nDifficulty level: "+difficulty+
                        "\nSubmission required: "+submission); 
  }

}