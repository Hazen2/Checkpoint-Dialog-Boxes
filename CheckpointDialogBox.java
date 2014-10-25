import javax.swing.JOptionPane;

/** This program will demonstrate a few Dialog Boxes
  * and convert a string entry to an int value.
 */

public class CheckpointDialogBox
{
  public static void main(String[] args)
  {
    
    // Declaring variables.
    String inputData;
    int age;
    
    // Display dialog boxes.
    JOptionPane.showMessageDialog(null, "Greetings Earthling.");
    inputData = JOptionPane.showInputDialog("Enter your age.");
    
    // Convert age from String to int value.
    age = Integer.parseInt(inputData);
 
    // Display age
    JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
    
    // Exit the program
    System.exit(0);
    
  }
}
