package P_03_BitManipulation;

public class C_05_CountSetBits {
    public static void main(String[] args) {
        int n=10,cnt=0;
        while(n!=0){
            int lsb=n&1;
            if (lsb==1){
                cnt++;
            }
            n=n>>1;
        }
        System.out.println(cnt);
    }
}
