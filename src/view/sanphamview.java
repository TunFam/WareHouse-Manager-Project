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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


/**
 *
 * @author Admin
 */
public final class sanphamview extends JPanel implements ActionListener{
    public JTextField t_masp, t_tensp, t_gia, t_soluong,t_ngaynhap;
    public JComboBox cbodanhmuc,cbodanhmuc1;
    public JTextArea t_mota;
    public JTextField tim;
    public String duongdananh;
    public JLabel anh,l;
    public JComboBox cbtt;
    public JTable table1;
    public JButton add, edit, save, delete, b_tim,chonanh,xuatfile,loc;
    public DefaultTableModel model;
    public String k1;

    public sanphamview() {
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
        xuatfile=new JButton("Xuất file");
         xuatfile.setBackground(Color.decode("#24A645"));
        xuatfile.setForeground(Color.WHITE);
        loc=new JButton("Lọc");
        loc.setBackground(Color.decode("#24A645"));
        loc.setForeground(Color.WHITE);
        cbodanhmuc1=new JComboBox();
        cbodanhmuc1.setBackground(Color.decode("#424E59"));
        cbodanhmuc1.setForeground(Color.WHITE);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(tim);
        p1.add(b_tim);
        p1.add(loc);
        p1.add(cbodanhmuc1);
        this.add(p1, BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        table1 = new JTable(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        table1.setEditingRow(ERROR);
        JScrollPane sp = new JScrollPane(table1);
        model = (DefaultTableModel) table1.getModel();
        model.setColumnIdentifiers(new Object[]{"STT", "Mã sản phẩm", "Tên sản phẩm","Danh mục", "Giá", "Mô tả", "Số lượng", "tình trạng"});
        
        JTableHeader jh=  table1.getTableHeader();
        jh.setBackground(Color.decode("#424E59"));
        jh.setForeground(Color.WHITE);
        p2.add(sp, BorderLayout.CENTER);
        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout(50, 10, 10));
       
        p4.add(xuatfile);
        p2.add(p4, BorderLayout.SOUTH);
        this.add(p2, BorderLayout.CENTER);
        JPanel p3 = new JPanel();
        p3.setLayout(new GridBagLayout());
        JLabel l_ma = new JLabel("Mã sản phẩm:");
        l_ma.setFont(f);
        JLabel l_ten = new JLabel("Tên sản phẩm:");
        l_ten.setFont(f);
        JLabel l_ngaysinh = new JLabel("Giá:");
        l_ngaysinh.setFont(f);
        JLabel l_diachi = new JLabel("Mô tả");
        l_diachi.setFont(f);
        JLabel l_dienthoai = new JLabel("Số lượng");
        l_dienthoai.setFont(f);
        JLabel l_luong = new JLabel("Tình trạng");
        l_luong.setFont(f);
        cbtt=new JComboBox();
        cbtt.addItem("Còn hàng");
        cbtt.addItem("Hết hàng");
        cbtt.setFont(f1);
        t_masp = new JTextField(10);
        t_masp.setFont(f1);
        t_tensp = new JTextField(15);
        t_tensp.setFont(f1);
        t_gia = new JTextField(10);
        t_gia.setFont(f1);
        t_mota = new JTextArea(8,15);
        t_mota.setFont(f1);
        t_soluong = new JTextField(10);
        t_soluong.setFont(f1);
        t_ngaynhap = new JTextField(15);
        t_ngaynhap.setEditable(false);
        t_ngaynhap.setFont(f1);
        cbodanhmuc=new JComboBox();
        cbodanhmuc.setFont(f1);
        cbodanhmuc.setBackground(Color.decode("#424E59"));
        cbodanhmuc.setForeground(Color.WHITE);
        cbodanhmuc.setFont(f1);
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 10, 10, 10);
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        p3.add(new JLabel("Mã sản phẩm:"), gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        p3.add(new JLabel("Tên sản phẩm:"), gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 2;
        p3.add(new JLabel("Danh mục:"), gbc1);
        gbc1.gridy++;
        gbc1.gridx = 0;
        p3.add(new JLabel("Giá:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Mô tả:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Số lượng:"), gbc1);
        gbc1.gridy++;
        p3.add(new JLabel("Tình trạng:"), gbc1);
        gbc1.gridy = 0;
        gbc1.gridx = 1;
        gbc1.anchor = GridBagConstraints.WEST;
        gbc1.gridy = 0;
        gbc1.gridx = 1;
        gbc1.weightx = 0.5;
        p3.add(t_masp, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 1;
        p3.add(t_tensp, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 2;
        p3.add(cbodanhmuc, gbc1);
        gbc1.gridy = 3;
        gbc1.gridx = 1;
        p3.add(t_gia, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 6;
        p3.add(cbtt, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 4;
        p3.add(t_mota, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 5;
        p3.add(t_soluong, gbc1);
        
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
        JPanel p7=new JPanel();
        p7.setLayout(new FlowLayout(20, 10, 10));
        anh =new JLabel("",JLabel.CENTER);
        
        chonanh=new JButton("Chọn ảnh");
        chonanh.setBackground(Color.decode("#424E59"));
        chonanh.setForeground(Color.WHITE);
        ImageIcon img =new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\img\\tải xuống (1).png");
        anh.setIcon(ResizeImage(String.valueOf(img)));
        p7.add(chonanh);
        p7.add(anh);
        JPanel p6=new JPanel();
        p6.setLayout(new BorderLayout());
        p6.add(p7,BorderLayout.NORTH);
        p6.add(p5, BorderLayout.CENTER);
        this.add(p6,BorderLayout.WEST);
        
    }
    public ImageIcon ResizeImage(String Imagepath) {
        ImageIcon myImagae = new ImageIcon(Imagepath);
        Image img = myImagae.getImage();
        Image newImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public void xoatrang() {
        t_masp.setText("");
        t_tensp.setText("");
        t_gia.setText("");
       
        t_mota.setText("");
       
        t_soluong.setText("");
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
    public void action_chonanh(ActionListener log) {
        chonanh.addActionListener(log);
    }
     public void action_xuatfile(ActionListener log) {
        xuatfile.addActionListener(log);
    }
     public void action_loc(ActionListener log) {
        loc.addActionListener(log);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
