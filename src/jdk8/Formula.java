package jdk8;

/**
 * <p>
 *
 * @author wjh
 * @date 2015/6/16
 * @since 0.1
 */
public interface Formula {

	public double calculate(int a);

	default double sqrt(int a){
		return Math.sqrt(a);
	}
}
