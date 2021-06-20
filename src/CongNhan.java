public class CongNhan extends CanBo{
    private String bac;
    private String nganh;

    public CongNhan() {
    }

    public CongNhan(String bac, String nganh) {
        this.bac = bac;
        this.nganh = nganh;
    }

    public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, String bac, String nganh) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
        this.nganh = nganh;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    @Override
    public void hienThi(){
        System.out.println("Công nhân {" + " Bậc " + bac +
                " Ngành  " + nganh + "}");
    }
}
