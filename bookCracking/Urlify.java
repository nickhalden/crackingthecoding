package bookCracking;

/**
 * Created by vn0dht3 on 1/1/17.
 */
public class Urlify {
    public static void main(String[] args) {
        Character arr[]= new Character[10];

        String input="My John Smith ";

        char test[]=input.toCharArray();

        Long start=System.nanoTime();

        StringBuilder stringBuilder= new StringBuilder();

        for (int i=0;i< test.length-1; i++){
            if (test[i]==' ') {
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(test[i]);
            }
        }

        System.out.println(stringBuilder);
        Long end=System.nanoTime();
        System.out.println(end-start);

        anotherMethod(test);
    }

    public  static void anotherMethod(char input[]){

        // book answers
        // since there is extra buffer at the end
        long start=System.nanoTime();
        // count the number of spaces
        int count=0;
        char newtest[]=new char[input.length+10000];

        for ( int i =0;i<input.length;i++){
            if (input[i]==' ')
            count++;
        }
        int shift= count*2+input.length;
        int newArray[]= new int[input.length+10000];
        //count backwards to move the character without over writing
        System.out.println(input.length);
        for (int i=input.length;i<0;i--){
            System.out.println("aaa");
            if (input[i]==' '){
                System.out.println(i + " "+ shift);
                input[shift-1]='%';
                System.out.println("next"+ (shift-1));
//                newArray[shift-2]='2';
//                newArray[shift-3]='0';
                shift=shift-3;
                System.out.println(" found a space");
            }else {
                System.out.println(" found a space");
                newArray[shift-1]=input[i];
                shift=shift-1;

            }
        }

        System.out.println(newArray);

        long end=System.nanoTime();
        System.out.println(end-start);



    }
}
