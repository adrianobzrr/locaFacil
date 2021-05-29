package Models;

public class Veiculos {
    
	private int id_ve;
	private String marca;
	private String modelo;
        private String cor;
	private String placa;
        private String cambio;
	private String direcao;
        private double potencia;
        private boolean vidroseletricos;
        private boolean arcondicionado;
        private double valor;
	private int anofabricacao;
        private String dataaqusicao;
       
        public Veiculos (int id_ve, String marca, String modelo, String cor, String placa, 
                String cambio, String direcao, double potencia, boolean vidroseletricos, boolean arcondicionado, 
                double valor, int anofabricacao,String dataaqusicao){
       
               this.id_ve = id_ve;
	       this.marca = marca;
	       this.modelo = modelo;
               this.cor = cor;
	       this.placa = placa;
               this.cambio = cambio;
	       this.direcao = direcao;
               this.potencia = potencia;
               this.vidroseletricos = vidroseletricos;
               this.arcondicionado = arcondicionado;
               this.valor = valor;
	       this.anofabricacao = anofabricacao;
               this.dataaqusicao = dataaqusicao;
	}
        
        public Veiculos (String marca, String modelo, String cor, String placa, 
                String cambio, String direcao, double potencia, boolean vidroseletricos, boolean arcondicionado,
                double valor, int anofabricacao,String dataaqusicao){
	       this.marca = marca;
	       this.modelo = modelo;
               this.cor = cor;
	       this.placa = placa;
               this.cambio = cambio;
	       this.direcao = direcao;
               this.potencia = potencia;
               this.vidroseletricos = vidroseletricos;
               this.arcondicionado = arcondicionado;
               this.valor = valor;
	       this.anofabricacao = anofabricacao;
               this.dataaqusicao = dataaqusicao;
	}

    public int getId_ve() {
        return id_ve;
    }

    public void setId_ve(int id_ve) {
        this.id_ve = id_ve;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setVidroseletricos(boolean vidroseletricos) {
        this.vidroseletricos = vidroseletricos;
    }
    
    public boolean getVidroseletricos() {
        return this.vidroseletricos;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }
    
    public boolean getArcondicionado() {
        return this.arcondicionado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(int anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public String getDataaqusicao() {
        return dataaqusicao;
    }

    public void setDataaqusicao(String dataaqusicao) {
        this.dataaqusicao = dataaqusicao;
    }
    
    public String toString(){
        return "ID: "+id_ve+ ", Marca: "+marca+", Modelo: "+modelo+", Cor: "+cor+
                ", Placa: "+placa+", Cambio: "+cambio+", Direção: "+direcao+", "
                + "Potência; "+potencia+", Vidros Elétricos: "+vidroseletricos+", "
                + "Ar Condicionado: "+arcondicionado+", Valor: "+valor+", "
                + "Ano de Fabricação: "+anofabricacao+", Data de Aquisição: "+dataaqusicao;
    }
}
