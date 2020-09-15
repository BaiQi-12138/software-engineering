import java.util.Arrays;

public class Example01 {
	public static void mpPx(int arr[]){
		for (int i = 0; i <= arr.length - 1; i++){
			for (int j = 0; j < arr.length - 1 - i;j++){
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
//用eclipse打包冒泡排序算法方法
