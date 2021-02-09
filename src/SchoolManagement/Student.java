package SchoolManagement;

public class Student {
    private String name;
    private int id;
    private int grade;
    private int feesTotal;
    private int feesPaid;

    public Student( int id, String name, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.feesPaid=0;
        this.feesTotal= 30000;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesArrears(){
        return (feesTotal-feesPaid);
    }

    public void nextGrade(int grade) {
        this.grade = grade;
        this.feesTotal+=30000;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal -= feesTotal;
    }

    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateFeesPaid(fees);
    }
}
