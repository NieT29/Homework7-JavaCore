public class StudenBiz extends StudentTechmaster {
    private double scoreMarketing;
    private double scoreSales;


    public StudenBiz(String name, String major, double scoreMarketing, double scoreSales) {
        super(name, major);
        this.scoreMarketing = scoreMarketing;
        this.scoreSales = scoreSales;
    }

    @Override
    public double getScore() {
        return (2*scoreMarketing + scoreSales)/3;
    }
}
