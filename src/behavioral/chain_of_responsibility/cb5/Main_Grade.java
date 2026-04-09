package behavioral.chain_of_responsibility.cb5;

public class Main_Grade {
    static void main(String[] args) {
        GradeEvaluator weak = new StandardGradeEvaluator("Yeu",0,5,false);
        GradeEvaluator average = new StandardGradeEvaluator("Trung Binh",5,7,false);
        GradeEvaluator good = new StandardGradeEvaluator("Kha", 7,8,false);
        GradeEvaluator veryGood = new StandardGradeEvaluator("Gioi", 8,9,false);
        GradeEvaluator excellent = new StandardGradeEvaluator("Xuat Sac", 9,10,true);
        weak.setNextEvaluator(average).setNextEvaluator(good).setNextEvaluator(veryGood).setNextEvaluator(excellent);
        System.out.println("--HE THONG XEP LOAI HOC SINH--");
        double[] testScore={5,6,9,10,4.5,3.2};
        for (double score : testScore) {
            System.out.print("Diem: " + score + " -> ");
            weak.evaluate(score); // gọi từ thằng đầu chuỗi
        }
    }
}
