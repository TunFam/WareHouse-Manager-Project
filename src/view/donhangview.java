/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lenov
 */
public final class donhangview extends JFrame {

    private static donhangview donhangview;
    public JLabel lb_tensanpham,lb_gia,lb_masp,hinhanh,lb_mota;
    public JLabel lb_soluong,lb_madon;
    JLabel txt_tensanpham,txt_soluong,txt_gia,txt_tencuahang,txt_masp,txt_thanhtien,txt_mota;
    public JLabel lb_thanhtien;
    public String duongdananh,link;
    JPanel hoadon;
    public Double gia,thanhtien;
    public int soluong=0;
    public donhangview(){
        khoitao();
        this.add(p1());
        this.setSize(700,600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    public void khoitao(){
        link="C:\\Users\\DELL\\Documents\\NetBeansProjects\\BTLthongke\\src\\img\\";
        duongdananh=link+"tải xuống (1).png";
        txt_soluong = new JLabel("Số lượng: ");
        txt_gia= new JLabel("Giá");
        txt_masp = new JLabel("Mã sản phẩm:");
        txt_tensanpham = new JLabel("Tên sản phẩm:");
        txt_thanhtien = new JLabel("Tổng giá trị:");
        lb_tensanpham = new JLabel();
        lb_soluong = new JLabel();
        lb_gia = new JLabel();
        lb_masp = new JLabel();
        lb_thanhtien = new JLabel();
        hoadon = new JPanel();
        hinhanh = new JLabel("");
        txt_tencuahang = new JLabel("NEM fashion");
        Font customFont = new Font(".VnRevueH", Font.BOLD, 18);
        txt_tencuahang.setFont(customFont);
        hinhanh.setIcon(set_anh(duongdananh));
       

   
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
        p1.add(hoadon());
        return p1;
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
        hoadon.add(txt_gia,gbc);
        gbc.gridx=1;
        gbc.gridy=5;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(lb_gia,gbc);
        gbc.gridx=0;
        gbc.gridy=6;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_soluong,gbc);
        gbc.gridx=1;
        gbc.gridy=6;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(lb_soluong,gbc);
        gbc.gridx=0;
        gbc.gridy=7;
        gbc.ipadx= 80;
        gbc.ipady=10;
        hoadon.add(txt_thanhtien,gbc);
        gbc.gridx=1;
        gbc.gridy=7;
        gbc.ipadx= 100;
        gbc.ipady=10;
        hoadon.add(lb_thanhtien,gbc);
        return hoadon;
    }
 
  
     public ImageIcon set_anh(String s){
       ImageIcon img = new ImageIcon(s);
       Image i= img.getImage();
       Image new_img= i.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
       ImageIcon img_icon = new ImageIcon(new_img);
       return img_icon;
   }
     public static void main(String[] args) {
        donhangview= new donhangview();
    }
}
