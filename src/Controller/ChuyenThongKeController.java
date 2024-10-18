package Controller;

import Model.DanhMucBean;
import view.ThongKeJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import ws.Donhang;
import ws.Khachhangmodel;
import ws.Sanpham;

/**
 *
 * @author DELL
 */
public class ChuyenThongKeController {

    public JPanel pnDB1;
    public JPanel pnDB2;
    public JPanel pnDB3;
    public String kindSelected = "";
    private List<DanhMucBean> listDanhMuc = null;
    ThongKeJPanel n = new ThongKeJPanel();


    public ChuyenThongKeController(ThongKeJPanel thongKeJPanel) {
        this.n = thongKeJPanel;
        setView(n.getpnKH(), n.getlbKH());
    }

    public ChuyenThongKeController() {
        List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("KH", n.getpnKH(), n.getlbKH()));
        listDanhMuc.add(new DanhMucBean("DH", n.getpnDH(), n.getlbDH()));
        listDanhMuc.add(new DanhMucBean("SP", n.getpnSP(), n.getlbSP()));

        ChuyenThongKeController controller = new ChuyenThongKeController(n.getdashboard1(), n.getdashboard2(), n.getdashboard3());
        controller.setDasdboard(n.getpnKH(), n.getlbKH());
        controller.setView(n.getpnKH(), n.getlbKH());

        controller.setEvent(listDanhMuc);

