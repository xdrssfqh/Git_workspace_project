package Student_Info;

public class Student {

	private String id;//ѧ��
	private String name;//����
	private String sex;//�Ա�
	private int age;//����
	private String tel;//��ϵ�绰
	private String profession;//רҵ
	private String grade;//�༶
	private String address;//��ַ

	// get set����
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
			this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
			this.age = age;	
	}

	public String getTel() {
		
		return tel;
	}

	public void setTel(String tel) {
			this.tel = tel;
		
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// ���췽��
	public Student(String id, String name, String sex, int age, String tel, String profession, String grade,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.profession = profession;
		this.grade = grade;
		this.address = address;
	}

	public Student() {
		super();

	}

}
