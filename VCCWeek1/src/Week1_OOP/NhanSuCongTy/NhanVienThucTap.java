package Week1_OOP.NhanSuCongTy;

public class NhanVienThucTap extends NhanVien implements Info {
    protected String TypeWork;

    public NhanVienThucTap(String name, int age, String birthday, int dayOnWork, String position, String typeWork) {
        super(name, age, 0, birthday, dayOnWork, position);
        this.TypeWork = typeWork;
    }

    public int getAge() {
        return getAge();
    }

    public int getDayOnWork() {
        return getDayOnWork();
    }


    public String getBirthday() {
        return getBirthday();
    }


    public String getName() {
        return getName();
    }


    public String getPosition() {
        return "Thuc tap sinh";
    }

    public String getTypeWork() {
        return TypeWork;
    }


    public void setName(String name) {
        setName(name);
    }

    public void setTypeWork(String typeWork) {
        TypeWork = typeWork;
    }


    public void setBirthday(String birthday) {
        setBirthday(birthday);
    }


    public void setDayOnWork(int dayOnWork) {
        setDayOnWork(dayOnWork);
    }


    public void setPosition(String position) {
        setPosition(position);
    }


    public void inTTin() {
        if (DayOnWork > 31) {
            System.out.println("So ngay di lam khong hop le.");
        } else {
            System.out.println("Ten nhan vien: " + getName());
            System.out.println("Tuoi nhan vien: " + getAge());
            System.out.println("Ngay Sinh: " + getBirthday());
            System.out.println("So ngay di lam trong thang " + getDayOnWork());
            System.out.println("Chuc vu : " + getPosition());
            System.out.println("Loai Thuc Tap: " + getTypeWork());
//abc
        }
    }
}