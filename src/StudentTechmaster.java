public abstract class StudentTechmaster {
    private String name;
    private String major;

    public StudentTechmaster(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract double getScore();
    public  String getClassification() {
        if (getScore()<5) {
            return "Yếu";
        } else if (getScore() >= 5 && getScore() < 6.5) {
            return "Trung Bình";
        } else if (getScore() >= 6.5 && getScore() < 8) {
            return "Khá";
        } else return "Giỏi";
    }

    public void export() {
        System.out.println("Sinh viên: "+name+" - Chuyên ngành: "+ major+" - Điểm: "+getScore()+" - Xếp loại: "+getClassification());
    }

}
