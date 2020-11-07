package wangfei;

public class Doctor implements Xuesheng, Laoshi {
    private String name;
    private String gender;
    private int age;
    private float feePerTerm;
    private float salaryPerMonth;
    private float money = 0;

    public void statistics() {
        System.out.println(getName() + "\n" +
                "学期学费：" + getFeePerTerm() + "\n" +
                "学年学费：" + askTuition() + "\n" +
                "学生月薪水：" + getSalaryPerMonth() + "\n" +
                "学生年薪水：" + askSalary() + "\n" +
                "学生年收入：" + getMoney() + "\n" +
                "学生缴税：" + Tax.TaxManager.getTax(getMoney()));
    }
    public String toString() {
        return "DoctorStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", feePerTerm=" + feePerTerm +
                ", salaryPerMonth=" + salaryPerMonth +
                ", money=" + money +
                '}';
    }
    public Doctor(String name, String gender, int age, float feePerTerm, float salaryPerMonth) {
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
    public void purchaseTuition() {
        money -= feePerTerm;
    }
    public float askTuition() {
        return feePerTerm * 2;
    }
    public void getSalary() {
        money += salaryPerMonth;
    }
    public float askSalary() {
        return salaryPerMonth * 12;
    }
}