import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
public class Example01Test {

	@Test
	public void test() {
		int[] arr={12,6,4,8,3};
		Example01.mpPx(arr);
		System.out.println(Arrays.toString(arr));
	}
}
//通过Example01Test实现对Example01.mpPx冒泡排序算法进行单元测试
