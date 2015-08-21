package main.java.jdk8;

/**
 * <p>
 *
 * @author wjh
 * @date 2015/6/16
 * @since 0.1
 */
public class LambdaScope implements JDKTest {
	@Override
	public void Test() {

		System.out.println("hello world");

		final Integer num =3;
		Converter<String,Integer> converter = from -> Integer.valueOf(from) + num;
		System.out.println(converter.convert("15"));
	}

	@Override
	public <T> void TestObject(T t) {

	}
}
