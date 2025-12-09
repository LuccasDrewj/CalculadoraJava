package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener{
	
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // Impede fechar direto

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int opcao = JOptionPane.showConfirmDialog(
                    Calculadora.this,
                    "Deseja realmente sair?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION
                );

                if (opcao == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        setSize(500, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
