package cn.net.vive.ps;

import java.lang.annotation.Target;

/**
 * <p>
 *
 * @author bolen
 * @date 2015/6/14
 * @since 0.1
 */
public abstract class AbstractClasss {

	public static <T> void sayHello(T t){

	}

	public abstract  <T extends String> String getStrin();

}
