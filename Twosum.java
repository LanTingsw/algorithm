public class Twosum {
	public int[] twoSum (int[] nums, int target) {
//创建一个哈希表存储待处理数据
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer> ;
/*创建一个数组用来返回理想数字对*/
		int[] res = new int[2] ;
		/*循环1：
 		 *
		 * 以参数数据数组最大索引值为边界，循环遍历参数数据数组，并将每一个数据和其对应的索引值存入哈希表中*/
		for (int i = 0; i < nums.length; ++i) {
			m.put(nums[i], i);
		}
		/*以参数数据数组最大索引值为边界，同时也是哈希表键值对数量为边界做循环*/
		for (int i = 0; i < nums.length; ++i) {
			//在循环内部得到中间值(即为另一理想值）			
			int t = target - nums[i] ;
			/*循环内部判断哈希表中是否有另一理想值，若有就存在数组中并跳到下一次循环*/
			if (m.containsKey(t) && m.get(t) != i) {
				res[0] = i;
				res[1] = m.get(t);
				break ;
			}
		}
		/*
		 *
		 * 返回理想数值对
		 *
		 * */
		return res;
	}
}



	/*
	 *
	 *
	 * 注释测试
	 *
	 * 
	 * */
