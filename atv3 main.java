public class main {
    public static void main(String[] args){
        Fatura dezembro = new Fatura(
                "1312312",
                "esta é a sua fatura",
                12,
                21.99
        );
        System.out.println("numero: " + dezembro.numero);
        System.out.println("descricao: " + dezembro.descricao);
        System.out.println("quantidade de itens: " + dezembro.quantidade);
        System.out.println("preço do item: " + dezembro.precoPorItem);

        System.out.println(dezembro.totalFatura());



    }


}
    
