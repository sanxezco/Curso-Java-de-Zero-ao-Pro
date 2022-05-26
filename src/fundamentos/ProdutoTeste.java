package fundamentos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2000, 0.1);
        Produto p2 = new Produto("Mouse", 10, 0.2); 


      

        System.out.printf("%s custa R$ %.2f com desconto de %.2f%n", p1.nome, p1.preco, p1.desconto);
        System.out.printf("%s custa R$ %.2f com desconto de %.2f%n%n", p2.nome, p2.preco, p2.desconto);

        //calcular el valor con descuento
        double valorComDesconto = p1.precoComDesconto();
        System.out.printf("%s custa R$ %.2f aplicando o desconto o valor é %.2f%n", p1.nome, p1.preco, valorComDesconto);

        double valorComDesconto2 = p2.precoComDesconto();
        System.out.printf("%s custa R$ %.2f aplicando o desconto o valor é %.2f%n%n", p2.nome, p2.preco, valorComDesconto2);

        //calcular a media dos precos
        double media = (p1.preco + p2.preco) / 2;
        System.out.printf("A média dos preços é R$ %.2f%n%n", media);
        
    }
    
}
