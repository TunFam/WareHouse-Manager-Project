/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DanhMucTQBean;
import view.TongQuanJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class TongQuanController {
    
    private JPanel Chart;
    private String kindSelected = "";
    private List<DanhMucTQBean> listDanhMucTQ = null;
    
    public void setDasdboard(JPanel jpnItem, JPanel jpnItem1, JLabel jlbItem1) {
        kindSelected = "DoanhThu";
        jpnItem.setBackground(Color.decode("#424E59"));
        jpnItem1.setBackground(Color.decode("#424E59"));
        jlbItem1.setBackground(Color.white);
        JPanel node = new JPanel();

    }
    TongQuanJPanel n= new TongQuanJPanel();
    
    public TongQuanController(TongQuanJPanel TongQuanJPanel) {
        this.n = TongQuanJPanel;
    }
    
    public TongQuanController(JPanel Chart) {
        this.Chart = Chart;
    }
    
    public TongQuanController() {
       java.util.List<DanhMucTQBean> listDanhMucTQ = new ArrayList<>();
        listDanhMucTQ.add(new DanhMucTQBean("DoanhThu", n.getSumRevavue(), n.getJpnTitleTQ1(), n.getJlbFigure1()));
        listDanhMucTQ.add(new DanhMucTQBean("SanPham", n.getSumProduct(), n.getJpnTitleTQ2(), n.getJlbFigure2()));
        listDanhMucTQ.add(new DanhMucTQBean("DonHang", n.getSumOrder(), n.getJpnTitleTQ3(), n.getJlbFigure3()));
        listDanhMucTQ.add(new DanhMucTQBean("KhachHang", n.getSumStaff(), n.getJpnTitleTQ4(), n.getJlbFigure4()));

        TongQuanController controller = new TongQuanController(n.getChart());
        
        controller.setDasdboard(n.getSumRevavue(), n.getJpnTitleTQ1(), n.getJlbFigure1());
        controller.setView(n.getSumRevavue(), n.getJpnTitleTQ1(), n.getJlbFigure1());
        
        controller.setDasdboard(n.getSumRevavue(), n.getJpnTitleTQ1(), n.getJlbFigure1());
        controller.setDasdboard(n.getSumProduct(), n.getJpnTitleTQ2(), n.getJlbFigure2());
        controller.setDasdboard(n.getSumOrder(), n.getJpnTitleTQ3(), n.getJlbFigure3());
        controller.setDasdboard(n.getSumStaff(), n.getJpnTitleTQ4(), n.getJlbFigure4());
        controller.setEvent(listDanhMucTQ);
        
        TongQuanController ctrl= new TongQuanController(n);
        ctrl.setFigureToDashBoard();
         
        
    }
     public void setEvent(List<DanhMucTQBean> listDanhMucTQ) {
        this.listDanhMucTQ = listDanhMucTQ;
        for (DanhMucTQBean item : listDanhMucTQ) {
            item.getJpn().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(), item.getJpn1(), item.getJlb()));
        }
    }

     public void setFigureToDashBoard(){
        
               n.updateSoLuongSanPham(doanhthu(), soluongDonHang(), soluongsanpham(), soluongkhachhang());
               
            }
    public void setView(JPanel jpnItem, JPanel jpnItem1, JLabel jlbItem1) {
        kindSelected = "DoanhThu";
        jpnItem.setBackground(Color.decode("#24A645"));
        jpnItem1.setBackground(Color.decode("#24A645"));

        Chart.removeAll();
        Chart.setLayout(new BorderLayout());
//        Chart.add();
        Chart.revalidate();
        Chart.repaint();
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JPanel jpnItem1;
        private JLabel jlbItem;

        public LabelEvent( String kind, JPanel jpnItem, JPanel jpnItem1, JLabel jlbItem) {
//            this.node = node;
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jpnItem1 = jpnItem1;
            this.jlbItem = jlbItem;
        }

        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "DoanhThu":
                    
                    break;
                case "SanPham":
                    
                    break;
                case "DonHang":
              
                    break;
                case "KhachHang":
                    
                    break;
                default:
                    break;
            }
            Chart.removeAll();
            Chart.setLayout(new BorderLayout());
//            Chart.add(node);
            Chart.validate();
            Chart.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
//            kindSelected = kind;
//            jpnItem.setBackground(Color.decode("#24A645"));
//            jpnItem1.setBackground(Color.decode("#24A645"));
//            jlbItem.setBackground(Color.white);

        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            if (!kindSelected.equalsIgnoreCase(kind)) {
//                jpnItem.setBackground(Color.decode("#24A645"));
//                jpnItem1.setBackground(Color.decode("#24A645"));
//                jlbItem.setBackground(Color.white);
//            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            kindSelected = kind;
//            jpnItem.setBackground(Color.decode("#424E59"));
//            jpnItem1.setBackground(Color.decode("#424E59"));
//            jlbItem.setBackground(Color.white);
        }

        @Override
        public void mouseExited(MouseEvent e) {
//            if (!kindSelected.equalsIgnoreCase(kind)) {
//                jpnItem.setBackground(Color.decode("#424E59"));
//                jpnItem1.setBackground(Color.decode("#424E59"));
//                jlbItem.setBackground(Color.white);
//            }else {
//                // Giữ màu nền của mục khi chuột rời khỏi mục đã chọn
//                jpnItem.setBackground(Color.decode("#24A645"));
//                jpnItem1.setBackground(Color.decode("#24A645"));
//                jlbItem.setBackground(Color.white);
//            }
        }
    }

    public void setChangeBackground(String kind) {
        for (DanhMucTQBean item : listDanhMucTQ) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(Color.decode("#24A645"));
                item.getJpn1().setBackground(Color.decode("#24A645"));
                item.getJlb().setBackground(Color.white);
            } else {
                item.getJlb().setBackground(Color.white);
                item.getJpn().setBackground(Color.decode("#424E59"));
                item.getJpn1().setBackground(Color.decode("#424E59"));
            }
        }
    }
     public JPanel getPanel() {
        return n;
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
