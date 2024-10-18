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
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class xuat_hoadon_view extends JFrame implements ActionListener{
    public JLabel lb_tensanpham,lb_gia,lb_masp,hinhanh,lb_mota;
    public JTextField lb_soluong,lb_madon;
    public JTextField lb_tenkhachhang;
    public JLabel txt_tenkhachhang,txt_madon,txt_tensanpham,txt_soluong,txt_gia,txt_tencuahang,txt_masp,txt_thanhtien,txt_mota;
    public JLabel lb_thanhtien;
    public String duongdananh;
    public JPanel hoadon;
   
    public Double gia,thanhtien;
    public JButton tang,giam,xacnhan,huy,delete;
    public int soluong=0;
    public xuat_hoadon_view(){
        khoitao();
        this.add(p1());
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
    }
    public void khoitao(){
        duongdananh="D:\\neatbenas\\BTLthongke\\src\\img\\tải xuống (1).png";
        txt_tenkhachhang= new JLabel("Khách hàng: ");
        
        txt_soluong = new JLabel("Số lượng: ");
        txt_gia= new JLabel("Giá");
        txt_masp = new JLabel("Mã sản phẩm:");
        txt_tensanpham = new JLabel("Tên sản phẩm:");
        txt_thanhtien = new JLabel("Tổng giá trị:");
        lb_mota = new JLabel();
        txt_mota = new JLabel("Mô tả:");
        lb_tenkhachhang = new JTextField(15);
        lb_tensanpham = new JLabel();
        lb_soluong = new JTextField("0",5);
        lb_gia = new JLabel();
        lb_masp= new JLabel();
        lb_thanhtien = new JLabel();
        hoadon = new JPanel();
        hinhanh = new JLabel("");
         txt_tencuahang = new JLabel("NEM fashion");
        Font customFont = new Font(".VnRevueH", Font.BOLD, 18);
        txt_tencuahang.setFont(customFont);
        hinhanh.setIcon(set_anh(duongdananh));
        tang = new JButton("+");
        tang.setForeground(Color.WHITE);
        tang.setBackground(Color.decode("#24A645"));
        giam = new JButton("-");
        giam.setForeground(Color.WHITE);
        giam.setBackground(Color.decode("#24A645"));
        xacnhan= new JButton("Xác nhận",seticon("D:\\neatbenas\\BTLthongke\\src\\img\\done_outline_FILL0_wght400_GRAD0_opsz24.png"));
        xacnhan.setForeground(Color.WHITE);
        xacnhan.setBackground(Color.decode("#24A645"));
        huy= new JButton("Quay lại",seticon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\img\\done_outline_FILL0_wght400_GRAD0_opsz24.png"));
        huy.setForeground(Color.WHITE);
        huy.setBackground(Color.decode("#24A645"));
        lb_madon = new JTextField();
        txt_madon = new JLabel("Mã đơn: ");
        
        delete = new JButton("Xoá",seticon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\img\\delete_FILL0_wght400_GRAD0_opsz24.png"));
        delete.setForeground(Color.WHITE);
        delete.setBackground(Color.decode("#24A645"));
    }
    public ImageIcon seticon(String s){
        ImageIcon img_icon= new ImageIcon(s);
        img_icon = new ImageIcon(img_icon.getImage().getScaledInstance(20, 20, 10));

        return img_icon;
    }
    public JPanel p1(){
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(10,10,10));
        p1.add(hinhanh);
        p1.add(p3());
        return p1;
    }
    public JPanel p2(){
        JPanel button = new JPanel();
        button.setLayout(new FlowLayout(100,10,10));
        button.add(huy);
        button.add(xacnhan);
        button.add(delete);
        
        return button;
    }
    public JPanel hoadon(){
        hoadon.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();  
        gbc.anchor= GridBagConstraints.WEST;
        gbc.insets= new Insets(10, 10, 10, 10);
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_tencuahang,gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_tenkhachhang,gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(lb_tenkhachhang,gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_madon,gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.ipadx= 100;
        gbc.ipady=10;
        hoadon.add(lb_madon,gbc);
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_masp,gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.ipadx= 100;
        gbc.ipady=10;
        hoadon.add(lb_masp,gbc);
        gbc.gridx=0;
        gbc.gridy=4;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_tensanpham,gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        gbc.ipadx= 100;
        gbc.ipady=10;
        hoadon.add(lb_tensanpham,gbc);
        gbc.gridx=0;
        gbc.gridy=5;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_mota,gbc);
        gbc.gridx=1;
        gbc.gridy=5;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(lb_mota,gbc);
        gbc.gridx=0;
        gbc.gridy=6;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_gia,gbc);
        gbc.gridx=1;
        gbc.gridy=6;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(lb_gia,gbc);
        gbc.gridx=0;
        gbc.gridy=7;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_soluong,gbc);
        gbc.gridx=1;
        gbc.gridy=7;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(soluong(),gbc);
        
        gbc.gridx=0;
        gbc.gridy=8;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_thanhtien,gbc);
        gbc.gridx=1;
        gbc.gridy=8;
        gbc.ipadx= 100;
        gbc.ipady=10;
        hoadon.add(lb_thanhtien,gbc);
        
        return hoadon;
    }
    public JPanel soluong(){
        JPanel soluong = new JPanel();
        soluong.setLayout(new FlowLayout(5,5,5));
        soluong.add(tang);
        soluong.add(lb_soluong);
        soluong.add(giam);
        return soluong;
    }
    public JPanel p3(){
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout(5,5));
        p3.add(hoadon(),BorderLayout.NORTH);
        p3.add(p2(),BorderLayout.CENTER);
        return p3;
    }
     public ImageIcon set_anh(String s){
       ImageIcon img = new ImageIcon(s);
       Image i= img.getImage();
       Image new_img= i.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
       ImageIcon img_icon = new ImageIcon(new_img);
       return img_icon;
   }
    
      public void action_tang_soluong(ActionListener log) {
        tang.addActionListener(log);
    }
    public void action_giam_soluong(ActionListener log) {
        giam.addActionListener(log);
    }
     public void action_xacnhan(ActionListener log) {
        xacnhan.addActionListener(log);
    }
    public void action_huy(ActionListener log) {
        huy.addActionListener(log);
    }
     public void action_xoa(ActionListener log) {
        delete.addActionListener(log);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void showMessage(String s){
        JOptionPane.showMessageDialog(this, s);
    }
}
