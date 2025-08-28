public class EmpregadoCompleto {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 3000.0);
        Empregado empregado2 = new Empregado("Maria", "Souza", 4500.0);

        System.out.println("--- Salário Anual Inicial ---");
        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + ": R$ " + empregado1.getSalarioAnual());
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + ": R$ " + empregado2.getSalarioAnual());

        System.out.println();

        // Aumentando o salário em 10%
        empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.10);
        empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.10);

        System.out.println("--- Salário Anual com Aumento de 10% ---");
        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + ": R$ " + empregado1.getSalarioAnual());
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + ": R$ " + empregado2.getSalarioAnual());
    }
}

class Empregado {
    private String nome;
    private String sobrenome;
    private Double salarioMensal;

    public Empregado(String nome, String sobrenome, Double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal >= 0 ? salarioMensal : 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal >= 0 ? salarioMensal : 0.0;
    }

    public double getSalarioAnual() {
        return salarioMensal * 13;
    }
}