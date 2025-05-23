public class Principal{
    public static void main (String[] args) {
        Empregado emp1 = new Empregado();
        emp1.adicionarHrs (8);
        emp1.adicionarHrs (10);
        System.out.println(emp1.totalHrs);


    }
}