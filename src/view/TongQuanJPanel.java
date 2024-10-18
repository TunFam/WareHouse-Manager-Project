package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class TongQuanJPanel extends JPanel {

    private JPanel SumRevavue;
    private JPanel SumOrder;
    private JPanel SumProduct;

    private JPanel SumStaff;
    private JPanel jpnTitleTQ1;
    private JPanel jpnTitleTQ2;
    private JPanel jpnTitleTQ3;
    private JPanel jpnTitleTQ4;
    private JPanel Chart;
    private JLabel jlbTitle1;
    private JLabel jlbTitle2;
    private JLabel jlbTitle3;
    private JLabel jlbTitle4;
    private JLabel jlbFigure1;
    private JLabel jlbFigure2;
    private JLabel jlbFigure3;
    private JLabel jlbFigure4;

    public TongQuanJPanel() {
        initUI();
        
    }

    public JPanel getSumRevavue() {
        return SumRevavue;
    }

    public void setSumRevavue(JPanel SumRevavue) {
        this.SumRevavue = SumRevavue;
    }

    public JPanel getSumOrder() {
        return SumOrder;
    }

    public void setSumOrder(JPanel SumOrder) {
        this.SumOrder = SumOrder;
    }

    public JPanel getSumProduct() {
        return SumProduct;
    }

    public void setSumProduct(JPanel SumProduct) {
        this.SumProduct = SumProduct;
    }

    public JPanel getSumStaff() {
        return SumStaff;
    }

    public void setSumStaff(JPanel SumStaff) {
        this.SumStaff = SumStaff;
    }

    public JPanel getJpnTitleTQ1() {
        return jpnTitleTQ1;
    }

    public void setJpnTitleTQ1(JPanel jpnTitleTQ1) {
        this.jpnTitleTQ1 = jpnTitleTQ1;
    }

    public JPanel getJpnTitleTQ2() {
        return jpnTitleTQ2;
    }

    public void setJpnTitleTQ2(JPanel jpnTitleTQ2) {
        this.jpnTitleTQ2 = jpnTitleTQ2;
    }

    public JPanel getJpnTitleTQ3() {
        return jpnTitleTQ3;
    }

    public void setJpnTitleTQ3(JPanel jpnTitleTQ3) {
        this.jpnTitleTQ3 = jpnTitleTQ3;
    }

    public JPanel getJpnTitleTQ4() {
        return jpnTitleTQ4;
    }

    public void setJpnTitleTQ4(JPanel jpnTitleTQ4) {
        this.jpnTitleTQ4 = jpnTitleTQ4;
    }

    public JPanel getChart() {
        return Chart;
    }

    public void setChart(JPanel Chart) {
        this.Chart = Chart;
    }

    public JLabel getJlbTitle1() {
        return jlbTitle1;
    }

    public void setJlbTitle1(JLabel jlbTitle1) {
        this.jlbTitle1 = jlbTitle1;
    }

    public JLabel getJlbTitle2() {
        return jlbTitle2;
    }

    public void setJlbTitle2(JLabel jlbTitle2) {
        this.jlbTitle2 = jlbTitle2;
    }

    public JLabel getJlbTitle3() {
        return jlbTitle3;
    }

    public void setJlbTitle3(JLabel jlbTitle3) {
        this.jlbTitle3 = jlbTitle3;
    }

    public JLabel getJlbTitle4() {
        return jlbTitle4;
    }

    public void setJlbTitle4(JLabel jlbTitle4) {
        this.jlbTitle4 = jlbTitle4;
    }

    public JLabel getJlbFigure1() {
        return jlbFigure1;
    }

    public void setJlbFigure1(JLabel jlbFigure1) {
        this.jlbFigure1 = jlbFigure1;
    }

    public JLabel getJlbFigure2() {
        return jlbFigure2;
    }

    public void setJlbFigure2(JLabel jlbFigure2) {
        this.jlbFigure2 = jlbFigure2;
    }

    public JLabel getJlbFigure3() {
        return jlbFigure3;
    }

    public void setJlbFigure3(JLabel jlbFigure3) {
        this.jlbFigure3 = jlbFigure3;
    }

    public JLabel getJlbFigure4() {
        return jlbFigure4;
    }

    public void setJlbFigure4(JLabel jlbFigure4) {
        this.jlbFigure4 = jlbFigure4;
    }

    private void initUI() {
        // Thiết kế giao diện của trang Tổng quan ở đây
        this.setLayout(new BorderLayout());

        // Thêm các thành phần như các biểu đồ, thông tin tổng quan, tin tức, quảng cáo, v.v.
        JPanel pnTitle = new JPanel(new GridBagLayout());
        JLabel titleLabel = new JLabel("TỔNG QUAN");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("#9Slide03 Oswald Medium", Font.LAYOUT_RIGHT_TO_LEFT, 28));
        titleLabel.setForeground(Color.decode("#424E59"));
        titleLabel.setAlignmentY(TOP_ALIGNMENT);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(100, 30, 0, 900);
        pnTitle.add(titleLabel, gbc);

        JPanel Content = new JPanel(new GridBagLayout());
        JPanel ContentSupport = new JPanel(new GridBagLayout());

        SumRevavue = new JPanel(new GridBagLayout());
        SumOrder = new JPanel(new GridBagLayout());
        SumProduct = new JPanel(new GridBagLayout());
        Chart = new JPanel(new GridBagLayout());
        SumStaff = new JPanel(new GridBagLayout());

        SumRevavue.setPreferredSize(new Dimension(500, 250));
        SumRevavue.setBackground(Color.decode("#24A645"));
        SumOrder.setPreferredSize(new Dimension(250, 250));
        SumOrder.setBackground(Color.decode("#424E59"));
        SumProduct.setPreferredSize(new Dimension(250, 250));
        SumProduct.setBackground(Color.decode("#424E59"));
        Chart.setPreferredSize(new Dimension(750, 350));
        Chart.setBackground(Color.WHITE);
        SumStaff.setPreferredSize(new Dimension(250, 250));
        SumStaff.setBackground(Color.decode("#424E59"));

        //ten title 
//        JPanel jpnTitleTQ= new JPanel(new GridBagLayout());
//        GridBagConstraints gbc1= new GridBagConstraints();
        jpnTitleTQ1 = new JPanel();
        jpnTitleTQ1.setBackground(Color.decode("#24A645"));
        jlbTitle1 = new JLabel("DOANH THU");
        jlbTitle1.setForeground(Color.WHITE);
        jlbTitle1.setFont(new Font("#9Slide03 Oswald", ERROR, 24));
        JLabel jlbLogo1 = new JLabel();
        ImageIcon logoIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Revenue.png");
        logoIcon = new ImageIcon(logoIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbLogo1.setIcon(logoIcon);
        JPanel hienthiso = new JPanel();
        hienthiso.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jlbFigure1 = new JLabel();

//        jlbFigure1.setText(String.format("", 0));
        jlbFigure1.setFont(new Font("#9Slide03 Oswald Medium", ERROR, 77));
        jlbFigure1.setForeground(Color.white);
        jlbFigure1.setHorizontalAlignment(SwingConstants.RIGHT);
        JLabel jlbUnit = new JLabel("VND");
        jlbUnit.setFont(new Font("#9Slide03 Oswald Light", ERROR, 22));
        jlbUnit.setForeground(Color.white);
        jpnTitleTQ1.add(jlbLogo1);
        jpnTitleTQ1.add(jlbTitle1);

        jpnTitleTQ2 = new JPanel();
        jpnTitleTQ2.setBackground(Color.decode("#424E59"));
        jlbTitle2 = new JLabel("SẢN PHẨM");
        jlbTitle2.setForeground(Color.WHITE);
        jlbTitle2.setFont(new Font("#9Slide03 Oswald", ERROR, 24));
        JLabel jlbLogo2 = new JLabel();
        ImageIcon logoIcon2 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Product.png");
        logoIcon2 = new ImageIcon(logoIcon2.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbLogo2.setIcon(logoIcon2);
        jlbFigure2 = new JLabel();
        jlbFigure2.setFont(new Font("#9Slide03 Oswald Medium", ERROR, 77));
        jlbFigure2.setForeground(Color.white);
        jpnTitleTQ2.add(jlbLogo2);
        jpnTitleTQ2.add(jlbTitle2);

        jpnTitleTQ3 = new JPanel();
        jpnTitleTQ3.setBackground(Color.decode("#424E59"));
        jlbTitle3 = new JLabel("ĐƠN HÀNG");
        jlbTitle3.setForeground(Color.WHITE);
        jlbTitle3.setFont(new Font("#9Slide03 Oswald", ERROR, 24));
        JLabel jlbLogo3 = new JLabel();
        ImageIcon logoIcon3 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Order.png");
        logoIcon3 = new ImageIcon(logoIcon3.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbLogo3.setIcon(logoIcon3);
        jlbFigure3 = new JLabel();
        jlbFigure3.setFont(new Font("#9Slide03 Oswald Medium", ERROR, 77));
        jlbFigure3.setForeground(Color.white);
        jpnTitleTQ3.add(jlbLogo3);
        jpnTitleTQ3.add(jlbTitle3);

        jpnTitleTQ4 = new JPanel();
        jpnTitleTQ4.setBackground(Color.decode("#424E59"));
        jlbTitle4 = new JLabel("KHÁCH HÀNG");
        jlbTitle4.setForeground(Color.WHITE);
        jlbTitle4.setFont(new Font("#9Slide03 Oswald", ERROR, 24));
        JLabel jlbLogo4 = new JLabel();
        ImageIcon logoIcon4 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Order.png");
        logoIcon4 = new ImageIcon(logoIcon4.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbLogo4.setIcon(logoIcon4);
        jlbFigure4 = new JLabel();
        jlbFigure4.setFont(new Font("#9Slide03 Oswald Medium", ERROR, 77));
        jlbFigure4.setForeground(Color.white);
        jpnTitleTQ4.add(jlbLogo4);
        jpnTitleTQ4.add(jlbTitle4);

//    
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.insets = new Insets(10, 0, 10, 300);

        SumRevavue.add(jpnTitleTQ1, gbc1);
        gbc1.insets = new Insets(10, 0, 10, 0);
        SumOrder.add(jpnTitleTQ3, gbc1);
        gbc1.insets = new Insets(10, 0, 10, 0);
        SumProduct.add(jpnTitleTQ2, gbc1);
        gbc1.insets = new Insets(10, 0, 10, 0);
        SumStaff.add(jpnTitleTQ4, gbc1);

        gbc1.gridy = 1;
        gbc1.insets = new Insets(0, 0, 0, 0);
//        hienthiso.add(jlbFigure1);
        gbc1.anchor = GridBagConstraints.EAST; // Căn lề phải
        SumRevavue.add(jlbFigure1, gbc1);

        gbc1.gridy = 2;
        gbc1.insets = new Insets(-15, 400, 20, 0);
        gbc1.anchor = GridBagConstraints.CENTER; // Căn lề phải
        SumRevavue.add(jlbUnit, gbc1);

        gbc1.gridy = 1;
        gbc1.insets = new Insets(0, 0, 35, 0);
        SumOrder.add(jlbFigure2, gbc1);

        gbc1.gridy = 1;
        gbc1.insets = new Insets(0, 0, 35, 0);
        SumProduct.add(jlbFigure3, gbc1);

        gbc1.gridy = 1;
        gbc1.insets = new Insets(0, 0, 35, 0);
        SumStaff.add(jlbFigure4, gbc1);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 20, 0, 0);
        ContentSupport.add(SumRevavue, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
//        gbc.insets= new Insets(0, 0, 500, 600);
        ContentSupport.add(SumOrder, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 20, 10);
        Content.add(ContentSupport, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        Content.add(SumProduct, gbc);
        gbc.insets = new Insets(0, 10, 150, 10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        Content.add(SumStaff, gbc);
        gbc.insets = new Insets(0, 10, 50, 10);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Content.add(Chart, gbc);
        // Thêm các thành phần vào TongQuanJPanel
        this.add(pnTitle, BorderLayout.NORTH);
        this.add(Content, BorderLayout.CENTER);
    }

    
    public void updateSoLuongSanPham(double doanhThu,int slDH,int slSP,int slKH) {
        jlbFigure1.setText(Double.toString(doanhThu));
        jlbFigure2.setText(Integer.toString(slDH));
        jlbFigure3.setText(Integer.toString(slSP));
        jlbFigure4.setText(Integer.toString(slKH) );
        
    }
    
}
