
public class task37_main_method {
    public static int days_year(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return 366;
           }
            else{
                return 365;
            }
        }
            public static void main(String[] args){
                int year = 2015;
                int res = days_year(year);
                System.out.println(res);
            }
            
        }



    

