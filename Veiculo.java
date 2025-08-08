public abstract class Veiculo {
    protected String placa;
    protected Integer anoVeiculo;

    // Construtor padrão
    public Veiculo() {
    }

    // Construtor com parâmetros
    public Veiculo(String placa, Integer anoVeiculo) {
        this.placa = placa;
        this.anoVeiculo = anoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public Integer getAno() {
        return anoVeiculo;
    }

    public void setAno(Integer ano) {
        this.anoVeiculo = ano;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract Double alugar();
}
