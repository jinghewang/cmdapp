package main.java.cn.net.vive.ps;

/**
 * <p>
 *
 * @author bolen
 * @date 2015/6/14
 * @since 0.1
 */
public class S<T> extends P<T> {

	public void sayHello(T[] msgs) {
		for (T msg : msgs) {
			System.out.println(msg.toString());
		}
	}

	public T getParam(T t){
		return t;
	}

	public T get2(Class<T> t) throws IllegalAccessException,InstantiationException{
		return t.newInstance();
	}

	public <T2,T3> T sayHello2(T t,T2 t2,T3 t3){
		return t;
	}

}
