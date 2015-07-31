package cn.net.vive.over;

/**
 * <p>
 *
 * @author bolen
 * @date 2015/6/13
 * @since 0.1
 */
public class Son {


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

	private String name;
	private int age ;

	public String getNames(){
		return "son";
	}

	public Son(){

	}

	public Son(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
