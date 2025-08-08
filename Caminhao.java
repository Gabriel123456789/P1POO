public class Caminhao extends Veiculo {
    private Integer eixos;

    // Construtor padrão
    public Caminhao() {
        super();
    }

    // Construtor com parâmetros
    public Caminhao(String placa, Integer anoVeiculo, Integer eixos) {
        super(placa, anoVeiculo);
        this.eixos = eixos;
    }

    public Integer getEixos() {
        return eixos;
    }

    public void setEixos(Integer eixos) {
        this.eixos = eixos;
    }
    
    @Override
    public Double alugar(){
        Double diaria = (double) ((300*eixos) - (2025-anoVeiculo)*50);
        return diaria;
    }
}
