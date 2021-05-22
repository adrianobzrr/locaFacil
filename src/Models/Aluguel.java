package Models;

/**
 *
 * @author Yasmim
 */
public class Aluguel {
    
        private int id_alu;
	private String dataInicio;
        private String dataFim;
        private double valor;
        private double potencia;
        private int id_ve;
        private int id_cl;
   

    
       public Aluguel(int id_alu, String dataInicio, String dataFim, double valor, 
            double potencia, int id_cl,int id_ve){
           
           
        
               this.id_alu = id_alu;
	       this.dataInicio = dataInicio;
	       this.dataFim = dataFim;
               this.valor = valor;
	       this.potencia = potencia;
               this. id_cl =  id_cl;
	       this.id_ve = id_ve;
              
               
          
       }

    public int getId_alu() {
        return id_alu;
    }

    public void setId_alu(int id_alu) {
        this.id_alu = id_alu;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId_cl() {
        return id_cl;
    }

    public void setId_cl(int id_cl) {
        this.id_cl = id_cl;
    }

    public int getId_ve() {
        return id_ve;
    }

    public void setId_ve(int id_ve) {
        this.id_ve = id_ve;
    }

    @Override
    public String toString() {
        return super.toString();
    }
       
    
       
    
}
