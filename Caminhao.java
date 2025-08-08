public class Caminhao extends Veiculo {
    private Integer eixos;

    public Integer getEixos() {
        return eixos;
    }

    public void setEixos(Integer eixos) {
        this.eixos = eixos;
    }
    
    public Double Alugar(){
        Double diaria = (double) ((300*eixos) - (2025-anoVeiculo)*50);
        return diaria;
    }
}
