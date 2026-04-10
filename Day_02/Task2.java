public class Task2{
    public static void main(String[] args){
        int arr[] ={237,199,200,196,104};
        for (int i=0;i<arr.length;i++){
            if(arr[i]>=100 && arr[i]<=200){
                if(arr[i]%4==0){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}