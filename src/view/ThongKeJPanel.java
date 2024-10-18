/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author DELL
 */
public class ThongKeJPanel extends JPanel {

    private int doanhThu, slSP, slDH, tbDon, tbSP;

    public int getSlSP() {
        return slSP;
    }

    public void setSlSP(int slSP) {
        this.slSP = slSP;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    public int getSlDH() {
        return slDH;
    }

    public void setSlDH(int slDH) {
        this.slDH = slDH;
    }

    public int getTbDon() {
        return tbDon;
    }

    public void setTbDon(int tbDon) {
        this.tbDon = tbDon;
    }

    public int getTbSP() {
        return tbSP;
    }

    public void setTbSP(int tbSP) {
        this.tbSP = tbSP;
    }
    private JLabel figureDoanhThu;
    private JLabel figureSlSP;
    private JLabel figureSlDH;
    private JLabel figureTBDon;
    private JLabel figureTBSP;

    private JPanel dashboard1;
    private JPanel dashboard2;
    private JPanel dashboard3;

    private JPanel pnKH;
    private JPanel pnSP;
    private JPanel pnDH;
    private JLabel lbKH;
    private JLabel lbSP;
    private JLabel lbDH;

    public JPanel getpnKH() {
        return pnKH;
    }

    ;
        public JLabel getlbKH() {
        return lbKH;
    }

    ;
        public JPanel getpnDH() {
        return pnDH;
    }

    ;
        public JLabel getlbDH() {
        return lbDH;
    }

    ;
        public JPanel getpnSP() {
        return pnSP;
    }

    ;
        public JLabel getlbSP() {
        return lbSP;
    }

    ;
        
        public JPanel getdashboard1() {
        return dashboard1;
    }

    ;
        public JPanel getdashboard2() {
        return dashboard2;
    }

    ;
        public JPanel getdashboard3() {
        return dashboard3;
    }

    ;
        
        
        
        public void initUI() {

        this.setPreferredSize(new Dimension(1500, 1000));

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //content1
        JPanel content1 = new JPanel(new GridBagLayout());
//            content1.setPreferredSize(new Dimension(600,300));

//================
        dashboard3 = new JPanel();
        dashboard3.setPreferredSize(new Dimension(350, 350));
        dashboard3.setBackground(Color.white);

        //=========
        //o thu 2
        JPanel contentsp1 = new JPanel(new FlowLayout());
        contentsp1.setPreferredSize(new Dimension(450, 350));

        JPanel jpntimkiem = new JPanel(new GridBagLayout());
        jpntimkiem.setPreferredSize(new Dimension(450, 50));
        try {
            JButton btnTimKiem = new JButton("Tìm kiếm");
            Font fDate = new Font("Osward", ERROR, 20);
            Font fDate1 = new Font("Osward", ERROR, 15);
            JDateChooser date1= new JDateChooser();JDateChooser date2 = new JDateChooser();
            btnTimKiem.setFont(fDate);
            date1.setFont(fDate1);
            date2.setFont(fDate1);
            date1.setPreferredSize(new Dimension(120,30));
            date2.setPreferredSize(new Dimension(120,30));
            gbc.insets = new Insets(5, 5, 5, 5);
            jpntimkiem.add(date1,gbc);
            jpntimkiem.add(new JLabel("-"),gbc);
            jpntimkiem.add(date2,gbc);
            jpntimkiem.add(btnTimKiem,gbc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JPanel jpnfigure = new JPanel(new GridBagLayout());
        jpnfigure.setBackground(Color.decode("#424E59"));
        jpnfigure.setPreferredSize(new Dimension(450, 280));

        JLabel lbDoanhThu = new JLabel("Doanh thu: ");
        JLabel lbSlSP = new JLabel("SL sản phẩm: ");
        JLabel lbSlDH = new JLabel("SL đơn hàng: ");
        JLabel lbTBDon = new JLabel("TB doanh thu/đơn hàng: ");
        JLabel lbTBSP = new JLabel("SL sản phẩm/đơn hàng: ");
        figureDoanhThu = new JLabel();
        figureSlSP = new JLabel();
        figureSlDH = new JLabel();
        figureTBDon = new JLabel();
        figureTBSP = new JLabel();
       
        Font font = new Font("#9Slide03 Oswald Regular", ERROR, 20);
        lbDoanhThu.setFont(font);
        lbSlSP.setFont(font);
        lbSlDH.setFont(font);
        lbTBDon.setFont(font);
        lbTBSP.setFont(font);
        figureDoanhThu.setFont(font);
        figureSlSP.setFont(font);
        figureSlDH.setFont(font);
        figureTBDon.setFont(font);
        figureTBSP.setFont(font);

        lbDoanhThu.setForeground(Color.white);
        lbSlSP.setForeground(Color.white);
        lbSlDH.setForeground(Color.white);
        lbTBDon.setForeground(Color.white);
        lbTBSP.setForeground(Color.white);
        figureDoanhThu.setForeground(Color.white);
        figureSlSP.setForeground(Color.white);
        figureSlDH.setForeground(Color.white);
        figureTBDon.setForeground(Color.white);
        figureTBSP.setForeground(Color.white);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(20, 20, 0, 20);
        JLabel titleFG = new JLabel("SỐ LIỆU");
        Font fTitle1 = new Font("#9Slide03 Oswald Medium", ERROR, 28);
        titleFG.setForeground(Color.white);
        titleFG.setFont(fTitle1);
        gbc.gridx = 0;
        gbc.gridy = 0;
        jpnfigure.add(titleFG, gbc);
        gbc.insets = new Insets(10, 20, 0, 20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        jpnfigure.add(lbDoanhThu, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        jpnfigure.add(figureDoanhThu, gbc);
        gbc.insets = new Insets(5, 20, 0, 20);
        gbc.gridx = 0;
        gbc.gridy = 2;
        jpnfigure.add(lbSlSP, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        jpnfigure.add(lbSlDH, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        jpnfigure.add(lbTBDon, gbc);

        gbc.insets = new Insets(5, 20, 0, 40);
        gbc.gridx = 1;
        gbc.gridy = 2;
        jpnfigure.add(figureSlSP, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        jpnfigure.add(figureSlDH, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        jpnfigure.add(figureTBDon, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 20, 40, 20);
        jpnfigure.add(figureTBSP, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        jpnfigure.add(lbTBSP, gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentsp1.add(jpntimkiem, gbc);
        gbc.insets = new Insets(20, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 1;
        contentsp1.add(jpnfigure, gbc);

        //====
        //o thu3
        JPanel contentsp2 = new JPanel(new GridBagLayout());
        contentsp2.setPreferredSize(new Dimension(250, 350));
        JLabel lbTitle = new JLabel("THỐNG KÊ");
        Font fTitle = new Font("#9Slide03 Oswald Medium", ERROR, 50);
        lbTitle.setFont(fTitle);
        lbTitle.setForeground(Color.decode("#424E59"));
        //tuy chon
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentsp2.add(lbTitle, gbc);

        pnKH = new JPanel(new GridBagLayout());
        pnKH.setBackground(Color.decode("#424E59"));
        pnKH.setPreferredSize(new Dimension(130, 40));
        lbKH = new JLabel("Khách hàng");
        Font fmenu = new Font("Osward", ERROR, 18);
        lbKH.setFont(fmenu);
        lbKH.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 0, 0);
        lbKH.setHorizontalAlignment(SwingConstants.RIGHT);
        pnKH.add(lbKH, gbc);

        pnSP = new JPanel(new GridBagLayout());
        pnSP.setBackground(Color.decode("#424E59"));
        pnSP.setPreferredSize(new Dimension(130, 40));
        lbSP = new JLabel("Sản phẩm");
        lbSP.setFont(fmenu);
        lbSP.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        pnSP.add(lbSP, gbc);

        pnDH = new JPanel(new GridBagLayout());
        pnDH.setBackground(Color.decode("#424E59"));
        pnDH.setPreferredSize(new Dimension(130, 40));
        lbDH = new JLabel("Đơn hàng");
        lbDH.setFont(fmenu);
        lbDH.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 1;
        pnDH.add(lbDH, gbc);

        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        contentsp2.add(pnKH, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        contentsp2.add(pnDH, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        contentsp2.add(pnSP, gbc);

        //=============
        gbc.insets = new Insets(0, 15, 0, 15);
        gbc.gridx = 0;
        gbc.gridy = 0;
        content1.add(dashboard3, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        content1.add(contentsp1, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        content1.add(contentsp2, gbc);
        gbc.insets = new Insets(0, 0, 0, 0);
        //content2
        dashboard1 = new JPanel();
        dashboard1.setPreferredSize(new Dimension(550, 350));
        dashboard1.setBackground(Color.white);
        dashboard2 = new JPanel();
        dashboard2.setPreferredSize(new Dimension(550, 350));
        dashboard2.setBackground(Color.white);

        JPanel content2 = new JPanel(new GridBagLayout());
        gbc.insets = new Insets(0, 15, 0, 15);
        gbc.gridx = 0;
        gbc.gridy = 0;
        content2.add(dashboard1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        content2.add(dashboard2, gbc);
        //======
        //add tong
        gbc.insets = new Insets(70, 0, 30, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(content1, gbc);
        gbc.insets = new Insets(0, 0, 20, 0);
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(content2, gbc);
    }

    public void updateSoLuongSanPham(double doanhThu,int slSP,int slDH,int tbDon,int tbSP) {
        figureDoanhThu.setText(doanhThu + " vnd");
        figureSlSP.setText(Integer.toString(slSP));
        figureSlDH.setText(Integer.toString(slDH));
        figureTBDon.setText(tbDon + " vnd");
        figureTBSP.setText(tbSP +"");
        
    }

    public ThongKeJPanel() {
        initUI();
        

    }

    public void action_add(ActionListener log) {

    }

}
