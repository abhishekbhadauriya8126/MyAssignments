import java.util.Arrays;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        boolean res=false;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==toCheckValue){
                res = true;
                break;
            }
            else
                res = false;
        }
        return  res;
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int valueToCheck = 19;
        SearchArray search=new SearchArray();
        System.out.println(search.searchArray(arr,valueToCheck));
    }
    }