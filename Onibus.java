public class Onibus extends Veiculo {
    private Integer assentos;

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }
    
    public Double Alugar(){
        Double diaria = (double) ((30*assentos) - (2025-anoVeiculo)*70);
        return diaria;
    }
}
