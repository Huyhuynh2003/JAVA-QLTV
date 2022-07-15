package readFile;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.GDdocgia;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ReadTa extends JFrame {

	private JPanel contentPane;
	private  JTextArea textArea;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ReadTrr frame = new ReadTrr();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	
	public ReadTa() {
		setTitle("QU\u1EA2N L\u00DD TH\u01AF VI\u1EC6N");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ReadTrr.class.getResource("/image/H.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1172, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		
		textArea = new JTextArea();
		  String url = "C:\\Users\\BRAVO 15\\eclipse-workspace\\QLTV\\src\\File txt\\ta.txt";

	        // Đọc dữ liệu từ File với File và FileReader
	        File file = new File(url);
	        BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(file));
				String line = reader.readLine();
	            while (line != null) {
					try {
						textArea.append(line + '\n');
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                line = reader.readLine();
	            }
	            reader.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	        
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
	
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10,50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Quay l\u1EA1i");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GDdocgia gg = new GDdocgia(null);
				gg.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(ReadTrr.class.getResource("/image/I.png")));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(966, 10, 172, 30);
		panel.add(btnNewButton);
		
	}
	
    public static void main(String args[]) throws IOException {
    	new ReadTrr().setVisible(true);
      
    }
    

}
