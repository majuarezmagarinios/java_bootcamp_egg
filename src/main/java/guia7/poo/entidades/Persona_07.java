package guia6.entidades;

public class Persona_07 {
	private String name;
	private int age;
	private String sex;
	private float weight;
	private float height;

	public Persona_07(String name, int age, String sex, float weight, float height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
	}

	public Persona_07() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", age=" + age + ", sex=" + sex + ", weight=" + weight + ", height=" + height
				+ "]";
	}

}
