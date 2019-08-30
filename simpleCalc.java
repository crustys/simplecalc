import javax.swing.JOptionPane;
public class simpleCalc {
  public static void main(String[] a) {
    int conTinue = 1;
    while (conTinue == 1) {
      String[] choices = { "Add", "Subtract", "Multiply", "Divide"};
    String input = (String) JOptionPane.showInputDialog(null, "Choose an operation...",
        "simpleCalc", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
        choices, // Array of choices
        choices[0]); // Initial choice
    System.out.println(input);
    if (input == "Add") {
        int num1 = 0;
        int num2 = 0;
        String firstNum = (String)JOptionPane.showInputDialog(null,"first number","");
        num1 = Integer.parseInt(firstNum);
        String secondNum = (String)JOptionPane.showInputDialog(null,"second number","");
        num2 = Integer.parseInt(secondNum);
        int addSolution = (num1 + num2);
        JOptionPane.showMessageDialog(null, addSolution);
    }
    if (input == "Subtract") {
        int num1 = 0;
        int num2 = 0;
        String firstNum = (String)JOptionPane.showInputDialog(null,"first number","");
        num1 = Integer.parseInt(firstNum);
        String secondNum = (String)JOptionPane.showInputDialog(null,"second number","");
        num2 = Integer.parseInt(secondNum);
        int addSolution = (num1 - num2);
        JOptionPane.showMessageDialog(null, addSolution);
    }
    if (input == "Multiply") {
        int num1 = 0;
        int num2 = 0;
        String firstNum = (String)JOptionPane.showInputDialog(null,"first number","");
        num1 = Integer.parseInt(firstNum);
        String secondNum = (String)JOptionPane.showInputDialog(null,"second number","");
        num2 = Integer.parseInt(secondNum);
        int addSolution = (num1 * num2);
        JOptionPane.showMessageDialog(null, addSolution);
    }
    if (input == "Divide") {
        int num1 = 0;
        int num2 = 0;
        String firstNum = (String)JOptionPane.showInputDialog(null,"first number","");
        num1 = Integer.parseInt(firstNum);
        String secondNum = (String)JOptionPane.showInputDialog(null,"second number","");
        num2 = Integer.parseInt(secondNum);
        int addSolution = (num1 / num2);
        JOptionPane.showMessageDialog(null, addSolution);
    }
    int  continueInt = JOptionPane.showConfirmDialog(null, "Would you like to continue?", "Please select",JOptionPane.YES_NO_OPTION);
        System.out.println("Are you sure? " + continueInt);
        if (continueInt == 1) {
           conTinue = 0; 
        } 
  }  
  System.exit(0);
    }
    
}