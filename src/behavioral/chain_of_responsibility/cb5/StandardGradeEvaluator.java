package behavioral.chain_of_responsibility.cb5;

public class StandardGradeEvaluator extends  GradeEvaluator{
    String gradeNew;
    double minScore;
    double maxScore;
    boolean isMaxInclusive;

    public StandardGradeEvaluator(String gradeNew, double minScore, double maxScore, boolean isMaxInclusive) {
        this.gradeNew = gradeNew;
        this.isMaxInclusive = isMaxInclusive;
        this.maxScore = maxScore;
        this.minScore = minScore;
    }

    @Override
    public void evaluate(double score) {
        boolean isMatch = isMaxInclusive ? (score >= minScore && score<=maxScore):(score>=minScore&&score<maxScore);
        if(isMatch){
            System.out.println("DIEM: "+score+"-->XEP LOAI: "+gradeNew);
        } else if (nextEvaluator!=null){
            nextEvaluator.evaluate(score);
        } else System.out.println("DIEM: "+score+"-->[ERROR] khong hop le!");
    }
}
