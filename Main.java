import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Double> veiculosAlugados = new ArrayList<>();
    
    public void cadastraOnibus(Onibus onibus){
        veiculosAlugados.add(onibus.Alugar());
    }

    public void cadastraCaminhao(Caminhao caminhao){
        veiculosAlugados.add(caminhao.Alugar());
    }

    public void printAlugados(List<Double> veiculos){
        for (Double elem : veiculos) {
            System.out.println(String.format("Alugel = R$%.2f", elem));
        }
    }
}
