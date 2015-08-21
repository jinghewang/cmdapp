package main.java.cn.net.vive.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * @author bolen
 * @date 2015/6/14
 * @since 0.1
 */
public class Fruit<T> {

	public static int price;

	//public T t = new T();

	public T getFruit() {
		return fruit;
	}

	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

	private T fruit;


	public List<T> getFruits() {
		return fruits;
	}

	public void setFruits(List<? extends T> fruits) {
		this.fruits = (List<T>)fruits;
	}

	public void setFruits2(List<T> lst){
		fruits = lst;
	}

	List<T> fruits ;

	public Fruit() {
		this.fruits = new ArrayList<>();
		T fruit = null;
	}
}
