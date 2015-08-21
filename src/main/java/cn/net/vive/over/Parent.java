package main.java.cn.net.vive.over;

/**
 * <p>
 *
 * @author bolen
 * @date 2015/6/13
 * @since 0.1
 */
public class Parent extends Son {


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String address;

	@Override
	public String getNames(){
		return  "parent";
	}

	public Parent() {

	}

	public Parent(String name, int age) {
		super(name, age);
	}

	public Parent(String name, int age,String address) {
		super(name, age);
		this.address = address;
	}


}
