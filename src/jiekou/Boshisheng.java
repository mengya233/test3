package jiekou;

public class Boshisheng implements Student, Teacher {
    private String name;
    private String gender;
    private int age;
    private float feePerTerm;
    private float salaryPerMonth;
    private float money = 0;

    public Boshisheng(String name, String gender, int age, float feePerTerm, float salaryPerMonth) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.feePerTerm = feePerTerm;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getFeePerTerm() {
        return feePerTerm;
    }

    public void setFeePerTerm(float feePerTerm) {
        this.feePerTerm = feePerTerm;
    }

    public float getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(float salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public void purchaseTuition() {
        money -= feePerTerm;
    }

    @Override
    public float queryTuition() {
        return feePerTerm * 2;
    }

    @Override
    public void getSalary() {
        money += salaryPerMonth;
    }

    @Override
    public float querySalary() {
        return salaryPerMonth * 12;
    }

    public void statistics() {
        System.out.println("ѧ����" + getName() + "\n" +
                "ÿѧ��ѧ�ѣ�" + getFeePerTerm() + "\n" +
                "ÿѧ��ѧ�ѣ�" + queryTuition() + "\n" +
                "ÿ��нˮ��" + getSalaryPerMonth() + "\n" +
                "ÿ��нˮ��" + querySalary() + "\n" +
                "�����룺" + getMoney() + "\n" +
                "�轻˰�" + Shuiwu.getTax(getMoney()));
    }

    @Override
    public String toString() {
        return "DoctorStudent{" +
                "����='" + name + '\'' +
                ", �Ա�='" + gender + '\'' +
                ", ����=" + age +
                ", ѧ��=" + feePerTerm +
                ", ��н=" + salaryPerMonth +
                ", Ǯ=" + money +
                '}';
    }
}