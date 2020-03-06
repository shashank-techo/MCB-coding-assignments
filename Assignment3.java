public class Assignment3 {
    public static void main(String []args){
        long []arr = { 10, 11, 5 , 6, 8, 9, 4 , 3, 15, 6 , 4 , 5 ,1 , 0 , 4 , 7};
        maxDifference(arr);
    }

    public static long maxDifference(long []arr){

        if (arr.length==0){
            return 0;
        }else if(arr.length==1){
            return arr[0];
        }

        long max=0, min=0;
        if(arr[0]>arr[1]){
            max = arr[0];
            min = arr[1];
        }else{
            max = arr[1];
            min = arr[0];
        }

        for(int i=2; i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }
        long diff = Math.abs((max-min));
        System.out.println(diff);
        return diff;
    }
}
