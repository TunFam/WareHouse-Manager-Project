/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



import Model.DanhMucBean;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class ChuyenManHinhController {

    private JPanel pnWest;
    private String kindSelected = "";

    private List<DanhMucBean> listDanhMuc = null;

    public void setDasdboard(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TongQuan";
        jpnItem.setBackground(Color.decode("#424E59"));
        jlbItem.setBackground(Color.white);
        JPanel node = new JPanel();

    }

    public ChuyenManHinhController(JPanel pnWest) {
        this.pnWest = pnWest;
    }

    public void setEvent(List<DanhMucBean> listDanhMuc) {
        this.listDanhMuc = listDanhMuc;
        for (DanhMucBean item : listDanhMuc) {
            item.getJpn().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TongQuan";
        jpnItem.setBackground(Color.decode("#7B848C"));
        jlbItem.setBackground(Color.white);
        TongQuanController TQ = new TongQuanController();
                  
        pnWest.removeAll();
        pnWest.setLayout(new BorderLayout());
        pnWest.add( TQ.getPanel());
        pnWest.revalidate();
        pnWest.repaint();
    }


    class LabelEvent implements MouseListener {

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
                case "TongQuan":
                    TongQuanController TQ = new TongQuanController();
                    node = TQ.getPanel();
                    break;
                case "ThongKe":
                    
                    ChuyenThongKeController tk= new ChuyenThongKeController();
                    node = tk.getPanel();
                    break;
                case "QLSP":
                    sanphamcontroller sp= new sanphamcontroller();
                    node = sp.getPanel();
                    break;
                case "QLNV":
                    nhanviencontroller nv= new nhanviencontroller();
                    node = nv.getPanel();
                    break;
                case "QLDH":
                    donhang_controller dh= new donhang_controller();
                    node = dh.getJpanel();
                    break;
                case "QLKH":
                    khachhangcontroller kh= new khachhangcontroller();
                    node = kh.getPanel();
                    break;
                default:
                    break;
            }
            pnWest.removeAll();
            pnWest.setLayout(new BorderLayout());
            pnWest.add(node);
            pnWest.validate();
            pnWest.repaint();
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
            }else {
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
}
