import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 5 + a;
//        if (a > b){
//            System.out.println("a > b");
//        }else if (a < b){
//            System.out.println("a < b");
//        } else System.out.println("a == b");
//        System.out.println("Main.main(String[] arr) is called");
//    }
//    public static void main(){
//        System.out.println("Main.main() is called");
//        Color c1 = new Color("Red");
//        changeColor(c1);
//        System.out.print(c1.getName());
//    }
//    public static void changeColor(Color c){
//        c = new Color("Blue");
//        System.out.print(c.getName());
//    }
//}
//class Color {
//    String name;
//
//    public Color(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;

//        System.out.print("Hello");
//        while (1)
//        {
//            System.out.println(" world");
//            break;
//        }
//        String str1 = "Hello";
//        String str2 = "Hello";
//        if (str1 == str2)
//            System.out.println("Equal");
//        else
//            System.out.println("Not equal");
//        int i = 10;
//        int j = 25;
//        System.out.println(i + ' ' + j);
//        int arr1[] = {1, 2, 3, 4, 5};
//        int arr2[] = {1, 2, 3, 4, 5};
//        if (arr1 == arr2)
//            System.out.println("Equal");
//        else
//            System.out.println("Not equal");
//        int i = 0;
//        int j = ++i + i++;
//        System.out.println(j);
//        float num = 5f;
//        System.out.println("A is equal to " + num / 0.0f);
//        A var = new B();
//        var.print();
//    }
//}
//class A{
//    static public void print(){
//        System.out.println("A.print() is called");
//    }
//}
//class B extends A{
//    static public void print(){
//        System.out.println("B.print()");
//        List list = new ArrayList<>();
//        list.add("Red");
//        list.add("Green");
//        list.add("Blue");
//        changeMe(list);
//        System.out.println(list);
//    }
//    private static void changeMe (final List list){
//        list.add("Cyan");
//        list.remove("Blue");
//        int[][] arr = {{1,2,3,4,5,6}, {6,7,8,9,10}};
//        int i = arr[1].length;
//        System.out.println(i);
//        int [] a = new int[]{2, 4, 6, 8, 10};
//        int[] b = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i] * 2;
//            System.out.println(b[i]);
//        }
//        float real = 0.0f/0.0f;
//        if (real == real)
//            System.out.println("Equal");
//        else
//            System.out.println("Not");
//        String a = "A";
//        String b = "b";
//        System.out.println(a + b);
//String[] text = new String[]{
//        "I ",
//        "Love ",
//        "Programming ",
//        "Tests"
//};
//int i = 0;
//while (i < text.length){
//    System.out.print(text[i]);
//    i++;
//}
//        int i = 0;
//        int j = i++ + ++i;
//        System.out.println(j);
//        int i = 5, j = 2;
//        System.out.println(i % j );
//        int [] a = new int[]{2,4,6};
//        int[] b = new int[a.length];
//        b[4] = 8;
//try {
//    throw new B();
//} catch (A exception){
//    A.print();
//} catch (B exception){
//    B.print();
//}
//    }
//}
//class A extends Exception{
//    static public void print(){
//        System.out.println("A got");
//    }
//}
//class B extends A{
//    static public void print(){
//        System.out.println("B got");
//        boolean bool;
//        bool = foo1() || foo2();
//        System.out.print(" ");
//        bool = foo1() && foo2();
//        System.out.print(" ");
//        bool = foo2() || foo1();
//        System.out.print(" ");
//        bool = foo2() && foo1();
//        System.out.print(" ");
//
//    }
//    static boolean foo1(){
//        System.out.print("foo1()");
//        return true;
//    }
//    static boolean foo2(){
//        System.out.print("foo2()");
//        return false;
//MyMathClass m = new MyMathClass();
//int i = 10, j = 15;
//m.sum(i, j);
//        float f1 = 3.4f, f2 = 9.23f;
//        m.sum(f1, f2);
//        char c1 = 'a', c2 = 'b';
//        m.sum(c1,c2);
//
//    }
//}
//class MyMathClass{
//    public void sum(int i1, int i2){
//        System.out.println(":int");
//    }
//    public void sum(String str1, String str2){
//        System.out.println(":String");
//    }
//    public void sum(double str1, double str2){
//        System.out.println(":double");
//int i = 10;
//int j = 12;
//i += ++j;
//        System.out.println(i);
//  int i = 1, j = 1, k = 1;
//  if (i++ > 1 && j++ < 2 || k++ ==1)
//      System.out.println(1);
//  else
//      System.out.println(2);
//
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(k);
//        byte num = (byte) 127;
//        num++;
//        System.out.println(num);
//        Hello hello = null;
//        hello.print();
//    }
//}
//class Hello {
//    public static void print(){
//        System.out.println("Hello world");
//        int i =10, j = 12, k =1;
//        k += i++ - --j;
//        System.out.println(k);
//        print("Hello");
//    }
//    void print(String str){
//        System.out.println(str);
//        int num = 0;
//        for (int i = 0; i < 100; i++)
//            num = num++;
//        System.out.println(2 + 2 == 5 && 12/4 == 3 || 2 == 5 % 3);
//        String str1 = "my test";
//        String str2 = "this is";
//        String str3;
//        switch (str1){
//            case "MY TEST": str3 = str1 + str2; break;
//            case "My Test": str3 = str2 + str1; break;
//            case "my test": str3 = str1 + str1; break;
//            default: str3 = str2 + str2;
//        }
//        System.out.println(str3);
//        boolean b1 = true, b2 = false, b3 = true;
//        System.out.println(b1 && b2 && !b3);
//        int i = 0, j = 1;
//        boolean b = getValue(i, j) ? true : false;
//        System.out.println(b);
//    }
//    public static boolean getValue(int i, int j){
//        return i>j;

//        System.out.println(sum(1,2,3,4,5));
//    }
//    public static int sum (int ...y, int x){
//        int s = 0;
//        for (int i = 0; i < y.length; ++i) {
//            s+=y[i];
//        }
//        return s+x;
        int i = 5, j = 8, k = 0;
        if (i>j && i++ <10 && (k+=i+j) > 10){
            System.out.print(true);
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
