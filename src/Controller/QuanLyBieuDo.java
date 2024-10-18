package Controller;

import java.text.SimpleDateFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.jfree.chart.plot.PlotOrientation;
import ws.Donhang;
import ws.Khachhangmodel;
import ws.Sanpham;

public class QuanLyBieuDo {

    private static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);

    }

    public static ChartPanel createBarChartPanel(List<Khachhangmodel> dataList) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Tạo dataset từ danh sách dữ liệu
        for (Khachhangmodel item : dataList) {
            dataset.addValue(item.getSumKH(), "Khách hàng", item.getDiachiKH());
        }
        // Tạo biểu đồ cột
        JFreeChart barChart = ChartFactory.createBarChart(
                "Thống kê số lượng khách hàng".toUpperCase(),
                "Khu vực", "Số lượng khách hàng (người)", dataset);
        return new ChartPanel(barChart);
    }

//    public static ChartPanel createLineChartPanel(List<Khachhangmodel> dataList) {
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        if (dataList != null) {
//            for (Khachhangmodel item : dataList) {
//
//                dataset.addValue(item.getSumKH(), "Khách hàng", formatDate(item.getNgaythem().toGregorianCalendar(timezone, Locale.ITALY, defaults)));
//            }
//        }
//        JFreeChart lineGraph = ChartFactory.createLineChart(
//                "Thống kê số lượng khách hàng theo ngày".toUpperCase(),
//                "Ngày", "Số lượng khách hàng (người)", dataset, PlotOrientation.VERTICAL, false, true, false);
//        return new ChartPanel(lineGraph);
//    }

    public static ChartPanel createPieChartPanel(List<Khachhangmodel> dataList) {
        DefaultPieDataset dataset = new DefaultPieDataset();

//                    DefaultCategoryDataset dataset22 = new DefaultCategoryDataset();
        int sumLessThan18 = 0;
        int sumBetween18And24 = 0;
        int sumBetween24And30 = 0;
        int sumMoreThan30 = 0;
        if (dataList != null) {
            for (Khachhangmodel item : dataList) {
                if (item.getTuoi() < 18) {
                    sumLessThan18 += 1;
                } else if (item.getTuoi() < 24) {
                    sumBetween18And24 += 1;
                } else if (item.getTuoi() < 30) {
                    sumBetween24And30 += 1;
                } else {
                    sumMoreThan30 += 1;
                }
                dataset.setValue("<18", sumLessThan18);
                dataset.setValue("18-24", sumBetween18And24);
                dataset.setValue("24-30", sumBetween24And30);
                dataset.setValue(">30", sumMoreThan30);
//                            dataset22.addValue(item.get, kind, kind);
            }
        }
        JFreeChart pieChart = ChartFactory.createPieChart("Độ tuổi khách hàng", dataset);
        return new ChartPanel(pieChart);
    }

    //=============================================================SP
    public static ChartPanel createPieChartPanel1(List<Sanpham> dataList) {
        DefaultPieDataset dataset = new DefaultPieDataset();

        if (dataList != null) {
            for (Sanpham item : dataList) {
                dataset.setValue(item.getTensp(), item.getSoluong());
            }
        }
        JFreeChart pieChart = ChartFactory.createPieChart("Số lượng sản phẩm trong cửa hàng", dataset);
        return new ChartPanel(pieChart);
    }

    public static ChartPanel createBarChartPanel1(List<Sanpham> dataList) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Tạo dataset từ danh sách dữ liệu
        for (Sanpham item : dataList) {
            dataset.addValue(item.getSoluong(), "Số lượng", item.getLoaihang());
        }
        // Tạo biểu đồ cột
        JFreeChart barChart = ChartFactory.createBarChart(
                "Thống kê số lượng sản phẩm theo loại hàng".toUpperCase(),
                "Phân loại", "số lượng sản phẩm(Sản phẩm)", dataset);
        return new ChartPanel(barChart);
    }
    
    public static ChartPanel createLineChartPanel1(List<Sanpham> dataList) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (dataList != null) {
            for (Sanpham item : dataList) {

                dataset.addValue(item.getDoanhthu(), "Sản phẩm", item.getTensp());
            }
        }
        JFreeChart lineGraph = ChartFactory.createLineChart(
                "Thống kê doanh thu từng sản phẩm".toUpperCase(),
                "Sản phẩm", "Doanh thu", dataset, PlotOrientation.VERTICAL, false, true, false);
        return new ChartPanel(lineGraph);
    }
    //================================================================================DH
    public static ChartPanel createPieChartPanel2(List<Donhang> dataList) {
        DefaultPieDataset dataset = new DefaultPieDataset();

        int sumLessThan200 = 0;
        int sumBetween200And1M = 0;
        int sumBetween1MAnd5M = 0;
        int sumMoreThan5M = 0;
        if (dataList != null) {
            for (Donhang item : dataList) {
                if (item.getTongtien()< 200000) {
                    sumLessThan200 += 1;
                } else if (item.getTongtien() < 1000000) {
                    sumBetween200And1M += 1;
                } else if (item.getTongtien() < 5000000) {
                    sumBetween1MAnd5M += 1;
                } else {
                    sumMoreThan5M += 1;
                }
                dataset.setValue("<200K", sumLessThan200);
                dataset.setValue("200K-1M", sumBetween200And1M);
                dataset.setValue("1M-5M", sumBetween1MAnd5M);
                dataset.setValue(">5M", sumMoreThan5M);
//                            dataset22.addValue(item.get, kind, kind);
            }
        }
        JFreeChart pieChart2 = ChartFactory.createPieChart("Giá trị đơn hàng", dataset);
        return new ChartPanel(pieChart2);
    }
    public static ChartPanel createBarChartPanel2(List<Donhang> dataList) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Tạo dataset từ danh sách dữ liệu
        for (Donhang item : dataList) {
            dataset.addValue(item.getTongDH(), "Sản phẩm", (Comparable) item.getTime());
        }
        // Tạo biểu đồ cột
        JFreeChart barChart = ChartFactory.createBarChart(
                "Thống kê số lượng theo sản phẩm".toUpperCase(),
                "Thời gian", "Đơn hàng", dataset);
        return new ChartPanel(barChart);
    }
    public static ChartPanel createLineChartPanel2(List<Donhang> dataList) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (dataList != null) {
            for (Donhang item : dataList) {

                dataset.addValue(item.getDtn(), "Thời gian", (Comparable) item.getTime());
            }
        }
        JFreeChart lineGraph = ChartFactory.createLineChart(
                "Thống kê doanh thu đơn hàng theo ngày".toUpperCase(),
                "Doanh thu (VNĐ)", "Thời gian", dataset, PlotOrientation.VERTICAL, false, true, false);
        return new ChartPanel(lineGraph);
    }
}
