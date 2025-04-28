
package principal;

import javax.swing.JOptionPane;
import model.Aluno;


public class Principal {
    public static void main(String args[]){
    Aluno aluno1 = new Aluno();
    aluno1.setNota1(Double.parseDouble(JOptionPane.showInputDialog("digite a primeira nota: ")));
    aluno1.setNota2(Double.parseDouble(JOptionPane.showInputDialog("digite a segunda nota: ")));
    aluno1.setNota3(Double.parseDouble(JOptionPane.showInputDialog("digite a terceira nota: ")));
    
    JOptionPane.showMessageDialog(null, "a média é: " + aluno1.getMediaArredondada());
}
}
