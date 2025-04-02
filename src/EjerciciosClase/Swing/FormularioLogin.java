package EjerciciosClase.Swing;

import javax.swing.*;
import java.awt.*;

public class FormularioLogin extends JFrame {
    private JTextField txtLogin;
    private JPasswordField txtPass;

    public FormularioLogin() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        JLabel lbLogin, lbPass;
        JButton btnEntrar;
        setContentPane(mainPanel);
        mainPanel.setLayout(new GridBagLayout());

        txtLogin = new JTextField(10);
        txtPass = new JPasswordField(10);
        lbLogin = new JLabel("Login: ");
        lbPass = new JLabel("Password: ");
        btnEntrar = new JButton("Entrar");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 1;
        lbLogin.setHorizontalAlignment(JLabel.RIGHT);
        mainPanel.add(lbLogin,gbc);
        
        gbc.gridx = 1;
        mainPanel.add(txtLogin,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        lbPass.setHorizontalAlignment(JLabel.RIGHT);
        mainPanel.add(lbPass, gbc);

        gbc.gridx = 1;
        mainPanel.add(txtPass, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        mainPanel.add(btnEntrar, gbc);
        btnEntrar.addActionListener(e->{
            String msg;
            if (txtLogin.getText().equals("admin") && String.valueOf(txtPass.getPassword()).equals("1234")) {
                msg = "Qué cenutrio eres";
            } else {
                msg = "Credenciales incorrectas";
            }
            JOptionPane.showMessageDialog(this,msg);
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormularioLogin();
    }

}
