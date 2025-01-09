package IUG.ProjetoJava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame {
    
    public MeuFrame() {

        super ("Meu Frame");

        JButton botao = new JButton("Clique aqui");

        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MeuFrame();
    }
}
