public class array_merge {
    public static void merge(int[] num1, int m, int[] num2, int n){
        int k = m+n-1;
        int i = m-1;
        int j = n-1;

        while (j >= 0) {
            if(i>=0 && num1[i]>num2[j]){
                num1[k] = num1[i];
                k--;
                i--;
            }
            else{
                num1[k] = num2[j];
                k--;
                j--;
            }
        }
        System.out.print("The merged array is: \n" +"{");
        for(int p = 0; p< num1.length; p++){
            if( p == num1.length-1){
                System.out.print(num1[p]);
            }
            else{System.out.print(num1[p]+", ");}

        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        merge(num1 , 3,num2, 3);
    }
}
