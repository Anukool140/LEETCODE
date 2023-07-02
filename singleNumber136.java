/*
Explation 01:
 * Using Bit Manipulation -

As we know XOR operation with 0 gives the same number
i.e, a XOR 0 = a
eg, for decimal no. 2=> 2 XOR 0 = 2
in binary, 010 XOR 000 = 010

Also we know that , XOR operation with same number gives 0
i.e, a XOR a = 0
eg, 2 XOR 2 = 0
in binary, 010 XOR 010 = 000

XOR is associative (like sum)
i.e, (2 XOR 3) XOR 4 = 2 XOR (3 XOR 4), So the order doesn't matter in performing XOR operation.
eg, 2^3^4^6 = 3^2^6^4 = 4^2^6^3 ......

So, using these three properties of XOR , we will solve the question. we will take ans variable with 0 as initial value. And then for each element i in array, we will perform the XOR operation of the element with 0, ans will become 0 if the same number is found (as a XOR a = 0) and so after the completion of the loop, only element with no duplicate number will remain and will be returned as ans.
 * Explation 02:
 * XOR used here....if a=b then a^b=1 so
if nums= 4,1,2,1,2
ans=4^1^2^1^2
here 2^2 and 1^1 both will be cancel out and 4 is only one so it will not be cancelled out
 * 
 */

 public class singleNumber136 {
    public static int singleNumber(int[] nums)
    {
        int result =0;
        for(int i=0;i<nums.length;i++)
        {
            result = result ^ nums[i];
        }
        return result;
    }
    public static void main(int result)
    {
        int[] nums = [4,5,3,4,3];
        int a = singleNumber(nums);
        System.out.println(a);

    }
}