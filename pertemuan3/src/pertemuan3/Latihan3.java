package pertemuan3;

import java.awt.event.*;
import javax.swing.*;

public class Latihan3 extends JFrame{
	private boolean checkBoxSelected;
	
	public Latihan3() {
	       this.checkBoxSelected = false;
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JLabel labelInput = new JLabel("Nama :");
	        labelInput.setBounds(15,100,350,30);

	        JTextField textField = new JTextField();
	        textField.setBounds(15,130,350,30);

	        JLabel labelInput2 = new JLabel("Nomor HP :");
	        labelInput2.setBounds(15,155,350,30);

	        JTextField textField2 = new JTextField();
	        textField2.setBounds(15,180,350,30);

	        JLabel labelRadio = new JLabel("Jenis Kelamin ");
	        labelRadio.setBounds(15,220,350,30);

	        JRadioButton radioButton1 = new JRadioButton("Laki Laki", true);
	        radioButton1.setBounds(15,250,350,30);

	        JRadioButton radioButton2 = new JRadioButton("Perempuan");
	        radioButton2.setBounds(15,280,350,30);

	        ButtonGroup bg  = new ButtonGroup();
	        bg.add(radioButton1);
	        bg.add(radioButton2);


	        JCheckBox checkBox = new JCheckBox("Warga Negara Asing ? ");
	        checkBox.setBounds(15,315,350,30);

	        JButton button = new JButton("Simpan");
	        button.setBounds(15,360,100,30);

	        JTextArea txtOutput = new JTextArea("");
	        txtOutput.setBounds(15,400,350,250);



	        button.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e) {

	                String jenisKelamin = " ";
	                if (radioButton1.isSelected()) {
	                    jenisKelamin = radioButton1.getText();
	                }
	                if (radioButton2.isSelected()) {
	                    jenisKelamin = radioButton2.getText();
	                }

	                String nama = textField.getText();
	                String nomer = textField2.getText();
	                txtOutput.append("Nama : " + nama + "\n" + "==========" + "\n");
	                txtOutput.append("Nomer Hp : " + nomer + "\n" + "==========" + "\n");
	                txtOutput.append("Jenis Kelamin : " + jenisKelamin + "\n" + "==========" + "\n");

	                textField.setText("");
	                textField2.setText("");

	                if(checkBox.isSelected()){
	                    // String checkbox = textField.getText();
	                    txtOutput.append("WNA : YA " + "\n" + "==========" + "\n");
	                    //textField.setText("");
	                } else {
	                    txtOutput.append("WNA : Tidak " + "\n" + "==========" + "\n");
	                }

	                txtOutput.append("Terimakasih Semoga Harimu Cerah Selalu");
	            }
	        });


	        this.add(button);
	        this.add(textField);
	        this.add(textField2);
	        this.add(labelRadio);
	        this.add(radioButton1);
	        this.add(radioButton2);
	        //this.add(radioButton3);
	        this.add(labelInput);
	        this.add(labelInput2);
	        this.add(txtOutput);
	        this.add(checkBox);

	        this.setSize(400,500);
	        this.setLayout(null);

	    }

	    public static void main(String[] args) {
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                Latihan3 t = new Latihan3();
	                t.setVisible(true);
	            }
	        });
	    }
	}
