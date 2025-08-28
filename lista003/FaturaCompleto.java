public class FaturaCompleto {

    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("001", "Mouse", 2, 50.0);
        Fatura fatura2 = new Fatura("002", "Teclado", -1, 120.0);

        System.out.println("--- Fatura 1 ---");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço por item: " + fatura1.getPrecoPorItem());
        System.out.println("Total da fatura: " + fatura1.getTotalFatura());
        System.out.println();

        System.out.println("--- Fatura 2 ---");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço por item: " + fatura2.getPrecoPorItem());
        System.out.println("Total da fatura: " + fatura2.getTotalFatura());
    }
}

class Fatura {
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double precoPorItem;

    public Fatura(String numero, String descricao, Integer quantidade, Double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(Double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura() {
        if (quantidade < 0) {
            quantidade = 0;
        }
        if (precoPorItem < 0) {
            precoPorItem = 0.0;
        }
        return quantidade * precoPorItem;
    }
}