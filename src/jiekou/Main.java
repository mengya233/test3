package jiekou;

public class Main {
    public static void main(String[] args) {

        float feePerTerm = 2300;
        float salaryPerMonth = 4000;

        Boshisheng[] stu = new Boshisheng[2];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("[i] 初始化学生" + i);
            stu[i] = new Boshisheng(
                    Gongju.inputString("学生姓名:"),
                    Gongju.select("选择性别", new String[]{"男", "女"}),
                    Gongju.inputInt("学生年龄", 0, 100),
                    feePerTerm, salaryPerMonth
            );
            System.out.println(stu[i]);
        }

        for (int i = 0; i < stu.length; i++) {

            // 一年两学期
            for (int j = 0; j < 2; j++) {
                stu[i].purchaseTuition();
            }

            // 一年十二个月
            for (int j = 0; j < 12; j++) {
                stu[i].getSalary();

            }

            stu[i].statistics();
            System.out.println();
        }
    }
}