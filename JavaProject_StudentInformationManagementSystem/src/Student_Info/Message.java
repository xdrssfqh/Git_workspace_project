package Student_Info;

import java.util.ArrayList;
import java.util.Scanner;

public class Message {

    public static void main(String[] args) throws Exception {

        // 创建集合对象
        ArrayList<Student> al = new ArrayList<Student>();

        // 学生管理信息系统
        while (true) {
            System.out.println("----------------学生管理系统----------------");
            System.out.println("请输入对应数字进行操作");
            System.out.print("1.添加学生信息");
            System.out.print("2.删除学生信息");
            System.out.print("3.修改学生信息");
            System.out.print("4.查询学生信息");
            System.out.println("5.退出系统");
            System.out.println("-------------------------------------------");

            // 输入选择
            Scanner sc = new Scanner(System.in);
            String type = sc.next();
            switch (type) {
                case "1":
                    // 添加学生信息
                    addStudent(al);
                    break;
                case "2":
                    // 删除学生信息
                    delStudent(al);
                    break;

                case "3":
                    // 修改学生信息
                    resetStudent(al);
                    break;

                case "4":
                    // 查询学生信息
                    showStudent(al);
                    break;

                case "5":
                    // 退出系统
                    System.out.println("成功退出系统");
                    System.exit(0);
                    break;
            }
        }

    }

    // 查询学生信息
    private static void showStudent(ArrayList<Student> al) {
        if (al.size() == 0) {
            System.out.println("暂无信息！请先添加！");
            return;
        }
        System.out.println("学号\t\t" + "姓名\t\t" + "性别\t\t" + "年龄\t\t" + "联系电话\t\t" + "专业\t\t" + "班级\t\t" + "地址\t\t");
        for (Student stu : al) {
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getSex() + "\t\t" + stu.getAge()
                    + "\t\t" + stu.getTel() + "\t\t" + stu.getProfession() + "\t\t" + stu.getGrade() + "\t\t"
                    + stu.getAddress());
        }
        System.out.println();
        System.out.println("列表里所有学生信息已列出，共有  " + al.size() + "  条学生信息。");
        System.out.println();
    }

    // 修改学生信息
    private static void resetStudent(ArrayList<Student> al) {
        if (al.size() == 0) {
            System.out.println("暂无信息！请先添加！");
            return;
        }
        System.out.println("请输入要修改的学生的学号");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入性别");
        String sex = sc.next();
        if (!(sex.equals("男") || sex.equals("女"))) {
            System.out.println("你输入的性别有误");
            return;
        }

        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        if (age < 0 || age > 100) {
            System.out.println("你输入的年龄不在正常范围内");
            return;
        }

        System.out.println("请输入联系电话：");
        String tel = sc.next();
        if (tel.length() != 11) {
            System.out.println("您输入的手机号位数有误，应为11位，请检查后出现输入！");
            return;
        }

        System.out.println("请输入专业");
        String profession = sc.next();
        System.out.println("请输入班级");
        String grade = sc.next();
        System.out.println("请输入地址：");
        String address = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setSex(sex);
        stu.setAge(age);
        stu.setTel(tel);
        stu.setProfession(profession);
        stu.setGrade(grade);
        stu.setAddress(address);

        // 找到要修改的学生
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getId().equals(id)) {
                al.set(i, stu);
                break;
            }
        }

        System.out.println("修改成功");
        System.out.println(al.size());
        System.out.println();
    }

    // 删除学生信息
    private static void delStudent(ArrayList<Student> al) {
        System.out.println("请输入要删除的学号：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if (al.size() == 0) {
            System.out.println("暂无信息！请先添加！");
            return;
        }

        // 循环来寻找那个要删除的学生
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getId().equals(id)) {
                al.remove(i);
                break;
            }
        }
        System.out.println(al.size());
        System.out.println("删除成功");
        System.out.println();

    }

    // 添加学生信息
    private static void addStudent(ArrayList<Student> al) {
        // 从键盘输入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String id = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();

        System.out.println("请输入性别");
        String sex = sc.next();
        if (!(sex.equals("男") || sex.equals("女"))) {
            System.out.println("你输入的性别有误");
            return;
        }

        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        if (age < 0 || age > 100) {
            System.out.println("你输入的年龄不在正常范围内");
            return;
        }

        System.out.println("请输入联系电话：");
        String tel = sc.next();
        if (tel.length() != 11) {
            System.out.println("您输入的手机号位数有误，应为11位！");
            return;
        }

        System.out.println("请输入专业");
        String profession = sc.next();
        System.out.println("请输入班级");
        String grade = sc.next();
        System.out.println("请输入地址：");
        String address = sc.next();

        // 创建学生对象
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setSex(sex);
        stu.setAge(age);
        stu.setTel(tel);
        stu.setProfession(profession);
        stu.setGrade(grade);
        stu.setAddress(address);
        // 添加到集合
        al.add(stu);
        System.out.println("添加成功");
        System.out.println(al.size());
        System.out.println();
    }

    private static int setAge() {

        return 0;
    }

}
