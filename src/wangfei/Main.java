package wangfei;

public class Main {
    public static void main(String[] args) {
        float feePerTerm = 2300;
        float salaryPerMonth = 4000;
        Doctor[] stu = new Doctor[2];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("====");
            stu[i] = new Doctor(
                    Chuli.inputString("����:"),
                    Chuli.select("�Ա�", new String[]{"��", "Ů"}),
                    Chuli.inputInt("����", 0, 100),
                    feePerTerm, salaryPerMonth
            );
        }
        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < 2; j++) {
                stu[i].purchaseTuition();
            }
            for (int j = 0; j < 12; j++) {
                stu[i].getSalary();
            }
            stu[i].statistics();
            System.out.println();
        }
    }
}
