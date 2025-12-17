public class TestX {
  public int result = 17, i, n = 7, m = 5;
  public int[] num = {6, 8, 11};
  public void compute(int[] nums) {
    n = nums[0] + this.m;
    this.result += nums[i];
    TestX temp = new TestX();
    boolean check = !(temp.modify(temp, num));
    if (check) {
      m = nums[1] + temp.result;
    } else {
      m = result - nums[3];
    }
    System.out.println(m + " " + n + " " + result);
  }
  public boolean modify(TestX obj, int[] arr) {
    arr[1]++;
    i = i + 1;
    obj.m = this.result + arr[i];
    obj.result = obj.m - obj.n + n;
    System.out.println(obj.m + " " + obj.n + " " + result);
    return arr[1] % 2 == 0;
  }
  public boolean modify(TestX obj) {
    num[i]++;
    i = i + 1;
    obj.m = this.result + num[i];
    obj.result = num[2] - obj.n + n;
    System.out.println(obj.m + " " + obj.n + " " + result);
    return num[1] % 2 != 0;
  }
}
