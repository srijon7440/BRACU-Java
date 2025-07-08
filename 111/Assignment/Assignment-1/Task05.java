//TASK-05
import java.util.Scanner;
public class Task05{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr2D = {{0, 0, 10, 0, -1},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}
    };
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;
    
    //finding out the position of the player
    for(int i=0;i<row;i++){
      for(int j=0;j<arr2D[i].length;j++){
        if(arr2D[i][j]==7){
          row_pos=i;
          col_pos=j;
          break;
        }
      }
    }  
    
    int turns = 5;
    while (turns > 0) {
      int new_row = row_pos, new_col = col_pos;
      System.out.printf("Enter move %d: ",(6-turns));
      String inp = sc.nextLine();
      /*To-do: Based on the input update the player position and check if
       * 1. the player fell out of the grid
       * 2. player stepped on mine
       * 3. player found the treasure
       * otheriwse, update the player position */
      if(inp.equals("RIGHT")){
        if(new_col+1>col-1){
        System.out.println("Player fell outside the playing area. Game over!");
        break;
        }
        else if(arr2D[new_row][(new_col+1)]==10){
          System.out.println("Treasure found. You win!");
          arr2D[new_row][(new_col)]=0;
           new_col++;
           arr2D[new_row][(new_col)]=7;
           col_pos=new_col;
           System.out.println("Final state:");
           printMap(arr2D);
           break;
        }
        else if(arr2D[new_row][(new_col+1)]==0){
           arr2D[new_row][(new_col)]=0;
           new_col++;
           arr2D[new_row][(new_col)]=7;
           col_pos=new_col;
        }
        else if(arr2D[new_row][(new_col+1)]==-1){
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
      }
      else if(inp.equals("LEFT")){
        if(new_col-1<0){
        System.out.println("Player fell outside the playing area. Game over!");
        break;
        }
        else if(arr2D[new_row][(new_col-1)]==10){
          System.out.println("Treasure found. You win!");
          arr2D[new_row][(new_col)]=0;
           new_col--;
           arr2D[new_row][(new_col)]=7;
           col_pos=new_col;
           System.out.println("Final state:");
           printMap(arr2D);
           break;
        }
        
        else if(arr2D[new_row][(new_col-1)]==0){
           arr2D[new_row][(new_col)]=0;
           new_col--;
           arr2D[new_row][(new_col)]=7;
           col_pos=new_col;
        }
        else if(arr2D[new_row][(new_col-1)]==-1){
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
      }
      else if(inp.equals("DOWN")){
        if(new_row+1>row-1){
        System.out.println("Player fell outside the playing area. Game over!");
        break;
      }
        else if(arr2D[new_row+1][(new_col)]==10){
          System.out.println("Treasure found. You win!");
          arr2D[new_row][(new_col)]=0;
           new_row++;
           arr2D[new_row][(new_col)]=7;
           col_pos=new_col;
           System.out.println("Final state:");
           printMap(arr2D);
           break;
        }
        
        else if(arr2D[new_row+1][(new_col)]==0){
           arr2D[new_row][(new_col)]=0;
           new_row++;
           arr2D[new_row][(new_col)]=7;
           row_pos=new_row;
        }
        else if(arr2D[new_row-1][(new_col)]==-1){
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
      }
      else if(inp.equals("UP")){
        if(new_row-1<0){
        System.out.println("Player fell outside the playing area. Game over!");
        break;
      }
        else if(arr2D[new_row-1][(new_col)]==10){
          System.out.println("Treasure found. You win!");
          arr2D[new_row][(new_col)]=0;
           new_row--;
           arr2D[new_row][(new_col)]=7;
           col_pos=new_col;
           System.out.println("Final state:");
           printMap(arr2D);
           break;
        }
        
        else if(arr2D[new_row-1][(new_col)]==0){
           arr2D[new_row][(new_col)]=0;
           new_row--;
           arr2D[new_row][(new_col)]=7;
           row_pos=new_row;
        }
        else if(arr2D[new_row-1][(new_col)]==-1){
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
      }
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
    }
    if (turns == 0) {
      System.out.println("Failed to find the treasure.");
    }
  }
  
  public static void printMap(int[][] arr) { 
    //printing the 2D Array
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+"    ");
      }
      System.out.println();
    }
  }
}