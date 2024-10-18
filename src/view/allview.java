/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author DELL
 */
public class allview extends JPanel implements ActionListener{
    JMenuBar menuBar;
    JPanel button;
    String link="C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\img\\";
    JPanel p1,p2,p3;
    JMenu menu1,menu2,menu3,menu4;
    JMenuItem item1, item2;
    public JTextField txt_tk;
    JButton btn_tk;
    public JTable table_right,table_left;
    public DefaultTableModel model,model1;
    JScrollPane sp,sp1;
    public JLabel lb_tenkhachhang,lb_madon;
    public JLabel txt_tenkhachhang,txt_madon;
    public JLabel lb_hinhanh;
    ImageIcon img_icon;
    public String duongdananh;
    JButton delete, add;
    public allview(){
//        JFrame J = new JFrame();
        khoitao();
//        this.setSize(1500,1000);
//        this.setVisible(true);
////        this.setJMenuBar(menuBar);
        this.setLayout(new BorderLayout());
        this.add(p1(),BorderLayout.NORTH);
        this.add(p2(),BorderLayout.CENTER);
        this.add(p3(),BorderLayout.WEST);
        
        this.setVisible(true);
        
    }
    public void khoitao(){
        
//        menuBar = new JMenuBar();
//        menu1 = new JMenu("Tất cả");
//        menu2 = new JMenu("Thêm đơn hàng");
//        item1 = new JMenuItem("Tất cả");
//        item2 = new JMenuItem("Thêm đơn hàng");
//        menu1.add(item1);
//        menu2.add(item2);
//        menuBar.add(menu1);
//        menuBar.add(menu2);
//        menuBar.show(true);
        p1= new JPanel();
        txt_tk = new JTextField(35);
        img_icon= new ImageIcon(link +"search_FILL0_wght400_GRAD0_opsz24.png");
        img_icon = new ImageIcon(img_icon.getImage().getScaledInstance(20, 20, 10));
        btn_tk= new JButton("Tìm kiếm",img_icon);
        btn_tk.setBackground(Color.decode("#24A645"));
        btn_tk.setForeground(Color.WHITE);
        p2= new JPanel();
        table_right= new JTable();
        table_left= new JTable();
       
        table_left.setBounds(20, 20, 30, 30);
        sp= new JScrollPane(table_right);
        sp1= new JScrollPane(table_left);
        model = (DefaultTableModel) table_right.getModel();
        model1 = (DefaultTableModel) table_left.getModel();
        duongdananh=link+"tải xuống (1).png";
        
        p3 = new JPanel();
        txt_tenkhachhang = new JLabel("Tên khách hàng:");
        lb_tenkhachhang= new JLabel();
        txt_madon = new JLabel("Mã đơn:");
        lb_madon = new JLabel();
        lb_hinhanh = new JLabel("");
       
        lb_hinhanh.setIcon(set_anh(duongdananh));
        ImageIcon img_icon1= new ImageIcon(link+"delete_FILL0_wght400_GRAD0_opsz24.png");
        img_icon1 = new ImageIcon(img_icon1.getImage().getScaledInstance(20, 20, 10));
        JTableHeader jh=  table_left.getTableHeader();
        jh.setBackground(Color.decode("#424E59"));
        jh.setForeground(Color.WHITE);
        JTableHeader jh1=  table_right.getTableHeader();
        jh1.setBackground(Color.decode("#424E59"));
        jh1.setForeground(Color.WHITE);
        
         button= new JPanel( new FlowLayout(FlowLayout.RIGHT,10,10));
        delete= new JButton("Xóa ",img_icon1);
        delete.setBounds(60, 60, 60, 60);
        delete.setBackground(Color.decode("#24A645"));
        delete.setForeground(Color.WHITE);
        add= new JButton("Thêm");
        add.setBounds(60, 60, 60, 60);
        add.setBackground(Color.decode("#24A645"));
        add.setForeground(Color.WHITE);
        button.add(add);
        
        button.add(delete);
        
        
    }
    public JPanel p1(){
        
        p1.setLayout(new FlowLayout());
        p1.add(txt_tk);
        p1.add(btn_tk);
        return p1;
    }
    public JScrollPane p2(){
      model.setColumnIdentifiers(new Object[]{"STT","Mã đơn","Tên khách hàng" , "Thành tiền","Thời gian"});
      
      p2.add(sp);
      return sp;
    }
     public JScrollPane p4(){
      model1.setColumnIdentifiers(new Object[]{"STT","Mã sản phẩm","Tên sản phẩm ","Giá" , "số lượng "});
      
      p2.add(sp1);
      return sp1;
    }
    public JPanel p3(){
        JPanel donhang1= new JPanel();
        
        JPanel donhang = new JPanel();
        donhang.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();  
        gbc.anchor= GridBagConstraints.WEST;
        gbc.insets= new Insets(5, 5, 5, 5);
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.ipadx= 80;
        gbc.ipady=10;
        donhang.add(txt_tenkhachhang,gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.ipadx= 80;
        gbc.ipady=10;
        donhang.add(lb_tenkhachhang,gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.ipadx= 80;
        gbc.ipady=10;
        donhang.add(txt_madon,gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.ipadx= 100;
        gbc.ipady=10;
        donhang.add(lb_madon,gbc);
        donhang1.setLayout(new BorderLayout(10,10));
        donhang1.add(donhang,BorderLayout.NORTH);
        donhang1.add(p4(),BorderLayout.CENTER);
        donhang1.add(button,BorderLayout.SOUTH);
        return donhang1;
    }
   public ImageIcon set_anh(String s){
       ImageIcon img = new ImageIcon(s);
       Image i= img.getImage();
       Image new_img= i.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
       ImageIcon img_icon = new ImageIcon(new_img);
       return img_icon;
   }
    public void action_tim(ActionListener log) {
        btn_tk.addActionListener(log);
    }
    public void action_them_donhang(ActionListener log) {
        add.addActionListener(log);
    }
     public void action_delete(ActionListener log) {
        delete.addActionListener(log);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
    }
   
}
