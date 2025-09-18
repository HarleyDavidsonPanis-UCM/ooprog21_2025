import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs{
   public static void main(String[] args){
       String name = "";
       int Confirmation;
       
       while (true){
         name = JOptionPane.showInputDialog(null, 
            "Enter your name: ", JOptionPane.QUESTION_MESSAGE);
            
            if (name == null){
               JOptionPane.showMessageDialog(null, "Didnt enter any name");
               break;
            }
            Confirmation = JOptionPane.showConfirmDialog(null, "Do you want to display your name?", "Name Display", 
            JOptionPane.INFORMATION_MESSAGE);
            
            if(Confirmation == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "Your name is: " + name , "Name Display",JOptionPane.INFORMATION_MESSAGE);
               break;
            }
            else if (Confirmation == JOptionPane.NO_OPTION || Confirmation == JOptionPane.CANCEL_OPTION){
               continue;
            }
            
       }        
   }
}