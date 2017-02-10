package Keywords;

import java.lang.reflect.Method;

/**
 * Created by vn0dht3 on 1/13/17.
 */
class Dummy{
    private void foo(){
        System.out.println("hello foo()");
    }
}

class Test{
    public static void main(String[] args) throws Exception {
        Dummy d = new Dummy();
        Method m = Dummy.class.getDeclaredMethod("foo");
        //m.invoke(d);// throws java.lang.IllegalAccessException
        m.setAccessible(true);// Abracadabra
        m.invoke(d);// now its OK
    }
}
