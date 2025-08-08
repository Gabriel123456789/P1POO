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
        Onibus onibus = new Onibus("hsuwhj", 2023, 40);
        cadastraOnibus(onibus);
        Caminhao caminhao = new Caminhao("kmshb", 2020, 5);
        cadastraCaminhao(caminhao);
        printAlugados(getVeiculosAlugados());
    }
}
