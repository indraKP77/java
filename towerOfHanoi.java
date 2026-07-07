public class towerOfHanoi {
    public static void main(String args[]){
        int n = 3;
        toh(n, "A", "B", "C");
    }
    public static void toh(int n, String src, String help, String dest){
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        toh(n-1, src, dest, help);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        toh(n-1, help, src, dest);
    }
}
