/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Controller.nhanviencontroller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import ws.Nhanvien;

/**
 *
 * @author Admin
 */
public class nhanvienview extends JPanel implements ActionListener {

    public JTextField t_ma, t_ten, t_ngaysinh, t_diachi, t_luong, t_dienthoai;
    public JComboBox cbogioitinh, cbochucvu;
    public JTextField tim;
    public JTable table1;
    public JButton add, edit, save, delete, b_tim, xuatfile;
    public DefaultTableModel model;
    public String k1;

    public nhanvienview() {
        Font f = new Font("Osward", Font.PLAIN, 20);
        Font f1 = new Font("Osward", Font.PLAIN, 15);

        this.setLayout(new BorderLayout(20, 10));
        tim = new JTextField(20);
        tim.setFont(f);
        ImageIcon img_icon1= new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\img\\search_FILL0_wght400_GRAD0_opsz24.png");
        img_icon1 = new ImageIcon(img_icon1.getImage().getScaledInstance(20, 20, 10));
        b_tim = new JButton("Search",img_icon1);

        b_tim.setBackground(Color.decode("#24A645"));
        b_tim.setForeground(Color.WHITE);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(tim);
        p1.add(b_tim);

        this.add(p1, BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        table1 = new JTable();
        JScrollPane sp = new JScrollPane(table1);
        model = (DefaultTableModel) table1.getModel();
        model.setColumnIdentifiers(new Object[]{"STT", "Mã nhan viên", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Điện thoại", "Chức vụ", "Lương"});

        JTableHeader jh = table1.getTableHeader();
        jh.setBackground(Color.decode("#424E59"));
        jh.setForeground(Color.WHITE);
        p2.add(sp, BorderLayout.CENTER);
        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout(50, 10, 10));
        xuatfile = new JButton("Xuất file");
        p4.add(xuatfile);
        xuatfile.setBackground(Color.decode("#24A645"));
        xuatfile.setForeground(Color.WHITE);
        p2.add(p4, BorderLayout.SOUTH);
        this.add(p2, BorderLayout.CENTER);
        JPanel p3 = new JPanel();
        p3.setLayout(new GridBagLayout());
        JLabel l_ma = new JLabel("Mã nhân viên:");
        l_ma.setFont(f);
        JLabel l_ten = new JLabel("Tên nhân viên:");
        l_ten.setFont(f);
        JLabel l_ngaysinh = new JLabel("Ngày sinh:");
        l_ngaysinh.setFont(f);
        JLabel l_diachi = new JLabel("Địa chỉ");
        l_diachi.setFont(f);
        JLabel l_dienthoai = new JLabel("Điện thoại");
        l_dienthoai.setFont(f);
        JLabel l_luong = new JLabel("Lương");
        l_luong.setFont(f);
        JLabel l_gioitinh = new JLabel("Giới tính");
        l_gioitinh.setFont(f);
        JLabel l_chucvu = new JLabel("Chức vụ");
        l_chucvu.setFont(f);
        t_ma = new JTextField(10);
        t_ma.setFont(f1);
        t_ten = new JTextField(15);
        t_ten.setFont(f1);
        t_ngaysinh = new JTextField(10);
        t_ngaysinh.setFont(f1);
        t_diachi = new JTextField(15);
        t_diachi.setFont(f1);
        t_luong = new JTextField(10);
        t_luong.setFont(f1);
        t_dienthoai = new JTextField(15);
        t_dienthoai.setFont(f1);
        cbochucvu = new JComboBox();
        cbochucvu.setFont(f1);
        cbochucvu.addItem("Bảo vệ");
        cbochucvu.addItem("Thu ngân");
        cbochucvu.addItem("Quản lý");
        cbochucvu.addItem("Nhân viên");
        cbochucvu.setFont(f1);
        cbochucvu.setBackground(Color.decode("#424E59"));
        cbochucvu.setForeground(Color.WHITE);
        cbogioitinh = new JComboBox();
        cbogioitinh.addItem("Nam");
        cbogioitinh.addItem("Nữ");
        cbogioitinh.setFont(f1);
        cbogioitinh.setBackground(Color.decode("#424E59"));
        cbogioitinh.setForeground(Color.WHITE);

        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 10, 10, 10);
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.anchor = GridBagConstraints.WEST;
        p3.add(new JLabel("Mã nhân viên:"), gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        p3.add(new JLabel("Tên nhân viên:"), gbc1);
        gbc1.gridy++;
        gbc1.gridx = 0;
        p3.add(new JLabel("Ngày sinh:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Điện thoại:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Giới tính:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Địa chỉ:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Chức vụ:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Lương:"), gbc1);
        gbc1.gridy = 0;
        gbc1.gridx = 1;
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.weightx = 0.5;
        p3.add(t_ma, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 1;
        p3.add(t_ten, gbc1);
        gbc1.gridy = 2;
        gbc1.gridx = 1;
        p3.add(t_ngaysinh, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 3;
        p3.add(t_dienthoai, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 5;
        p3.add(t_diachi, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 7;
        p3.add(t_luong, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 4;
        p3.add(cbogioitinh, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 6;
        p3.add(cbochucvu, gbc1);
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.gridx = 1;
        gbc1.gridy++;
        gbc1.weightx = 1;
        gbc1.fill = GridBagConstraints.HORIZONTAL;
        gbc1.gridwidth = GridBagConstraints.REMAINDER;

        add = new JButton("Làm mới");
        add.setBackground(Color.decode("#424E59"));
        add.setForeground(Color.WHITE);
        edit = new JButton("Sửa");
        edit.setBackground(Color.decode("#424E59"));
        edit.setForeground(Color.WHITE);
        delete = new JButton("Xóa");
        delete.setBackground(Color.decode("#424E59"));
        delete.setForeground(Color.WHITE);
        save = new JButton("Lưu");
        save.setBackground(Color.decode("#424E59"));
        save.setForeground(Color.WHITE);
        
        JPanel buttonsPane = new JPanel(new FlowLayout());
        buttonsPane.add(add);
        buttonsPane.add(edit);
        buttonsPane.add(delete);
        buttonsPane.add(save);
        JPanel p5 = new JPanel();
        p5.setLayout(new BorderLayout());
        p5.add(p3, BorderLayout.NORTH);
        p5.add(buttonsPane, BorderLayout.CENTER);
        this.add(p5, BorderLayout.WEST);
//        this.setSize(1200, 800);
//        this.setLocationRelativeTo(null);
//        this.setVisible(true);

    }

    public void xoatrang() {
        t_ma.setText("");
        t_ten.setText("");
        t_ngaysinh.setText("");
        cbogioitinh.setSelectedIndex(0);
        t_diachi.setText("");
        t_dienthoai.setText("");
        cbochucvu.setSelectedIndex(0);
        t_luong.setText("");
        tim.setText("");
    }

    public void action_add(ActionListener log) {
        add.addActionListener(log);

    }

    public void action_edit(ActionListener log) {
        edit.addActionListener(log);
    }

    public void action_delete(ActionListener log) {
        delete.addActionListener(log);
    }

    public void action_save(ActionListener log) {
        save.addActionListener(log);
    }

    public void action_tim(ActionListener log) {
        b_tim.addActionListener(log);
    }

    public void action_xuatfile(ActionListener log) {
        xuatfile.addActionListener(log);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        nhanviencontroller n = new nhanviencontroller();
    }
}
