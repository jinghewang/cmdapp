package jdk8;

/**
 * <p>
 *
 * @author wjh
 * @date 2015/6/16
 * @since 0.1
 */
public class FactoryTest implements JDKTest {
	@Override
	public void Test() {
		PersonFactory<Person> personFactory = Person::new;
		Person p1 = personFactory.create("w", "jh");
		String name = p1.getName();
	}

	@Override
	public <T> void TestObject(T t) {

	}
}
