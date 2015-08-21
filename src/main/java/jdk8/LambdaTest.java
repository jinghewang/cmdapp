package jdk8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>
 *
 * @author wjh
 * @date 2015/6/16
 * @since 0.1
 */
public class LambdaTest implements JDKTest {

	@Override
	public void Test() {

		//old
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


		//new
		System.out.println("------------------new-------------------");
		Integer[] nums2 = {2,5,1,6};
		Arrays.sort(nums2,(Integer o1,Integer o2)->{ if (o1<o2) return -1; return 0;});
		for (Integer num : nums2)
			System.out.println(num);

		System.out.println("------------------new2-------------------");
		nums2 = new Integer[]{2,5,1,6};
		Arrays.sort(nums2,(o1,o2)->{ if (o1<o2) return -1; return 0;});
		for (Integer num : nums2)
			System.out.println(num);
	}

	@Override
	public <T> void TestObject(T t) {

	}
}
