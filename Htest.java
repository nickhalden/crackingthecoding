/**
 * Created by vn0dht3 on 1/22/17.
 */
public class Htest {
    public  static int solution(String[] args) {
        int arr[]= {6};

        int max=1;
        int max_diff=-1000001;
        int min=0;
        int default_maxdiff = -1;
        if(arr.length < 2){
            System.out.println(default_maxdiff);
            return default_maxdiff;
        }
        while (max<arr.length){
            if(arr[max]<arr[min]){
                min=max;
                max++;
            }else if(arr[max]>=arr[min]){
                int temp_maxdiff = arr[max] - arr[min];
                if(temp_maxdiff > max_diff){
                    max_diff = temp_maxdiff;
                }
                max++;
            }
        }

        if(max_diff < -1000000){
//            System.out.println(default_maxdiff);
            return default_maxdiff;
        }else {
//            System.out.println(max_diff);
            return  max_diff;
        }

    }
}
