public class StudenIT extends StudentTechmaster{
    private double scoreJava;
    private double scoreHtml;
    private double scoreCss;

    public StudenIT(String name, String major, double scoreJava, double scoreHtml, double scoreCss) {
        super(name, major);
        this.scoreJava = scoreJava;
        this.scoreHtml = scoreHtml;
        this.scoreCss = scoreCss;
    }

    @Override
    public double getScore() {
        return (2*scoreJava + scoreHtml + scoreCss)/4;
    }
}
