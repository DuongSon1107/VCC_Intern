package JsonPractice;

public class NhanVien {
    private static String name;
    private static int salary;
    public NhanVien(String name, int salary, boolean isTall) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
