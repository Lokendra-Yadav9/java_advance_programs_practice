
class MyGeneric<T1,T2>{
    private final T1 t1;
    private final T2 t2;
     int val ;
    public MyGeneric(int val,T1 t1,T2 t2){
        this.t1=t1;
        this.val=val;
        this.t2=t2;
    }

//    public void setT1(T1 t1){
//        this.t1=t1;
//    }
    public T1 getT1(){
        return t1;
    }
    public T2 getT2(){
        return t2;
    }
public int getval(){
        return val;
    }
}
public class Generic_use_in_java {
    public static void main(String[] args) {

//        ArrayList arrayList=new ArrayList<>();
//        arrayList.add("love");
//        arrayList.add(78);
//        arrayList.add(96);
//        arrayList.add(745);

//        int a= (int) arrayList.get(3);
//        System.out.println(a);
        
        MyGeneric<String,Integer> g1=new MyGeneric<>(41,"lovely is lucky",8546);
        String str=g1.getT1();
        System.out.println(str);
        Integer str3=g1.getT2();
        System.out.println(str3);
        int str2=g1.getval();
        System.out.println(str2);


    }
}
