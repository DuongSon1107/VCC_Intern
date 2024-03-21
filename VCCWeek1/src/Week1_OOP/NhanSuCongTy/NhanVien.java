package Week1_OOP.NhanSuCongTy;
public class NhanVien implements Info {
    private String Name;
    private static int Age;
    private String Birthday;
    protected static int Salary;
    protected int DayOnWork;
    protected String Position;
    protected final int defaultSalaryunit = 1000000;

    public NhanVien(String name, int age, int salary, String birthday , int dayOnWork , String position) {
        this.Name = name;
        this.Age = age;
        this.Salary = salary;
        this.Birthday = birthday;
        this.DayOnWork = dayOnWork;
        this.Position = position;
    }

    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public String getBirthday(){
        return Birthday;
    }

    public int getSalary() {
        return Salary;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public void setDayOnWork(int dayOnWork) {
        DayOnWork = dayOnWork;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int tinhluong() {
        int heSo = 1;
        int Salary = DayOnWork * defaultSalaryunit * heSo ;
        return Salary;
    }
    public int getDayOnWork() {
        return DayOnWork;
    }

    public String getPosition() {
        return Position;
    }

    public void inTTin() {
        if (DayOnWork > 31) {
            System.out.println("So ngay di lam khong hop le.");
        } else {
            System.out.println("Ten nhan vien: " + getName());
            System.out.println("Tuoi nhan vien: " + getAge());
            System.out.println("Ngay Sinh: " + getBirthday());
            System.out.println("Luong nhan vien thang nay la : " + tinhluong() + " VND");
            System.out.println("So ngay di lam trong thang : " + getDayOnWork());
            System.out.println("Chuc vu : " + getPosition());
            System.out.printf("\n");
        }
    }

    public void Show(){
        System.out.println("Toi la nhan vien cong ty XYZ");
    }
}
