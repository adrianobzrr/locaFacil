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
        private int id_ve;
        private int id_cl;
   

    
       public Aluguel(int id_alu, String dataInicio, String dataFim, double valor, int id_cl,int id_ve){
           
               this.id_alu = id_alu;
	       this.dataInicio = dataInicio;
	       this.dataFim = dataFim;
               this.valor = valor;
               this. id_cl =  id_cl;
	       this.id_ve = id_ve;
       }
       
       public Aluguel(String dataInicio, String dataFim, double valor, int id_cl,int id_ve){
           
	       this.dataInicio = dataInicio;
	       this.dataFim = dataFim;
               this.valor = valor;
               this. id_cl =  id_cl;
	       this.id_ve = id_ve;
       }

    public Aluguel(int id_alu, String dataInicio, String dataFim, double valor, double potencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
