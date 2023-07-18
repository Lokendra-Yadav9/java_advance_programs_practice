import  java.util.*;

public class Collection_framework_ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> li=new ArrayList<Integer>();
        ArrayList <Integer> li2=new ArrayList<Integer>();
        li.ensureCapacity(78);
        li.add(45);
        li.add(85);
        li.add(95);
        li.add(81);
        li.add(3,15);
        li2.add(155);
        li2.add(455);
        li2.add(755);
        li.addAll(li2);
        li.add(5,5);
//        li.clear();

        Object li3=null;
        Object clone1 = li.clone();
//        System.out.println(clone1);
//        System.out.println(li.contains(755));

//        System.out.println(li.equals(clone1));

//        for(Integer list : li){
//            System.out.println(list);
//        }

//        System.out.println( li.isEmpty());

//        System.out.println(li.indexOf(455));
//        System.out.println(li.lastIndexOf(5));
//        li.remove(3);
//        li.set(3,500);
//        li.toArray();
//        System.out.println( li.toString());


        li.trimToSize();


        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i)+" "+i);
        }

    }
}
