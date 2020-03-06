public class Assignment4 {

    public static void main(String []args){
        calculate(17,3,7);
    }

    public static void calculate(int chocolateCount, int draw, int seats){
        long []arr = new long[seats];
        int i=draw-1;
        while(chocolateCount>0){
            if(i==arr.length){
                i=0;
            }
            arr[i] = arr[i]+1;
            System.out.println("seat no : "+(i+1)+", chocolate count : "+arr[i]);
            chocolateCount--;
            i++;
        }
        for(int j=0;j<arr.length;j++){
            System.out.println("seat no : "+j+", chocolate count : "+arr[j]);
        }
        System.out.println("last seat : "+(i));
    }


}
