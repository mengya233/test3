package jiekou;

public class Main {
    public static void main(String[] args) {

        float feePerTerm = 2300;
        float salaryPerMonth = 4000;

        Boshisheng[] stu = new Boshisheng[2];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("[i] ��ʼ��ѧ��" + i);
            stu[i] = new Boshisheng(
                    Gongju.inputString("ѧ������:"),
                    Gongju.select("ѡ���Ա�", new String[]{"��", "Ů"}),
                    Gongju.inputInt("ѧ������", 0, 100),
                    feePerTerm, salaryPerMonth
            );
            System.out.println(stu[i]);
        }

        for (int i = 0; i < stu.length; i++) {

            // һ����ѧ��
            for (int j = 0; j < 2; j++) {
                stu[i].purchaseTuition();
            }

            // һ��ʮ������
            for (int j = 0; j < 12; j++) {
                stu[i].getSalary();

            }

            stu[i].statistics();
            System.out.println();
        }
    }
}