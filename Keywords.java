import java.lang.reflect.Method;

/**
 * Created by vn0dht3 on 12/30/16.
 * Final
 * Finally
 * Finalize
 * Continue
 * Const:
 * Static:
 * static function
 */
public class Keywords {

}

class FinalizeExample{
    public void finalize(){System.out.println("finalize called");}
    public static void main(String[] args){
        FinalizeExample f1=new FinalizeExample();
        FinalizeExample f2=new FinalizeExample();
        f1=null;
        f2=null;
        System.gc();
        System.out.println("First this statement executed then finalize called");
    }}


class FinallyExample{
    public static void main(String[] args){
        try{
            int x=300;
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is executed");
        }
    }
    
    void testContinue(int n){

        for(int i=0;i<n;i++){
            if (n==10) {
                System.out.println("n");
                continue;
            }
            System.out.println("out of loop");

        }
    }

}

class FinalExample{
public static void main(String[] args){
final int x=100;
        //x=200;//Compile Time Error
}}


