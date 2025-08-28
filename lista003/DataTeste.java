import java.time.Year;

public class DataTeste {
    public static void main(String[] args) {
        System.out.println("--- Datas válidas ---");
        Data data1 = new Data(28, 8, 2025);
        System.out.print("Data 1: ");
        data1.displayData();

        Data data2 = new Data(29, 2, 2024); // Ano bissexto
        System.out.print("Data 2 (bissexto): ");
        data2.displayData();
        
        Data data3 = new Data(31, 12, 2023);
        System.out.print("Data 3: ");
        data3.displayData();

        System.out.println("\n--- Tentando criar datas inválidas ---");
        Data dataInvalida1 = new Data(30, 2, 2023); // Fevereiro com 30 dias
        System.out.print("Data inválida 1: ");
        dataInvalida1.displayData();

        Data dataInvalida2 = new Data(32, 1, 2022); // Dia 32
        System.out.print("Data inválida 2: ");
        dataInvalida2.displayData();

        Data dataInvalida3 = new Data(15, 13, 2021); // Mês 13
        System.out.print("Data inválida 3: ");
        dataInvalida3.displayData();
    }
}

class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (!validarData(dia, mes, ano)) {
            System.out.println("Data inválida. A data será definida como 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    private boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1) {
            return false;
        }
        
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (Year.of(ano).isLeap()) {
            diasPorMes[2] = 29;
        }

        if (dia > diasPorMes[mes]) {
            return false;
        }
        
        return true;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. O valor não foi alterado.");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido para o mês e ano atuais. O valor não foi alterado.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido para o dia e mês atuais. O valor não foi alterado.");
        }
    }

    public void displayData() {
        System.out.printf("%02d/%02d/%d%n", dia, mes, ano);
    }
}