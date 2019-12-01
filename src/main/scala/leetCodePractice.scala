object leetCodePractice {

  //Q1.
  //Given nums = [2, 7, 11, 15], target = 9,
  //Because nums[0] + nums[1] = 2 + 7 = 9,
  //return [0, 1]

  //Runtime: 700 ms, faster than 18.75% of Scala online submissions for Two Sum.
  //Memory Usage: 51.4 MB, less than 25.00% of Scala online submissions for Two Sum.
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for(i <- 0 to (nums.length-1)){
      for(j <- (i+1) to nums.length if j < nums.length) {
        if((nums(i) + nums(j)) == target) return Array(i, j)
      }
    }
    Array(0,0)
  }

  //List에 값을 target에서 뺀뒤 find로 뺀값을 찾아본다 없으면 다음
  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    for(i <- 0 to (nums.length-1)){
        val temp = target - nums(i)
        val tIndex = nums.indexOf(temp)
        if(tIndex >= 0) return Array(i, tIndex)
    }
    Array(0,0)
  }
}
