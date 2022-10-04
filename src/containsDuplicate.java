public class containsDuplicate {


    static boolean containsduplicate(int[] arrs){
        for(int i=0;i<arrs.length;i++){
            for (int j=i+1;j<arrs.length;j++){
                if(arrs[i]==arrs[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arrs[]={1,2,3,4};
        boolean a=containsduplicate(arrs);
        System.out.println(a);


    }
}
