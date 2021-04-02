import javax.swing.*;
import java.awt.*;

public class PrimeiraTela extends JFrame {
    private JLabel lblNome;
    private JTextField txtNome;
    private Container ctn;

    public PrimeiraTela() {
        setSize(400,200);
        setTitle("Primeira Tela de POO 2");
        ctn = getContentPane();

        lblNome = new JLabel("Nome");
        txtNome = new JTextField();

        ctn.setLayout(null);

        lblNome.setBounds(0,0,100,25);
        txtNome.setBounds(150,0,200,25);

        ctn.add(lblNome);
        ctn.add(txtNome);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

}
