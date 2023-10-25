
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello "+name+"!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));                 //Integer.parseInt(code);
        JOptionPane.showMessageDialog(null, "You are "+age+" years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in cm):"));      //Double.parseDouble(code);
        JOptionPane.showMessageDialog(null, "You are "+height+" cm.");

        int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter your age (in kg)"));
        JOptionPane.showMessageDialog(null, "You are "+weight+" kg!");

        JOptionPane.showMessageDialog(null, "Name: "+name +"\n"+ "Age: "+age+"\n"+"Height: "+height+" cm"+"\n"+"Weight: "+weight+" Kg"+"\n"+"\n"+"Thank you for the info!");
        // etc...
    }

}
