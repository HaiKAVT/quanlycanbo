import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản Lý Cán Bộ ");
            System.out.println("1. Thêm Cán Bộ ");
            System.out.println("2. Tìm kiếm cán bộ theo tên : ");
            System.out.println("3. Tim cán bộ theo ngành : ");
            System.out.println("4. Sửa Cán bộ ");
            System.out.println("5. Xóa Nhân Viên ");
            System.out.println("6. Sắp xếp cán bộ ");
            System.out.println("7. hiện thị cán bộ ");
            System.out.println("8. Thoát");
            System.out.print("xin mời nhập lựa chọn : ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    quanLyCanBo.themCanBo();
                    break;
                case 2:
                    quanLyCanBo.timCanBo();
                    break;
                case 3:
                    quanLyCanBo.timKiemNganh();
                    break;
                case 4:
                    quanLyCanBo.suaCanBo();
                    break;
                case 5:
                    quanLyCanBo.xoaNhaVien();
                    break;
                case 6:
                    quanLyCanBo.sapXepCanBo();
                    break;
                case 7:
                    quanLyCanBo.hienThiCanBo();
                    break;
                case 8:
                    System.exit(0);

            }
        }
    }
}
