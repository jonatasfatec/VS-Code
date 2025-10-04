public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);

        no1.setProximo(no2);
        no1.getProximo().setInfo(77);
        System.out.println(no2.getInfo());

        no2.setProximo(no2);
        
    }
}
