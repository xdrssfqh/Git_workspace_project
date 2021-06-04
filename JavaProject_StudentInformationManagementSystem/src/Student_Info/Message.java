package Student_Info;

import java.util.ArrayList;
import java.util.Scanner;

public class Message {

    public static void main(String[] args) throws Exception {

        // �������϶���
        ArrayList<Student> al = new ArrayList<Student>();

        // ѧ��������Ϣϵͳ
        while (true) {
            System.out.println("----------------ѧ������ϵͳ----------------");
            System.out.println("�������Ӧ���ֽ��в���");
            System.out.print("1.���ѧ����Ϣ");
            System.out.print("2.ɾ��ѧ����Ϣ");
            System.out.print("3.�޸�ѧ����Ϣ");
            System.out.print("4.��ѯѧ����Ϣ");
            System.out.println("5.�˳�ϵͳ");
            System.out.println("-------------------------------------------");

            // ����ѡ��
            Scanner sc = new Scanner(System.in);
            String type = sc.next();
            switch (type) {
                case "1":
                    // ���ѧ����Ϣ
                    addStudent(al);
                    break;
                case "2":
                    // ɾ��ѧ����Ϣ
                    delStudent(al);
                    break;

                case "3":
                    // �޸�ѧ����Ϣ
                    resetStudent(al);
                    break;

                case "4":
                    // ��ѯѧ����Ϣ
                    showStudent(al);
                    break;

                case "5":
                    // �˳�ϵͳ
                    System.out.println("�ɹ��˳�ϵͳ");
                    System.exit(0);
                    break;
            }
        }

    }

    // ��ѯѧ����Ϣ
    private static void showStudent(ArrayList<Student> al) {
        if (al.size() == 0) {
            System.out.println("������Ϣ��������ӣ�");
            return;
        }
        System.out.println("ѧ��\t\t" + "����\t\t" + "�Ա�\t\t" + "����\t\t" + "��ϵ�绰\t\t" + "רҵ\t\t" + "�༶\t\t" + "��ַ\t\t");
        for (Student stu : al) {
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getSex() + "\t\t" + stu.getAge()
                    + "\t\t" + stu.getTel() + "\t\t" + stu.getProfession() + "\t\t" + stu.getGrade() + "\t\t"
                    + stu.getAddress());
        }
        System.out.println();
        System.out.println("�б�������ѧ����Ϣ���г�������  " + al.size() + "  ��ѧ����Ϣ��");
        System.out.println();
    }

    // �޸�ѧ����Ϣ
    private static void resetStudent(ArrayList<Student> al) {
        if (al.size() == 0) {
            System.out.println("������Ϣ��������ӣ�");
            return;
        }
        System.out.println("������Ҫ�޸ĵ�ѧ����ѧ��");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println("������������");
        String name = sc.next();
        System.out.println("�������Ա�");
        String sex = sc.next();
        if (!(sex.equals("��") || sex.equals("Ů"))) {
            System.out.println("��������Ա�����");
            return;
        }

        System.out.println("���������䣺");
        int age = sc.nextInt();
        if (age < 0 || age > 100) {
            System.out.println("����������䲻��������Χ��");
            return;
        }

        System.out.println("��������ϵ�绰��");
        String tel = sc.next();
        if (tel.length() != 11) {
            System.out.println("��������ֻ���λ������ӦΪ11λ�������������룡");
            return;
        }

        System.out.println("������רҵ");
        String profession = sc.next();
        System.out.println("������༶");
        String grade = sc.next();
        System.out.println("�������ַ��");
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

        // �ҵ�Ҫ�޸ĵ�ѧ��
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getId().equals(id)) {
                al.set(i, stu);
                break;
            }
        }

        System.out.println("�޸ĳɹ�");
        System.out.println(al.size());
        System.out.println();
    }

    // ɾ��ѧ����Ϣ
    private static void delStudent(ArrayList<Student> al) {
        System.out.println("������Ҫɾ����ѧ�ţ�");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if (al.size() == 0) {
            System.out.println("������Ϣ��������ӣ�");
            return;
        }

        // ѭ����Ѱ���Ǹ�Ҫɾ����ѧ��
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getId().equals(id)) {
                al.remove(i);
                break;
            }
        }
        System.out.println(al.size());
        System.out.println("ɾ���ɹ�");
        System.out.println();

    }

    // ���ѧ����Ϣ
    private static void addStudent(ArrayList<Student> al) {
        // �Ӽ�������ѧ����Ϣ
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ�ţ�");
        String id = sc.next();
        System.out.println("������������");
        String name = sc.next();

        System.out.println("�������Ա�");
        String sex = sc.next();
        if (!(sex.equals("��") || sex.equals("Ů"))) {
            System.out.println("��������Ա�����");
            return;
        }

        System.out.println("���������䣺");
        int age = sc.nextInt();
        if (age < 0 || age > 100) {
            System.out.println("����������䲻��������Χ��");
            return;
        }

        System.out.println("��������ϵ�绰��");
        String tel = sc.next();
        if (tel.length() != 11) {
            System.out.println("��������ֻ���λ������ӦΪ11λ��");
            return;
        }

        System.out.println("������רҵ");
        String profession = sc.next();
        System.out.println("������༶");
        String grade = sc.next();
        System.out.println("�������ַ��");
        String address = sc.next();

        // ����ѧ������
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setSex(sex);
        stu.setAge(age);
        stu.setTel(tel);
        stu.setProfession(profession);
        stu.setGrade(grade);
        stu.setAddress(address);
        // ��ӵ�����
        al.add(stu);
        System.out.println("��ӳɹ�");
        System.out.println(al.size());
        System.out.println();
    }

    private static int setAge() {

        return 0;
    }

}
