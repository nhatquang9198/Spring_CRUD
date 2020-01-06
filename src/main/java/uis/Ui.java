package uis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ui extends JFrame implements ActionListener {
	private JTextField txtMaLop, txtTenLop, txtGVCN;
	private JButton btnDau, btnTruoc, btnSau, btnCuoi, btnThem, btnLuu, btnSua, btnXoa, btnXemDSSV;
	private JLabel lblMauTin;
	private DefaultTableModel dataModel;
	private JTable table;
	private int tongSoMauTin, mauTinHienHanh;

	public Ui() {
		setTitle("CRUD");
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Box b, b1, b2, b3, b4, b5, b6, b7;
		
		add(b = Box.createVerticalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b1 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b2 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b3 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b4 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b5 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b6 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b7 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));

		JLabel lblTieuDe, lblMaLop, lblTenLop, lblGVCN;
		b1.add(lblTieuDe = new JLabel("Spring Hibernate CRUD", JLabel.CENTER));
		lblTieuDe.setFont(new Font("Arial", Font.BOLD, 26));

		b2.add(lblMaLop = new JLabel("Ma Lop", JLabel.RIGHT));
		b2.add(txtMaLop = new JTextField());
		b3.add(lblTenLop = new JLabel("Ten Lop", JLabel.RIGHT));
		b3.add(txtTenLop = new JTextField());
		b4.add(lblGVCN = new JLabel("Giao Vien Chu Nhiem", JLabel.RIGHT));
		b4.add(txtGVCN = new JTextField());
		lblMaLop.setPreferredSize(lblGVCN.getPreferredSize());
		lblTenLop.setPreferredSize(lblGVCN.getPreferredSize());

		b5.add(btnThem = new JButton("Them"));
		b5.add(btnXoa = new JButton("Luu"));
		b5.add(btnSua = new JButton("Sua"));
		b5.add(btnLuu = new JButton("Xoa"));

		String[] header = { "Ma So Lop", "Ten Lop", "Giao Vien Chu Nhiem" };
		dataModel = new DefaultTableModel(header, 0);
		JScrollPane scroll;
		b6.add(scroll = new JScrollPane(table = new JTable(dataModel)));
		scroll.setBorder(BorderFactory.createTitledBorder("Danh sach lop hoc"));

		btnThem.addActionListener(this);
		btnLuu.addActionListener(this);
		btnXoa.addActionListener(this);
		btnSua.addActionListener(this);
		updateTable();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ui();
	}

	public void updateTable() {
//		DanhSachLopHoc ds = new DanhSachLopHoc();
//		java.util.List<LopHoc> list = ds.docTuBang();
//		for (LopHoc s : list) {
//			String[] rowData = { s.getMaLop(), s.getTenLop(), s.getGiaovienCn() + "" };
//			dataModel.addRow(rowData);
//		}
//		table.setModel(dataModel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
