package Student_Info;

public class Student {

	private String id;//学号
	private String name;//姓名
	private String sex;//性别
	private int age;//年龄
	private String tel;//联系电话
	private String profession;//专业
	private String grade;//班级
	private String address;//地址

	// get set方法
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

	// 构造方法
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
