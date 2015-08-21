package main.java.jdk8;

/**
 * <p>
 *
 * @author wjh
 * @date 2015/6/16
 * @since 0.1
 */
public class InterfaceDefaultMethod implements  JDKTest {
	@Override
	public void Test() {

		//1
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return a*2;
			}
		};
		Double d1 = formula.calculate(3);
		Double d2 = formula.sqrt(3);
		System.out.println(d1);
		System.out.println(d2);

		//2--
		formula= new MyFormula();
		d1 = formula.calculate(3);
		d2 = formula.sqrt(3);
		System.out.println(d1);
		System.out.println(d2);

		//---------------------------------
		//1.lambda
		Converter<String,Integer> converter = from->Integer.valueOf(from);
		Integer d= converter.convert("5");
		System.out.print(d);

		//2.static method
		Converter<String,Integer> converter1 = Integer::valueOf;
		System.out.println(converter1.convert("45"));

		//3.instance method
		String string = "asdfgh";
		Converter<String,Boolean> converter2 =string::startsWith;
		System.out.println(converter2.convert("af"));

	}

	@Override
	public <T> void TestObject(T t) {

	}
}
