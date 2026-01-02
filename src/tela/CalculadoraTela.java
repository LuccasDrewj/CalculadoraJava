package tela;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import model.Calculadora;
import model.ExeptionDivisaoPorZero;

public class CalculadoraTela extends JFrame implements ActionListener{
	
	String operador = "";
	boolean esperandoSegundo = false;
	boolean novoCalculo = true;
	double primeiroNumero = 0;
	
	Calculadora calculo = new Calculadora();
	
	public CalculadoraTela() {
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(430, 710);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //perosnalizaçao da jenela
        getContentPane().setBackground(new Color(20, 23, 29));
        
        
        JTextField display = new JTextField();
        display.setEditable(false);
        display.setBounds( 10, 10, 390, 150);
        add(display);
        setLayout(null);
        
        //personalizacao do display
        display.setBackground(new Color(37, 44, 56));
        display.setForeground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        
        JButton apagar = new JButton();
        apagar.setText("apagar");
        apagar.setBounds(10, 170, 290, 90);
        add(apagar);
        
        //personalizacao botao
        apagar.setBackground(new Color(37, 44, 56));
        apagar.setForeground(Color.WHITE);
        
        apagar.addActionListener(e -> display.setText(""));
        
        JButton num1 = new JButton();
        num1.setText("1");
        num1.setBounds(10, 270, 90, 90);
        add(num1);
        
      //personalizacao botao
        num1.setBackground(new Color(37, 44, 56));
        num1.setForeground(Color.WHITE);
        
        num1.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("1");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("1");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "1");
            }
        });
        
        JButton num2 = new JButton();
        num2.setText("2");
        num2.setBounds(110, 270, 90, 90);
        add(num2);
        
      //personalizacao botao
        num2.setBackground(new Color(37, 44, 56));
        num2.setForeground(Color.WHITE);
        
        num2.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("2");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("2");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "2");
            }
        });
        
        JButton num3 = new JButton();
        num3.setText("3");
        num3.setBounds(210, 270, 90, 90);
        add(num3);
        
      //personalizacao botao
        num3.setBackground(new Color(37, 44, 56));
        num3.setForeground(Color.WHITE);
        
        num3.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("3");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("3");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "3");
            }
        });
        
        JButton num4 = new JButton();
        num4.setText("4");
        num4.setBounds(10, 370, 90, 90);
        add(num4);
        
      //personalizacao botao
        num4.setBackground(new Color(37, 44, 56));
        num4.setForeground(Color.WHITE);
        
        num4.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("4");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("4");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "4");
            }
        });
        
        JButton num5 = new JButton();
        num5.setText("5");
        num5.setBounds(110, 370, 90, 90);
        add(num5);
        
      //personalizacao botao
        num5.setBackground(new Color(37, 44, 56));
        num5.setForeground(Color.WHITE);
        
        num5.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("5");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("5");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "5");
            }
        });
        
        JButton num6 = new JButton();
        num6.setText("6");
        num6.setBounds(210, 370, 90, 90);
        add(num6);
        
      //personalizacao botao
        num6.setBackground(new Color(37, 44, 56));
        num6.setForeground(Color.WHITE);
        
        num6.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("6");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("6");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "6");
            }
        });
        
        JButton num7 = new JButton();
        num7.setText("7");
        num7.setBounds(10, 470, 90, 90);
        add(num7);
        
      //personalizacao botao
        num7.setBackground(new Color(37, 44, 56));
        num7.setForeground(Color.WHITE);
        
        num7.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("7");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("7");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "7");
            }
        });
        
        JButton num8 = new JButton();
        num8.setText("8");
        num8.setBounds(110, 470, 90, 90);
        add(num8);
        
      //personalizacao botao
        num8.setBackground(new Color(37, 44, 56));
        num8.setForeground(Color.WHITE);
        
        num8.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("8");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("8");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "8");
            }
        });
        
        JButton num9 = new JButton();
        num9.setText("9");
        num9.setBounds(210, 470, 90, 90);
        add(num9);
        
      //personalizacao botao
        num9.setBackground(new Color(37, 44, 56));
        num9.setForeground(Color.WHITE);
        
        num9.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("9");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("9");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "9");
            }
        });
        
        JButton num0 = new JButton();
        num0.setText("0");
        num0.setBounds(10, 570, 90, 90);
        add(num0);
        
      //personalizacao botao
        num0.setBackground(new Color(37, 44, 56));
        num0.setForeground(Color.WHITE);
        
        num0.addActionListener(e -> {
        	if (novoCalculo) {
                display.setText("0");
                novoCalculo = false;
            } else if (esperandoSegundo) {
                display.setText("0");
                esperandoSegundo = false;
            } else {
                display.setText(display.getText() + "0");
            }
        });
        
        JButton virgula = new JButton();
        virgula.setText(",");
        virgula.setBounds(110, 570, 90, 90);
        add(virgula);
        
      //personalizacao botao
        virgula.setBackground(new Color(37, 44, 56));
        virgula.setForeground(Color.WHITE);
        
        virgula.addActionListener(e -> display.setText(display.getText() +"."));
        
        JButton igual = new JButton();
        igual.setText("=");
        igual.setBounds(210, 570, 190, 90);
        add(igual);
        
      //personalizacao botao
        igual.setBackground(new Color(37, 44, 56));
        igual.setForeground(Color.WHITE);
        
        igual.addActionListener(e -> {
        	double segundo = Double.parseDouble(display.getText());
        	double resultado = 0;
        	
        	
        	switch (operador) {
        		case "+": resultado = calculo.somar(primeiroNumero, segundo); break;
        		case "-": resultado = calculo.subtrair(primeiroNumero, segundo); break;
        		case "*": resultado = calculo.multiplicar(primeiroNumero, segundo); break;
        		case "": resultado = 0;
        		case "/": try {
        			resultado = calculo.dividir(primeiroNumero, segundo);
        		}
        		catch (ExeptionDivisaoPorZero e1) {
        			JOptionPane.showMessageDialog(this, e1.getMessage());
        			return;
        		}
        		break;
        		
        	}
        	
        	display.setText(String.valueOf(resultado));
        	primeiroNumero = resultado;
            esperandoSegundo = true;
        });
        
        
        JButton subtracao = new JButton();
        subtracao.setText("--");
        subtracao.setBounds(310, 270, 90, 90);
        add(subtracao);
        
      //personalizacao botao
        subtracao.setBackground(new Color(37, 44, 56));
        subtracao.setForeground(Color.WHITE);
        
        subtracao.addActionListener(e -> {
            primeiroNumero = Double.parseDouble(display.getText());
            operador = "-";
            esperandoSegundo = true;
            });
        
        
        
        JButton adicao = new JButton();
        adicao.setText("+");
        adicao.setBounds(310, 370, 90, 90);
        add(adicao);
        
      //personalizacao botao mais
        adicao.setBackground(new Color(37, 44, 56));
        adicao.setForeground(Color.WHITE);
        
        adicao.addActionListener(e -> {
        primeiroNumero = Double.parseDouble(display.getText());
        operador = "+";
        esperandoSegundo = true;
        });

        
        JButton multiplicacao = new JButton();
        multiplicacao.setText("X");
        multiplicacao.setBounds(310, 470, 90, 90);
        add(multiplicacao);
        
      //personalizacao botao vezes
        multiplicacao.setBackground(new Color(37, 44, 56));
        multiplicacao.setForeground(Color.WHITE);
        
        multiplicacao.addActionListener(e -> {
            primeiroNumero = Double.parseDouble(display.getText());
            operador = "*";
            esperandoSegundo = true;
            });
        
        
        JButton divisao = new JButton();
        divisao.setText("÷");
        divisao.setBounds(310, 170, 90, 90);
        add(divisao);
        
      //personalizacao botao divisao
        divisao.setForeground(Color.WHITE);
        divisao.setBackground(new Color(37, 44, 56));
        
        divisao.addActionListener(e -> {
            primeiroNumero = Double.parseDouble(display.getText());
            operador = "/";
            esperandoSegundo = true;
            });
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
