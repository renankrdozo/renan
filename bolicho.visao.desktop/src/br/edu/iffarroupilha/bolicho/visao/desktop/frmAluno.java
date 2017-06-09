package br.edu.iffarroupilha.bolicho.visao.desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.iffarroupilha.bolicho.controle.AlunoControle;
import br.edu.iffarroupilha.bolicho.modelo.Aluno;

public class frmAluno extends JFrame{
	

	/**
	 * <p>
	 * Classe que representa a view para gerir Alunos
	 * </p>
	 * 
	 * @author fernando
	 */
		private Bolicho telaPrincipal;

		public frmAluno(Bolicho bolicho) {
		// TODO Auto-generated constructor stub
	}

		public void FrmAluno(Bolicho telaPrincipal) {
			this.telaPrincipal = telaPrincipal;
			setTitle("Bolicho -> Aluno");
			setSize(320, 240);
			setLocationRelativeTo(telaPrincipal);
			desenhaComponentes();
			setVisible(true);
		}

		private void desenhaComponentes() {
			JLabel lblmatricula = new JLabel("Matricula:");
			JLabel lblNome = new JLabel("Nome:");
			final JTextField txtmatricula = new JTextField(30);
			final JTextField txtNome = new JTextField(30);
			JButton btnGravar = new JButton("Gravar");

			setLayout(new FlowLayout(FlowLayout.LEFT));

			btnGravar.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					AlunoControle controle = new AlunoControle();
					// pegar os dados da tela
					Aluno c = new Aluno();
					c.setNome(txtNome.getText());
					// converte para um valor numerico
					int matricula = controle.converteInteiro(txtmatricula.getText());

					c.setmatricula(matricula);

					// valida os dados
					String erro = controle.validarAluno(c);
					if (erro == null) {
						// nenhum erro criado
						// realiza a gravacao
						controle.gravar(c);
						JOptionPane.showMessageDialog(null, "Gravado!");
					} else {
						JOptionPane.showMessageDialog(null, erro, "Validação",
								JOptionPane.WARNING_MESSAGE);
					}
				}
			});

			// adiciona os componentes em tela
			add(lblmatricula);
			add(txtmatricula);
			add(lblNome);
			add(txtNome);
			add(btnGravar);

		}

	}


