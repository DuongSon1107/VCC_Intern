package Serialize;

import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Son",1);
        File file = new File("src/Serialize/student.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Student student1 = (Student) inputStream.readObject();
        System.out.println(student1.getId());
        System.out.println(student1.getName());
    }
}
