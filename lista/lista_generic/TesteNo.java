public class TesteNo{
    public static void main(String[] args){
        No no1 = new No<Integer>(10);
        System.out.println(no1);

        No no2 = new No<String>("hello, world");
        System.out.println(no2);
    }
}