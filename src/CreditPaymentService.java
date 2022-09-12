public class CreditPaymentService {
    public int calculate (int a , double b,int c){
        int y;
        double percentInMonth = b/12/100 ;
        double x = 1 + percentInMonth;
        y = (int) ( a * ((percentInMonth * Math.pow( x , c)) / ( Math.pow( x , c) -1 )) ) ;

        return y;
    }

}
