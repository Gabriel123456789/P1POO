public class Onibus extends Veiculo {
    private Integer assentos;

    // Construtor padrão
    public Onibus() {
        super();
    }

    // Construtor com parâmetros
    public Onibus(String placa, Integer anoVeiculo, Integer assentos) {
        super(placa, anoVeiculo);
        this.assentos = assentos;
    }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }
    
    @Override
    public Double alugar(){
        Double diaria = (double) ((30*assentos) - (2025-anoVeiculo)*70);
        return diaria;
    }
}
