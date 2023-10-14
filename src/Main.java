public class Main {
    public static void main(String[] args) {
        StudentTechmaster sinhvienIT = new StudenIT("Kiên", "Công Nghệ Thông Tin",8,9,8);
        StudentTechmaster sinhvienBiz = new StudenBiz("Phụng", "Marketing", 7, 8 );

        sinhvienIT.export();
        sinhvienBiz.export();
    }

}
