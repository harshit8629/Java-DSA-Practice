// you can use another examples for running the code
public class Task1{
    public static void main(String[] args){
        int arr[]={2,3,5,10};
        int Above =0;
        int Below =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>3){
                Above+=arr[i];
            }else{
                Below+=arr[i];
            }
        }
        System.out.println("Sum of elements greater than 3: " + Above);
        System.out.println("Sum of elements less than 3: " + Below);
    }
}