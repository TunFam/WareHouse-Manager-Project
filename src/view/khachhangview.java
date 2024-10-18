/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Admin
 */
public class khachhangview extends JPanel implements ActionListener {

    public JTextField t_ma, t_ten, t_ngaysinh, t_diachi, t_dienthoai;
    public JTextField search;
    public JTable table1;
    public JButton add, edit, save, delete, b_search, xuatfile;
    public DefaultTableModel model;
    public String k1;

    public khachhangview() {
        Font f = new Font("Osward", Font.PLAIN, 20);
        Font f1 = new Font("Osward", Font.PLAIN, 15);
        this.setLayout(new BorderLayout(20, 10));
        search = new JTextField(20);
        search.setFont(f);
        b_search = new JButton("Search");

         b_search.setBackground(Color.decode("#24A645"));
        b_search.setForeground(Color.WHITE);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(search);
        p1.add(b_search);

        this.add(p1, BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        table1 = new JTable();
        JScrollPane sp = new JScrollPane(table1);
        model = (DefaultTableModel) table1.getModel();
        model.setColumnIdentifiers(new Object[]{"STT", "Mã khachang", "Họ tên", "Ngày sinh", "Điện thoại", "Địa chỉ"});

        JTableHeader jh = table1.getTableHeader();
        jh.setBackground(Color.decode("#424E59"));
        jh.setForeground(Color.WHITE);
        p2.add(sp, BorderLayout.CENTER);

        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout(50, 10, 10));
        xuatfile = new JButton("Xuất file");
        xuatfile.setForeground(Color.WHITE);
        xuatfile.setBackground(Color.decode("#24A645"));
        p4.add(xuatfile);
        p2.add(p4, BorderLayout.SOUTH);
        this.add(p2, BorderLayout.CENTER);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridBagLayout());
        JLabel l_ma = new JLabel("Mã khach hang:");
        l_ma.setFont(f);
        JLabel l_ten = new JLabel("Tên khach hang:");
        l_ten.setFont(f);
        JLabel l_ngaysinh = new JLabel("Ngày sinh:");
        l_ngaysinh.setFont(f);
        JLabel l_diachi = new JLabel("Địa chỉ");
        l_diachi.setFont(f);
        JLabel l_dienthoai = new JLabel("Điện thoại");
        l_dienthoai.setFont(f);

        t_ma = new JTextField(10);
        t_ma.setFont(f1);
        t_ten = new JTextField(15);
        t_ten.setFont(f1);
        t_ngaysinh = new JTextField(10);
        t_ngaysinh.setFont(f1);
        t_diachi = new JTextField(15);
        t_diachi.setFont(f1);

        t_dienthoai = new JTextField(15);
        t_dienthoai.setFont(f1);
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 10, 10, 10);
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.anchor = GridBagConstraints.WEST;
        p3.add(new JLabel("Mã khach hàng:"), gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        p3.add(new JLabel("Tên khach hang:"), gbc1);
        gbc1.gridy++;
        gbc1.gridx = 0;
        p3.add(new JLabel("Ngày sinh:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Điện thoại:"), gbc1);
        gbc1.gridy++;

        p3.add(new JLabel("Địa chỉ:"), gbc1);
        gbc1.gridy++;

        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.gridx = 1;
        gbc1.gridy = 0;
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
        gbc1.gridy = 4;
        p3.add(t_diachi, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 5;

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

//        this.setVisible(true);
    }

    public void xoatrang() {
        t_ma.setText("");
        t_ten.setText("");
        t_ngaysinh.setText("");
        t_diachi.setText("");
        t_dienthoai.setText("");

        search.setText("");
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

    public void action_search(ActionListener log) {
        b_search.addActionListener(log);
    }

    public void action_xuatfile(ActionListener log) {
        xuatfile.addActionListener(log);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
