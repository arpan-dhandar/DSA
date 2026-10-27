public class ParamterSum{
    public static void parameterSum(int i, int sum){
        if (i<1) {
            System.out.println(sum);
            return ;
        }
        parameterSum(i-1, sum+i);
    }

    public static void main(String[] args) {
        parameterSum(5, 0);
    };
}