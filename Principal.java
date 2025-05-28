public class Principal{
    public static void main (String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome ("Daniel");
        a1.setMedia (7);
        System.out.println(a1.getNome());
        System.out.println(a1.getMedia());
        Lampada1 l1 = new Lampada1();
        l1.acender();
    }
}