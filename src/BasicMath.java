
public class BasicMath{
    void PrimeNumber(int n){

        if (n < 2) {
    System.out.println("false");
    return;
}
        int cnt = 0;
        for(int i = 1; i*i<=n;i++){
            if (n%i==0) {
                cnt++;
                if ((n/i) != i) cnt++; 
            }
        }
        if(cnt == 2) System.out.println("true");
        else System.out.println("false");
    }

    int gcd(int a, int b){
        while (a>0 && b>0) {
            if (a > b) a = a%b;
            else b = b%a;
        }
        if (a == 0) return b;
        return a;
    }
    public static void main(String[] args) {
     BasicMath obj = new BasicMath();
     System.out.println(obj.gcd(10, 7));   
    }
}