package view;

import Controller.ChuyenManHinhController;
import Model.DanhMucBean;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainJFrame extends JFrame {

    private JPanel pnTongQuan;
    private JPanel pnQLNV;
    private JPanel pnQLSP;
    private JPanel pnQLDH;
    private JPanel pnTK;
    private JPanel pnQLKH;
    private JLabel lbTQ;
    private JLabel lbQLSP;
    private JLabel lbQLNV;
    private JLabel lbQLDH;
    private JLabel lbTK;
    private JLabel lbQLKH;
    private JPanel pnCenter;

    public MainJFrame(String title) {
        super(title);
        initUI();

        java.util.List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("TongQuan", pnTongQuan, lbTQ));
        listDanhMuc.add(new DanhMucBean("ThongKe", pnTK, lbTK));
        listDanhMuc.add(new DanhMucBean("QLSP", pnQLSP, lbQLSP));
        listDanhMuc.add(new DanhMucBean("QLNV", pnQLNV, lbQLNV));
        listDanhMuc.add(new DanhMucBean("QLDH", pnQLDH, lbQLDH));
        listDanhMuc.add(new DanhMucBean("QLKH", pnQLKH, lbQLKH));

        ChuyenManHinhController controller = new ChuyenManHinhController(pnCenter);
        controller.setDasdboard(pnTongQuan, lbTQ);
        controller.setView(pnTongQuan, lbTQ);
        controller.setDasdboard(pnTK, lbTK);
        controller.setDasdboard(pnQLSP, lbQLSP);
        controller.setDasdboard(pnQLNV, lbQLNV);
        controller.setDasdboard(pnQLDH, lbQLDH);
        controller.setDasdboard(pnQLKH, lbQLKH);

        controller.setEvent(listDanhMuc);
    }

    private void initUI() {

        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JPanel pnBorder = new JPanel(new BorderLayout());
        //vung west
        // Lấy kích thước màn hình
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        JPanel pnWest = new JPanel(new BorderLayout());
        int westWidth = (int) (screenWidth * 0.22);
        pnWest.setPreferredSize(new Dimension(westWidth, 0));
        pnWest.setBackground(Color.decode("#424E59"));
        //logo
        JPanel pnTitle = new JPanel();
        JPanel logo = new JPanel(new GridBagLayout());
        logo.setPreferredSize(new Dimension(westWidth, (int) (screenHeight * 0.1)));
        logo.setBackground(Color.decode("#CCD3D9"));
        JLabel lbTitle = new JLabel("QUẢN LÝ CỬA HÀNG");
        lbTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel lbLogo = new JLabel();
        ImageIcon logoIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\logo.png");
        logoIcon = new ImageIcon(logoIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH));
        lbLogo.setIcon(logoIcon);
        lbLogo.setAlignmentX(Component.CENTER_ALIGNMENT);
        Font fTitle = new Font("Tahoma", Font.CENTER_BASELINE, 22);
        lbTitle.setFont(fTitle);
        lbTitle.setForeground(Color.decode("#24A645"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        logo.add(lbLogo, gbc);
        gbc.gridx = 1;
        logo.add(lbTitle, gbc);
        pnTitle.add(logo, BorderLayout.CENTER);
        pnWest.add(pnTitle, BorderLayout.NORTH);
        //vung menu
        JPanel pnMenu = new JPanel(new GridBagLayout());
        pnTongQuan = new JPanel(new GridBagLayout());
        pnTongQuan.setBackground(Color.decode("#424E59"));
        pnTongQuan.setPreferredSize(new Dimension((int) (westWidth * 1), 80));
        lbTQ = new JLabel("Tổng quan");
        Font fmenu = new Font("Monserrat", Font.ROMAN_BASELINE, 20);
        lbTQ.setFont(fmenu);
        lbTQ.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 0, 49);
        pnTongQuan.add(lbTQ, gbc);
        gbc.insets = new Insets(0, 0, 0, 0);

        pnQLNV = new JPanel(new GridBagLayout());
        pnQLNV.setBackground(Color.decode("#424E59"));
        pnQLNV.setPreferredSize(new Dimension((int) (westWidth * 1), 80));
        lbQLNV = new JLabel("Quản lý nhân viên");
        lbQLNV.setFont(fmenu);
        lbQLNV.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        pnQLNV.add(lbQLNV, gbc);

        pnQLKH = new JPanel(new GridBagLayout());
        pnQLKH.setBackground(Color.decode("#424E59"));
        pnQLKH.setPreferredSize(new Dimension((int) (westWidth * 1), 80));
        lbQLKH = new JLabel("Quản lý khách hàng");
        lbQLKH.setFont(fmenu);
        lbQLKH.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        pnQLKH.add(lbQLKH, gbc);

        pnQLSP = new JPanel(new GridBagLayout());
        pnQLSP.setBackground(Color.decode("#424E59"));
        pnQLSP.setPreferredSize(new Dimension((int) (westWidth * 1), 80));
        lbQLSP = new JLabel("Quản lý sản phẩm");
        lbQLSP.setFont(fmenu);
        lbQLSP.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        pnQLSP.add(lbQLSP, gbc);

        pnQLDH = new JPanel(new GridBagLayout());
        pnQLDH.setBackground(Color.decode("#424E59"));
        pnQLDH.setPreferredSize(new Dimension((int) (westWidth * 1), 80));
        lbQLDH = new JLabel("Quản lý đơn hàng");
        lbQLDH.setFont(fmenu);
        lbQLDH.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        pnQLDH.add(lbQLDH, gbc);

        pnTK = new JPanel(new GridBagLayout());
        pnTK.setBackground(Color.decode("#424E59"));
        pnTK.setPreferredSize(new Dimension((int) (westWidth * 1), 80));
        lbTK = new JLabel("Thống kê dữ liệu");
        lbTK.setFont(fmenu);
        lbTK.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        pnTK.add(lbTK, gbc);

        //icon
        JLabel jlbMN1 = new JLabel();
        ImageIcon logoMN1 = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Overview1.png");
        logoMN1 = new ImageIcon(logoMN1.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbMN1.setIcon(logoMN1);
        JLabel jlbMN2 = new JLabel();
        ImageIcon logoMN2 = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Staff1.png");
        logoMN2 = new ImageIcon(logoMN2.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbMN2.setIcon(logoMN2);
        JLabel jlbMN6 = new JLabel();
        ImageIcon logoMN6 = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Staff1.png");
        logoMN6 = new ImageIcon(logoMN6.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbMN6.setIcon(logoMN6);
        JLabel jlbMN3 = new JLabel();
        ImageIcon logoMN3 = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Product1.png");
        logoMN3 = new ImageIcon(logoMN3.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbMN3.setIcon(logoMN3);
        JLabel jlbMN4 = new JLabel();
        ImageIcon logoMN4 = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Order1.png");
        logoMN4 = new ImageIcon(logoMN4.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        jlbMN4.setIcon(logoMN4);
        JLabel jlbMN5 = new JLabel();
        ImageIcon logoMN5 = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\BTLthongke\\src\\Image\\Analyst1.png");
        logoMN5 = new ImageIcon(logoMN5.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        jlbMN5.setIcon(logoMN5);

        GridBagConstraints gbc1 = new GridBagConstraints();

        gbc1.gridx = 1;
        gbc1.gridy = 0;
        gbc1.ipadx = -5;
        gbc1.ipady = -5;
        gbc1.insets = new Insets(5, 0, 5, 0);

        pnMenu.add(pnTongQuan, gbc1);

        gbc1.gridx = 1;
        gbc1.gridy = 1;
        pnMenu.add(pnQLNV, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 2;
        pnMenu.add(pnQLKH, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 3;
        pnMenu.add(pnQLSP, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 4;
        pnMenu.add(pnQLDH, gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 5;
        pnMenu.add(pnTK, gbc1);

        //logo
        gbc.insets = new Insets(5, 0, 5, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        pnTongQuan.add(jlbMN1, gbc);
        pnQLNV.add(jlbMN2, gbc);
        pnQLKH.add(jlbMN6, gbc);
        pnQLSP.add(jlbMN3, gbc);
        pnQLDH.add(jlbMN4, gbc);
        pnTK.add(jlbMN5, gbc);
        pnMenu.setBackground(Color.decode("#424E59"));
        pnWest.add(pnMenu, BorderLayout.CENTER);
        //vung center
        pnCenter = new JPanel();
        pnCenter.setSize(1000, 0);

        pnBorder.add(pnWest, BorderLayout.WEST);
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        this.add(pnBorder);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainJFrame("QUAN LY SAN PHAM");
    }

}
