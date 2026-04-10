public class Task3{
    public static void main(String[] args){
        int arr[] ={1,0,0,22};
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                k++;
            }
            
        }
        int ar[] = new int[k];
         k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                ar[k]=arr[i];
                k++;
            }
            
        }
         for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}