public class atividade4 {
    public static void main(String args[] ) {

        double jan = 15000;
        double fev = 23000;
        double mar = 17000;
        double soma = (jan+fev+mar);

      System.out.println("A soma dos gastos é R$ " + soma);
        System.out.printf("A media dos gastos por mês é R$ %.2f", soma/3);

    }
}
