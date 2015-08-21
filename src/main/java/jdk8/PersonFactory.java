package main.java.jdk8;

/**
 * <p>
 *
 * @author wjh
 * @date 2015/6/16
 * @since 0.1
 */
public interface PersonFactory<P extends Person> {
	P create(String firstName,String lastName);
}
