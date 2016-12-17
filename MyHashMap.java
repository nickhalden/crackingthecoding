import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by vn0dht3 on 11/24/16.
 */
public class MyHashMap {

    LinkedList<String> arr[];
    MyHashMap(int size){
        arr=new LinkedList[size];
        initialize();

    }
    void initialize(){
        int i=0;
        while (i<arr.length){
            arr[i]= new LinkedList<>();
            System.out.println(i);
            i=i+1;
        }
    }

    int size(){
        return arr.length;
    }
    int hasCode(String key){
        int length=key.length();
        return length*23;
    }
    void increaseCapacity(){
        arr= new LinkedList[size()*2];
    }
    void add(int key,String value){
        if (key>size()-1){
            Object temp[]=arr;
            System.out.println("increase the size of hashmap");
            System.exit(1);
            // does not function well
            increaseCapacity();
            initialize();
            int i=0;
            for (Object element : temp){
                temp[i]=element;
            }
            insert(value,key);
        }else{
            insert(value,key);
        }

    }

    void add(String element){
        int hashValue=hasCode(element);
        int index=hashValue%size();
        insert(element,index);

    }
    void insert(String key,int index){
        arr[index].add(key);
//        System.out.println(arr[index].add(key));

    }
    boolean contains(int key){
        if (key> size()-1|| key<0){
            System.out.println("Key not present ");
            return false;
        }
        if (arr[key].size() ==0)
            return false;
        else {
            return true;
        }

    }
    Object key(int key){
        if (contains(key)){
            for(String element: arr[key]){
                System.out.println(element);
            }
        }
        return arr[key];
    }

//    Object keys(){
//
//        return arr[];
//    }
    void delete(){


    }


}

class TestMyHashMap{
//    static  LinkedList<Integer>[] vertex = new LinkedList[5];

    public static void main(String[] args) {
//        vertex[0] = new LinkedList<Integer>();
//        vertex[0].add(1);
         MyHashMap obj= new MyHashMap(5);
        obj.add("the");
        obj.add("quick");
        obj.add("brown");
        obj.add("indervir");
        obj.add("saloni");
        obj.add("vibha");
        obj.add(1,"nipun");
        obj.add(1,"lala");

        obj.add(5,"nipun");



        System.out.println(obj.contains(5));


//
        int check=0;

        while(check<obj.arr.length){
            System.out.println(obj.arr[check]);
            check=check+1;
        }
        System.out.println(obj.arr[0]);

//        for (MyHashMap element : obj.keys()){
//            System.out.println(element);
//        }

//        System.out.println(vertex[0].get(0));
    }

}