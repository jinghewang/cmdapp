import main.java.cn.net.vive.define.AnnotationWith2Val;
import main.java.cn.net.vive.define.AnnotationWithDefaultVal;
import main.java.cn.net.vive.define.MyAnnotaion;
import main.java.cn.net.vive.mj.MyColor;
import main.java.cn.net.vive.mj.MyColor2;
import main.java.cn.net.vive.over.Grand;
import main.java.cn.net.vive.over.Parent;
import main.java.cn.net.vive.over.Son;
import main.java.cn.net.vive.ps.P;
import main.java.cn.net.vive.ps.P2;
import main.java.cn.net.vive.ps.S;
import main.java.cn.net.vive.ps.T;
import main.java.cn.net.vive.test.Test;
import main.java.cn.net.vive.test.test1;
import main.java.jdk8.*;
import sun.misc.Launcher;

import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----start-------");

		JDKTest jdkTest = new LambdaScope();
		jdkTest.Test();

		//AnonymousClassTest();
		//ClassLoaderTest();
		//SignNameTest();
		//GenericTest2();
		//GenericTest();
		//IntTest();
		//EnumTest();
		//AnnotationTest();

		System.out.println("-----end-------");
	}

	private static void AnonymousClassTest() {
		//1
		Integer[] nums = {2,5,1,6};
		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2)
					return -1;
				return 0;
			}
		});

		for (Integer num : nums) {
			System.out.println(num);
		}

		//2
		Integer[] nums2 = {2,5,1,6};
		Arrays.sort(nums2,(o1,o2)->{
			if (o1<o2)
				return  -1;
			return 0;
		});

		for (Integer num : nums2) {
			System.out.println(num);
		}
	}

	private static void ClassLoaderTest() {
		//1
		URL[] urls = Launcher.getBootstrapClassPath().getURLs();
		for (URL url : urls)
			System.out.println(url.toExternalForm());

		//2
		//ExtClassLoader extClassLoader ;

		//3
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		Properties ps = System.getProperties();
		for (Enumeration<Object> obs =	ps.keys();obs.hasMoreElements();)
			System.out.println(obs.nextElement());

		Enumeration<?> el = ps.propertyNames();
	}

	private static void SignNameTest() {
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		System.out.println(list.getClass() == list2.getClass());


		if (list instanceof List){

		}
	}

	private static void GenericTest2() {
		S<String> s = new S<>();
		s.sayHello2("ss","xx",12);

		P<Object> p =new P<>();
		int result = p.getAz(new Integer(3).toString(), 5);

		P2<String,Integer> p2 = new P2<>();
		p2.getSum("556",789);


		T t = new T();
		t.getSum("2332",new Integer(4378) );

		//List<?>[] lsa = new ArrayList<String>[10]; // 抛异常
		List<?>[] lsa = new ArrayList<?>[10];

		List<String> list = new ArrayList<String>();
		list.add("test");
		lsa[0] = list;
		System.out.println(lsa[0].get(0));
	}

	private static void GenericTest() {
		//非泛型
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);

		for (Object obj : list) {
			System.out.println(obj.toString());
		}

		//Iterator iterator = list.iterator();
		for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
			Integer i = (Integer) iterator.next();
			System.out.println(i);
		}

		//泛型
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(11);
		list2.add(new Integer(22));
		list2.add(33);

		for (Iterator<Integer> iterator = list2.iterator(); iterator.hasNext(); ) {
			Integer xx2 = iterator.next();
			System.out.println(xx2.toString());
		}

		read(list2);

		//不支持协变
		//List<Parent> listp = new ArrayList<Son>();

		//数组也不支持协变
		//Parent[] ps = new Son[11];

		//parent
		List<Parent> plist = new ArrayList<Parent>();
		plist.add(new Parent("wjh",19));
		plist.add(new Parent("lht", 29));
		//son
		List<Son> slist = new ArrayList<Son>();
		slist.add(new Parent("wjh-11",19));
		slist.add(new Parent("lht-22",29));
		//grand
		List<Grand> glist = new ArrayList<Grand>();
		glist.add(new Grand("wjh-11"));
		glist.add(new Grand("lht-22"));

		//test
		readSon(plist);
		readGrand(plist);

		//List<?> xlist = new ArrayList<>();
		//xlist.add(new Son());
		//xlist.add(null);
	}

	private static void read(List<?> list){
		for (Object obj : list) {
			System.out.println(obj.toString());
		}
	}

	private static void readSon(List<? extends Son> list){
		for (Son obj : list) {
			System.out.println(obj.getName());
		}
	}

	private static void readGrand(List<? super Parent> list){
		for (Object obj : list) {
			System.out.println(obj.toString());
		}
	}

	private static void IntTest() {
		int x1 = 2;
		String s1 = "10";
		Integer x3 = new Integer(x1);
		int x11 = x3.intValue();
		Integer s11 = new Integer(s1);
		int x2 = s11.intValue();
		String x33 = x3.toString();
	}

	/**
	 * 枚举测试
	 */
	private static void EnumTest() {
		MyColor color = MyColor.RED;
		MyColor color2 = MyColor.BLUE;
		System.out.println(color.name());
		System.out.println(color.ordinal());
		System.out.println(color2.name());
		System.out.println(color2.ordinal());

		MyColor2 c2 = MyColor2.RED;
		int ccc2 = c2.getIndex();
		String xxx = c2.getMood();
	}

	/**
	 * 自定义注解测试
	 */
	private static void AnnotationTest() {
		//1
		MyAnnotaion ma = Test.class.getAnnotation(MyAnnotaion.class);
		String ss = ma.value();

		//2
		Annotation[] list = Test.class.getAnnotations();
		for (Annotation an : list) {
			if (an.annotationType() == AnnotationWithDefaultVal.class) {
				System.out.println("--AnnotationWithDefaultVal--");
			}
			System.out.println(an.toString());
		}

		//3
		Annotation[] list2 = Test.class.getDeclaredAnnotations();
		for (Annotation an : list2) {
			System.out.println(an.toString());
		}


		AnnotationWith2Val tv = test1.class.getAnnotation(AnnotationWith2Val.class);

		String ss2 = tv.value();
	}
}
