public class TwoSum {
    public static boolean twoSun(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            int arri = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(arri + arr[j] == target){
                    return true;
                }
            }
        }
        return  false;
    }
}