        ChuyenThongKeController ctrl = new ChuyenThongKeController(n);
        ctrl.setFigureToDashBoard();
//        n.action_timkiem(new timtkiem());
    }

    public void setDasdboard(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "KH";
        jpnItem.setBackground(Color.decode("#424E59"));
        jlbItem.setBackground(Color.white);
        JPanel node = new JPanel();

    }

    public ChuyenThongKeController(JPanel pnDB1, JPanel pnDB2, JPanel pnDB3) {
        this.pnDB1 = pnDB1;
        this.pnDB2 = pnDB2;
        this.pnDB3 = pnDB3;

    }

    public void setEvent(List<DanhMucBean> listDanhMuc) {
        this.listDanhMuc = listDanhMuc;
        for (DanhMucBean item : listDanhMuc) {
            item.getJpn().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {

        kindSelected = "KH";
        jpnItem.setBackground(Color.decode("#7B848C"));
        jlbItem.setBackground(Color.white);

//        Date finish = n.getDate2().getDate();
//        Date start = n.getDate1().getDate();
        List<Khachhangmodel> listItem12 = getListByKhachHang();
        if (pnDB3 != null) {
            pnDB3.removeAll();
            pnDB3.setLayout(new CardLayout());
            ChartPanel pieChart = QuanLyBieuDo.createPieChartPanel(listItem12);
            pnDB3.add(pieChart);
            pnDB3.validate();
            pnDB3.repaint();
        }

        List<Khachhangmodel> listItem11 = sumListByKhachHang();
        if (pnDB1 != null) {
            pnDB1.removeAll();
            pnDB1.setLayout(new CardLayout());
            ChartPanel barChart = QuanLyBieuDo.createBarChartPanel(listItem11);
            pnDB1.add(barChart);
            pnDB1.validate();
            pnDB1.repaint();
        }

//        List<Khachhangmodel> listItem13 = thongKeDAO.sumListByKhachHang1(start, finish);
//        if (pnDB1 != null) {
//            pnDB2.removeAll();
//            pnDB2.setLayout(new CardLayout());
//            ChartPanel lineGraph = QuanLyBieuDo.createLineChartPanel(listItem13);
//            pnDB2.add(lineGraph);
//            pnDB2.validate();
//            pnDB2.repaint();
//        }
    }

    public void setFigureToDashBoard() {
        int soLuongSanPham = soluongsanpham();
        int soLuongDonHang = soluongDonHang();
        double doanhThu = doanhthu();
        int dtdh = 0;
        int dtsp = 0;
        int slspdh = 0;
       
        dtdh = (int) doanhThu / soLuongDonHang;
        dtsp = slspdh / soLuongDonHang;
        n.updateSoLuongSanPham(doanhThu, soLuongSanPham, soLuongDonHang, dtdh, dtsp);
    }

    class LabelEvent implements MouseListener {

        Date finish = null;
        Date start = null;
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "KH":
                    List<Khachhangmodel> listItem12 = getListByKhachHang();
                    ChartPanel pieChart = QuanLyBieuDo.createPieChartPanel(listItem12);
                    pnDB3.removeAll();
                    pnDB3.setLayout(new CardLayout());
                    pnDB3.add(pieChart);
                    pnDB3.validate();
                    pnDB3.repaint();

                    List<Khachhangmodel> listItem1 = sumListByKhachHang();
                    ChartPanel barChart = QuanLyBieuDo.createBarChartPanel(listItem1);
                    pnDB1.removeAll();
                    pnDB1.setLayout(new CardLayout());
                    pnDB1.add(barChart);
                    pnDB1.validate();
                    pnDB1.repaint();

//                    List<Khachhangmodel> listItem11 = thongKeDAO.sumListByKhachHang1(start, finish);
//                    ChartPanel lineGraph = QuanLyBieuDo.createLineChartPanel(listItem11);
//                    pnDB2.removeAll();
//                    pnDB2.setLayout(new CardLayout());
//                    pnDB2.add(lineGraph);
//                    pnDB2.validate();
//                    pnDB2.repaint();
                    break;
                case "SP":
                    List<Sanpham> listItem2 = getListBySanPham();
                    ChartPanel pieChar1 = QuanLyBieuDo.createPieChartPanel1(listItem2);
                    pnDB3.removeAll();
                    pnDB3.setLayout(new CardLayout());
                    pnDB3.add(pieChar1);
                    pnDB3.validate();
                    pnDB3.repaint();

                    List<Sanpham> listItem21 = getListBySanPham();
                    ChartPanel barChart1 = QuanLyBieuDo.createBarChartPanel1(listItem21);
                    pnDB1.removeAll();
                    pnDB1.setLayout(new CardLayout());
                    pnDB1.add(barChart1);
                    pnDB1.validate();
                    pnDB1.repaint();

                    List<Sanpham> listItem22 = getListByDTSanPham();
                    ChartPanel lineGraph1 = QuanLyBieuDo.createLineChartPanel1(listItem22);
                    pnDB2.removeAll();
                    pnDB2.setLayout(new CardLayout());
                    pnDB2.add(lineGraph1);
                    pnDB2.validate();
                    pnDB2.repaint();
                    break;
                case "DH":
                    List<Donhang> listItem31 = getListByDonHang();
                    ChartPanel pieChar2 = QuanLyBieuDo.createPieChartPanel2(listItem31);
                    pnDB3.removeAll();
                    pnDB3.setLayout(new CardLayout());
                    pnDB3.add(pieChar2);
                    pnDB3.validate();
                    pnDB3.repaint();

                    List<Donhang> listItem32 = getListBySLDonHang();
                    ChartPanel barChart2 = QuanLyBieuDo.createBarChartPanel2(listItem32);
                    pnDB1.removeAll();
                    pnDB1.setLayout(new CardLayout());
                    pnDB1.add(barChart2);
                    pnDB1.validate();
                    pnDB1.repaint();

                    List<Donhang> listItem33 = getListByDTDonHang();
                    ChartPanel lineGraph2 = QuanLyBieuDo.createLineChartPanel2(listItem33);
                    pnDB2.removeAll();
                    pnDB2.setLayout(new CardLayout());
                    pnDB2.add(lineGraph2);
                    pnDB2.validate();
                    pnDB2.repaint();
                    break;

                default:
                    break;
            }
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(Color.decode("#7B848C"));
            jlbItem.setBackground(Color.white);

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(Color.decode("#424E59"));
                jlbItem.setBackground(Color.white);
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(Color.decode("#424E59"));
                jlbItem.setBackground(Color.white);
            } else {
                jpnItem.setBackground(Color.decode("#7B848C"));
                jlbItem.setBackground(Color.white);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(Color.decode("#424E59"));
                jlbItem.setBackground(Color.white);
            } else {
                // Giữ màu nền của mục khi chuột rời khỏi mục đã chọn
                jpnItem.setBackground(Color.decode("#7B848C"));
                jlbItem.setBackground(Color.white);
            }
        }

    }

    public void setChangeBackground(String kind) {
        for (DanhMucBean item : listDanhMuc) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(Color.decode("#7B848C"));
                item.getJlb().setBackground(Color.white);
            } else {
                item.getJlb().setBackground(Color.white);
                item.getJpn().setBackground(Color.decode("#424E59"));
            }
        }
    }

    class timtkiem implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            Date finish = n.getDate2().getDate();
