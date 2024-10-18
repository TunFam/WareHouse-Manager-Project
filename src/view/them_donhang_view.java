/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class them_donhang_view extends JFrame implements ActionListener{
    public JTextField txt_tk;
    public JButton btn_tk;
    JPanel p1,p2,p3,p4;
    public JTable table,table_sp;
    public DefaultTableModel model,model_sp;
    JScrollPane sp,sp_1;
    
    public String duongdananh;
    public JButton thanhtien,thanhtoan,tang,giam,delete;
    public int soluong=0;
//    public ArrayList< sanphammodel> arr;
    public int i=2;
    JLabel txt_tencuahang ;
    public  them_donhang_view(){
        khoitao();
        this.setSize(1500, 1080);
        this.setTitle("Thêm đơn hàng");
        this.setLayout(new BorderLayout(20,20));
        this.add(p3(),BorderLayout.WEST);
      
        this.add(p5(),BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
    }
    public void khoitao(){
        p1= new JPanel();
        p2= new JPanel();
        p3= new JPanel();
        p4 = new JPanel();
        duongdananh="C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\img\\tải xuống (1).png";
        txt_tk = new JTextField(20);
        ImageIcon img_icon= new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\img\\search_FILL0_wght400_GRAD0_opsz24.png");
        img_icon = new ImageIcon(img_icon.getImage().getScaledInstance(20, 20, 10));
        btn_tk= new JButton("Tìm kiếm", img_icon);
        btn_tk.setForeground(Color.WHITE);
        btn_tk.setBackground(Color.decode("#24A645"));
        table =new JTable();
        sp= new JScrollPane(table);
        model = (DefaultTableModel) table.getModel();
        table_sp = new JTable();
        table_sp.setBounds(30, 40, 60, 60);
        sp_1= new JScrollPane(table_sp);
        model_sp = (DefaultTableModel) table_sp.getModel();
        thanhtien = new JButton("Thành tiền: 0");
        thanhtoan = new JButton("Thanh toán");
        thanhtoan.setForeground(Color.WHITE);
        thanhtoan.setBackground(Color.decode("#24A645"));
        thanhtien.setBackground(Color.PINK);
        tang= new JButton("+");
        giam= new JButton("-");
        txt_tencuahang = new JLabel("NEM fashion");
        Font customFont = new Font(".VnRevueH", Font.BOLD, 26);
        txt_tencuahang.setFont(customFont);
        
        
    }
    public JPanel p1(){
        p1.setLayout(new FlowLayout());
        p1.add(txt_tk);
        p1.add(btn_tk);
        return p1;
    }
     public JScrollPane p2(){
      model.setColumnIdentifiers(new Object[]{"Mã sản phẩm ","Tên sản phẩm","Hình ảnh","Mô tả", "Giá"});
      p2.add(sp);
      return sp;
    }
     public JPanel p3(){
         
        p3.setLayout(new BorderLayout(20, 20));
        p3.add(p1(),BorderLayout.NORTH);
        p3.add(p2(),BorderLayout.CENTER);
        
        return p3; 
     }
     public JScrollPane p4(){
      
      model_sp.setColumnIdentifiers(new Object[]{"STT","Mã đơn hàng","Tên khách hàng ","Tên sản phẩm", "Giá","số lượng","Thành tiền"});
      
      return sp_1;
    }
    public JPanel p5(){
        JPanel p7 = new JPanel();
        p7.setLayout(new BorderLayout(20,25));
        
        p7.add(p7(),BorderLayout.NORTH);
        p7.add(p4(),BorderLayout.CENTER);
        p4.setLayout(new BorderLayout(10,100));
        
       
        p4.add(p7,BorderLayout.NORTH);
        p4.add(p6(),BorderLayout.CENTER);
        return p4;
    }
     public JPanel p6(){
         JPanel p6 = new JPanel();
         p6.setLayout(new FlowLayout(20,20,10));
         p6.add(thanhtien);
         p6.add(thanhtoan);
         JPanel button = new JPanel();
         button.setLayout(new BorderLayout(20, 20));
         button.add(p6,BorderLayout.EAST);
         return button;
     }
     public JPanel p7(){
         JPanel ten = new JPanel();
         ten.setLayout(new FlowLayout());
         ten.add(txt_tencuahang);
         return ten;
     }
     
//     public JPanel soluong(){
//         JPanel p7 = new JPanel();
//         p7.setLayout(new FlowLayout(5, 5, 5));
//         p7.add(tang);
//         p7.add(lb_soluong);
//         p7.add(giam);
//         return p7;
//     }
    
     public ImageIcon set_anh(String s){
       ImageIcon img = new ImageIcon(s);
       Image i= img.getImage();
       Image new_img= i.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
       ImageIcon img_icon = new ImageIcon(new_img);
       return img_icon;
   }
//    public sanphammodel get_sanpham() {
//       
////        donhang_model n = new donhang_model(lb_tenkhachhang.getText(), lb_tensanpham.getText(), hinhanh.getText(), lb_trangthai.getText(), Integer.parseInt(lb_soluong.getText()), Double.parseDouble(lb_trangthai.getText()));
////        return n;
//    }
    
    public void action_tim(ActionListener log) {
        btn_tk.addActionListener(log);
    }
//    public void action_tang_soluong(ActionListener log) {
//        tang.addActionListener(log);
//    }
//    public void action_giam_soluong(ActionListener log) {
//        giam.addActionListener(log);
//    }
    public void action_thanhtoan(ActionListener log) {
        thanhtoan.addActionListener(log);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void showMessage(String s){
        JOptionPane.showMessageDialog(this, s);
    }
   
    
}
