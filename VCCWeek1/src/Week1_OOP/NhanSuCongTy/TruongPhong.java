package Week1_OOP.NhanSuCongTy;

public  class TruongPhong extends NhanVien implements Info{
    public TruongPhong(String name, int age, int salary, String birthday, int dayOnWork, String position) {
        super(name, age, salary, birthday, dayOnWork, position);
    }


    public String getPosition() {
        Position = "Truong Phong";
        return Position;
    }
    @Override
    public int tinhluong() {
        int heSo = 2;
        Salary = DayOnWork * defaultSalaryunit * heSo;
        return Salary;
    }
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getDayOnWork() {
        return super.getDayOnWork();
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setBirthday(String birthday) {
        super.setBirthday(birthday);
    }

    @Override
    public void setDayOnWork(int dayOnWork) {
        super.setDayOnWork(dayOnWork);
    }

    @Override
    public void setPosition(String position) {
        super.setPosition(position);
    }
    public void inTTin() {
        if (DayOnWork > 31) {
            System.out.println("So ngay di lam khong hop le.");
        } else {
            System.out.println("Ten : " + getName());
            System.out.println("Tuoi : " + getAge());
            System.out.println("Ngay Sinh: " + getBirthday());
            System.out.println("Chuc vu :" + getPosition());
            System.out.println("Luong truong phong thang nay la : " + tinhluong() + " VND");
            System.out.println("So ngay di lam trong thang : " + getDayOnWork());
            System.out.printf("\n");
        }
    }
}