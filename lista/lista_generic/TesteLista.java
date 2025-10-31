public class TesteLista{
    public static void main(String[] args) {
        ListaDupla ld = new ListaDupla<String>();
        ld.insereInicio("primeiro");
        System.out.println(ld);
        ld.insereInicio("segundo");
        System.out.println(ld);
        ld.insereFim("terceiro");
        System.out.println(ld);
        ld.insereFim("quarto");
        System.out.println(ld);
        System.out.println(ld.removeInicio() + " foi removido no início");
        System.out.println(ld);
        System.out.println(ld.removeFim() + " foi removido no fim");

        if(ld.contains("primeiro")) System.out.println("primeiro esta");
        else System.out.println("primeiro nao esta");
        if(ld.contains("decimo")) System.out.println("decimo esta");
        else System.out.println("decimo nao esta");
    }
}