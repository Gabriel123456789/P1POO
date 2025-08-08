import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Double> veiculosAlugados = new ArrayList<>();
    
    public static void cadastraOnibus(Onibus onibus){
        veiculosAlugados.add(onibus.alugar());
    }

    public static void cadastraCaminhao(Caminhao caminhao){
        veiculosAlugados.add(caminhao.alugar());
    }

    public static void printAlugados(List<Double> veiculos){
        for (Double elem : veiculos) {
            System.out.println(String.format("Alugel = R$%.2f", elem));
        }
    }

    public static List<Double> getVeiculosAlugados() {
        return new ArrayList<>(veiculosAlugados);
    }

    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("hsuwhj", 2023, 40);
        cadastraOnibus(onibus1);

        Caminhao caminhao1 = new Caminhao("kmshb", 2020, 5);
        cadastraCaminhao(caminhao1);

        Onibus onibus2 = new Onibus("ascuhj", 2021, 30);
        cadastraOnibus(onibus2);

        Caminhao caminhao2 = new Caminhao("bfxshb", 2020, 3);
        cadastraCaminhao(caminhao2);

        printAlugados(getVeiculosAlugados());
    }
}