//            Date start = n.getDate1().getDate();
//            ThongKeDAO tkd = new ThongKeDAO();
//            tkd.getListByDTDonHang(start, finish);
//            tkd.getListByDTSanPham(start, finish);
//            tkd.getListByDonHang(start, finish);
//            tkd.getListByKhachHang(start, finish);
//            tkd.getListBySLDonHang(start, finish);
//            tkd.getListBySanPham(start, finish);
//            tkd.sumListByKhachHang(start, finish);
//            tkd.sumListByKhachHang1(start, finish);
//            pnDB3.repaint();
//            pnDB2.repaint();
//            pnDB1.repaint();
        }
    }

    public JPanel getPanel() {
        return n;
    }

    private static java.util.List<ws.Donhang> getListByDTDonHang() {
        ws.Thongkeservice_Service service = new ws.Thongkeservice_Service();
        ws.Thongkeservice port = service.getThongkeservicePort();
        return port.getListByDTDonHang();
    }

    private static java.util.List<ws.Sanpham> getListByDTSanPham() {
        ws.Thongkeservice_Service service = new ws.Thongkeservice_Service();
        ws.Thongkeservice port = service.getThongkeservicePort();
        return port.getListByDTSanPham();
    }

    private static java.util.List<ws.Donhang> getListByDonHang() {
        ws.Thongkeservice_Service service = new ws.Thongkeservice_Service();
        ws.Thongkeservice port = service.getThongkeservicePort();
        return port.getListByDonHang();
    }

    private static java.util.List<ws.Khachhangmodel> getListByKhachHang() {
        ws.Thongkeservice_Service service = new ws.Thongkeservice_Service();
        ws.Thongkeservice port = service.getThongkeservicePort();
        return port.getListByKhachHang();
    }

    private static java.util.List<ws.Donhang> getListBySLDonHang() {
        ws.Thongkeservice_Service service = new ws.Thongkeservice_Service();
        ws.Thongkeservice port = service.getThongkeservicePort();
        return port.getListBySLDonHang();
    }

    private static java.util.List<ws.Sanpham> getListBySanPham() {
        ws.Thongkeservice_Service service = new ws.Thongkeservice_Service();
        ws.Thongkeservice port = service.getThongkeservicePort();
        return port.getListBySanPham();
    }

    private static java.util.List<ws.Khachhangmodel> sumListByKhachHang() {
        ws.Thongkeservice_Service service = new ws.Thongkeservice_Service();
        ws.Thongkeservice port = service.getThongkeservicePort();
        return port.sumListByKhachHang();
    }

    private static java.util.List<ws.Khachhangmodel> sumListByKhachHang1() {
        ws.Thongkeservice_Service service = new ws.Thongkeservice_Service();
        ws.Thongkeservice port = service.getThongkeservicePort();
        return port.sumListByKhachHang1();
    }

    private static double doanhthu() {
        ws.Tongquanservice_Service service = new ws.Tongquanservice_Service();
        ws.Tongquanservice port = service.getTongquanservicePort();
        return port.doanhthu();
    }

    private static int soluongDonHang() {
        ws.Tongquanservice_Service service = new ws.Tongquanservice_Service();
        ws.Tongquanservice port = service.getTongquanservicePort();
        return port.soluongDonHang();
    }

    private static int soluongkhachhang() {
        ws.Tongquanservice_Service service = new ws.Tongquanservice_Service();
        ws.Tongquanservice port = service.getTongquanservicePort();
        return port.soluongkhachhang();
    }

    private static int soluongsanpham() {
        ws.Tongquanservice_Service service = new ws.Tongquanservice_Service();
        ws.Tongquanservice port = service.getTongquanservicePort();
        return port.soluongsanpham();
    }
    

}
