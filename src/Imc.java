import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Imc {

	private JFrame frmClculoDeImc;
	private JTextField fieldAltura;
	private JTextField fieldPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imc window = new Imc();
					window.frmClculoDeImc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Imc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClculoDeImc = new JFrame();
		frmClculoDeImc.setTitle("C\u00E1lculo de IMC");
		frmClculoDeImc.setBounds(100, 100, 450, 300);
		frmClculoDeImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClculoDeImc.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sua Altura:");
		lblNewLabel.setBounds(10, 37, 79, 14);
		frmClculoDeImc.getContentPane().add(lblNewLabel);
		
		JLabel lblSeuPeso = new JLabel("Seu Peso:");
		lblSeuPeso.setBounds(10, 78, 66, 14);
		frmClculoDeImc.getContentPane().add(lblSeuPeso);
		
		fieldAltura = new JTextField();
		fieldAltura.setBounds(79, 34, 86, 20);
		frmClculoDeImc.getContentPane().add(fieldAltura);
		fieldAltura.setColumns(10);
		
		fieldPeso = new JTextField();
		fieldPeso.setBounds(79, 75, 86, 20);
		frmClculoDeImc.getContentPane().add(fieldPeso);
		fieldPeso.setColumns(10);
		
		JButton btnFecharPrograma = new JButton("Fechar Programa");
		btnFecharPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFecharPrograma.setBounds(188, 128, 176, 23);
		frmClculoDeImc.getContentPane().add(btnFecharPrograma);
		
		JLabel lblImc = new JLabel("Resultado do IMC");
		lblImc.setBounds(10, 132, 126, 14);
		frmClculoDeImc.getContentPane().add(lblImc);
		
		JLabel lbIMC = new JLabel("0.0");
		lbIMC.setBounds(10, 169, 414, 14);
		frmClculoDeImc.getContentPane().add(lbIMC);
		
		JLabel lbResultado = new JLabel("peso");
		lbResultado.setBounds(10, 194, 414, 14);
		frmClculoDeImc.getContentPane().add(lbResultado);
		
		JButton btnCalcularImc = new JButton("Calcular IMC");
		btnCalcularImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double altura = Double.parseDouble(fieldAltura.getText());
				double peso = Double.parseDouble(fieldPeso.getText());
				
				double imc = IMCModel.imc(altura, peso);
				String resultado = IMCModel.imcString(imc);
				
				lbIMC.setText(Double.toString(imc));
				lbResultado.setText(resultado);
				
			}
		});
		btnCalcularImc.setBounds(188, 33, 176, 23);
		frmClculoDeImc.getContentPane().add(btnCalcularImc);

		JButton btnLimpa = new JButton("Limpar");
		btnLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fieldAltura.setText("");
				fieldPeso.setText("");
			}
		});
		btnLimpa.setBounds(188, 78, 176, 23);
		frmClculoDeImc.getContentPane().add(btnLimpa);
		
		
	}
}
