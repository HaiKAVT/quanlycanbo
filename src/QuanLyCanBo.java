import javax.xml.soap.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class  quanLyCanBo {
   static Scanner scanner = new Scanner(System.in);
   static ArrayList<CanBo> list = new ArrayList<>();
   static NameComparator comparator = new NameComparator();
   static String hoTen;
   static String namSinh;
   static String gioiTinh;
   static String diaChi;
   static String bac;
   static String nganh;

    public static void themCanBo() {
     while (true) {
         System.out.println("1. Thêm Nhân Viên");
         System.out.println("2. Thêm Công Nhân");
         System.out.println("3. Thêm Kỹ Sư ");
         System.out.println("4. Thoát ");
         System.out.println("Nhập lựa chọn của bạn để thêm: ");
         int choice = Integer.parseInt(scanner.nextLine());

         if(choice==4){
             return;
         }
         switch (choice) {
             case 1:
                 themNhanVien();
                 break;
             case 2:
                 themCongNhan();
                 break;
             case 3:
                 themKySu();
                 break;
         }

     }
    }
    public static void themThongTin(){
        System.out.println("Nhập tên  thêm: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh  ");
        String namSinh = scanner.nextLine();
        System.out.println("Nhập giới tính  ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ ");
       scanner.nextLine();
    }
    public static   void  themCongNhan(){
        themThongTin();
        System.out.println("Nhập bậc: ");
        String bac = scanner.nextLine();
        System.out.println("nhập ngành: ");
        String nganh = scanner.nextLine();

        list.add(new CongNhan(hoTen, namSinh, gioiTinh, diaChi, bac, nganh ));

    }
    public  static  void themKySu(){
        themThongTin();
        System.out.println("nhập ngành: ");
        String nganh = scanner.nextLine();
        list.add(new KySu(hoTen, namSinh, gioiTinh, diaChi, nganh));
    }
    public  static  void  themNhanVien(){
        themThongTin();
        list.add(new NhanVien(hoTen, namSinh, gioiTinh, diaChi));
    }
    public static void timCanBo(){
        System.out.println("Nhập tên để tìm: ");
        String hoTen = scanner.nextLine();
        int index = list.indexOf(hoTen);
        if(index < 0){
            System.out.println("ko tìm thấy ");
        } else {
            System.out.println(list.get(index));
        }
    }
    public static void xoaNhaVien(){
        System.out.println("nhập tên nhân viên cần xóa: ");
        String hoTen = scanner.nextLine();
        for (CanBo nhanVien: list) {
            if(nhanVien instanceof NhanVien && nhanVien.getHoTen().equals(hoTen)){
                list.remove(nhanVien);
            }
        }
    }
    public static  void suaCanBo(){
        System.out.println("nhập tên cần sửa: ");
        String hoTenCu = scanner.nextLine();
        System.out.println("nhập thông tin mới ");
        themThongTin();
        NhanVien nhanVien = new NhanVien(hoTen, namSinh, gioiTinh, diaChi);
        int index = list.indexOf(hoTenCu);
        list.set(index,nhanVien);
    }
    public  static  void hienThiCanBo(){
        for (CanBo e: list) {
            e.hienThi();
        }
    }
    public  static  void  sapXepCanBo(){
        list.sort(comparator);
    }
    public static void timKiemNganh(){
        System.out.println("nhập ngành : ");
        String nganh = scanner.nextLine();
        for (CanBo c :list) {
            if(c instanceof CongNhan){
                if(((CongNhan) c).getNganh().equals(nganh)){
                    c.hienThi();
                }
            } else if (c instanceof  KySu){
                if(((KySu) c).getNganh().equals(nganh)){
                    c.hienThi();
                }
            }
        }
    }
}
