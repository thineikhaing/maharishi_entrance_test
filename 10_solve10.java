public class solve10 {
    public static void main(String[] args) {
        // System.out.println(nfactorial(4));
        System.out.println(solve());

    }

    public static int  solve(){

        int x=0,y=0;

        int sum = nfactorial(10);
        for(int i=10;i>=0; i--){
            x=nfactorial(i);
            for (int j=9;j>=0;j-- ){
                y=nfactorial(j);
//                System.out.println("y="+y);
                if(x+y==sum){

                    return 2;
                }
            }
        }
        return 0;
    }

    public static int nfactorial(int a){
        if(a==0){
            return 0;
        }

        int product = 1;
        for(int i = a; i>0; i--){
            product *= i;
        }
        return product;
    }
}
