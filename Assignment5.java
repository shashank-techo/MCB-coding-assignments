public class Assignment5 {
    public static void main(String []args){
        char []arr = {'a','a','b','c','a','b','b','b','c','c','c', 'a','a','a','a','a','c','c','c' ,'b', 'b'};
        int seqLength = calc(arr);
    }

    public static int calc(char []arr){
        int max = 1;
        int prevMax = max;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                max++;
            }else{
                if(prevMax<max){
                    prevMax = max;
                }
                max = 1;
            }
        }
        int maxSeqLen = (prevMax>max?prevMax:max);
        System.out.println("max length : "+maxSeqLen);
        return maxSeqLen;
    }
}
