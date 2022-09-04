
public class FeiboSeq{

  public static void main(String args[]){

    /*
     *
     *  题目：打印斐波那契数列
     * 
     */
     
     int n = 10;

     printFeiboSeq(n);
  }

  public static void printFeiboSeq(int len){
    if( len < 1)
      return;

    int lo = 1;
    int hi = 1;

    int i=2;
    System.out.println(lo);

    while(i++ <= len){
      System.out.println(hi);

      hi = hi + lo;
      lo = hi - lo;
    }

  }

}
