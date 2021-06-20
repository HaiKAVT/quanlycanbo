public class KySu extends CanBo{
    private String nganh;

    public KySu() {
    }

    public KySu(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String nganh) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    @Override
    public void hienThi(){
        System.out.println("Kỹ  Sư  {"  +
                " Ngành  " + nganh + "}");
    }
}
