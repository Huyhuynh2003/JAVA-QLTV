package data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import chat.ClientChatter;
import readFile.ReadTa;
import readFile.ReadThdc;
import readFile.ReadTrr;

import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GDdocgia extends JFrame {

	private JPanel contentPane;
	private String user	;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GDdocgia frame = new GDdocgia();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
	

	/**
	 * Create the frame.
	 */
	public GDdocgia(String user	) {
		this.user = user;
		setTitle("QU\u1EA2N L\u00DD TH\u01AF VI\u1EC6N");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GDdocgia.class.getResource("/image/H.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 10, 735, 368);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Chat", new ImageIcon(GDdocgia.class.getResource("/image/F.png")), panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Chat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientChatter cc = new ClientChatter(user);
				cc.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(467, 98, 190, 65);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GDdocgia.class.getResource("/image/N.png")));
		lblNewLabel_1.setBounds(120, 69, 204, 160);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("\u0110\u1ECDc s\u00E1ch", new ImageIcon(GDdocgia.class.getResource("/image/read.png")), panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lbltrr = new JLabel("");
		lbltrr.setIcon(new ImageIcon(GDdocgia.class.getResource("/image/trr.jpg")));
		lbltrr.setBounds(10, 10, 152, 188);
		panel_1.add(lbltrr);
		
		JLabel lbltdc = new JLabel("");
		lbltdc.setIcon(new ImageIcon(GDdocgia.class.getResource("/image/th\u0111c.jpg")));
		lbltdc.setBounds(285, 10, 152, 188);
		panel_1.add(lbltdc);
		
		JLabel lbltanh = new JLabel("");
		lbltanh.setIcon(new ImageIcon(GDdocgia.class.getResource("/image/tanh.jpg")));
		lbltanh.setBounds(545, 10, 152, 188);
		panel_1.add(lbltanh);
		
		JButton btnRead = new JButton("\u0110\u1ECDc");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReadTrr rt = new ReadTrr();
				rt.setVisible(true);
			}
		});
		btnRead.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnRead.setBounds(30, 208, 104, 34);
		panel_1.add(btnRead);
		
		JButton btnTđc = new JButton("\u0110\u1ECDc");
		btnTđc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReadThdc th = new ReadThdc();
				th.setVisible(true);
			}
		});
		btnTđc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTđc.setBounds(309, 208, 104, 34);
		panel_1.add(btnTđc);
		
		JButton btnTa = new JButton("\u0110\u1ECDc");
		btnTa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReadTa ta = new ReadTa();
				ta.setVisible(true);
			}
		});
		btnTa.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTa.setBounds(575, 208, 104, 34);
		panel_1.add(btnTa);
		
		JLabel lblNewLabel = new JLabel("TH\u01AF VI\u1EC6N");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel.setBounds(554, 0, 160, 42);
		contentPane.add(lblNewLabel);
		
	}
}
