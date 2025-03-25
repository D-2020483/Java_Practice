public class LogiOp {
    public static void main(St[] args) {

        int x =7;
        int y = 5;
        int a = 3;
        int b = 8;

        boolean num = x >= y;
        boolean num1 = a <= b;

        //AND OPERATER
        boolean result = x > y && a < b;  // when the first value is false it use the short serkit to save the time
        boolean result1 = x < y && a < b; // when the fist condition is false it not check the second condition because the short serkit 

        //||(Pipe)OR OPERATER                                                                                            
        boolean res = x < y || a < b; // we can add conditions as we need                                                  

        //NOT OPERATER
        System.out.println(!res);
        
        System.out.println(num);
        System.out.println(num1);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(res);

    
      /*      AND OPERAATER(&&)                           OR OPERATER(||)PIPE                      NOT OPERATER(!)     
       Condition1      condition2                 Condition1         condition2                       T  ----> F         
                                                                                                       
       T                  T     = T                  T                 T  = T                         F  ----> T
       T                  F     = F                  T                 F  = T                 
       F                  T     = F                  F                 T  = T
       F                  F     = F                  F                 F  = F

      */

    }
    
}
