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
        System.out.println("学生：" + getName() + "\n" +
                "每学期学费：" + getFeePerTerm() + "\n" +
                "每学年学费：" + queryTuition() + "\n" +
                "每月薪水：" + getSalaryPerMonth() + "\n" +
                "每年薪水：" + querySalary() + "\n" +
                "年收入：" + getMoney() + "\n" +
                "需交税额：" + Shuiwu.getTax(getMoney()));
    }

    @Override
    public String toString() {
        return "DoctorStudent{" +
                "姓名='" + name + '\'' +
                ", 性别='" + gender + '\'' +
                ", 年龄=" + age +
                ", 学费=" + feePerTerm +
                ", 月薪=" + salaryPerMonth +
                ", 钱=" + money +
                '}';
    }
}