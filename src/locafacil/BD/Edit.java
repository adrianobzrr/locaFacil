
package locafacil.BD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Yasmim
 */
public class Edit {
       public void editAdm(String nome, String cpf, String email, String senha, int id){
         
         String sql = "UPDATE administrador SET"
                 + " nome_adm ='"+nome+"',cpf_adm = '"+cpf+
                "',email_adm = '"+email+"',senha_adm = '"+senha+"'WHERE id_adm = "+id+";";
          
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
       
       
       public void editCliente(int id_cl, String nome, String cpf, String email, String cnh, String dataNascimento, String telefone, 
            String endCidade, String endRua, int endNumero, int endCEP, String endBairro){
         
         String sql = "UPDATE cliente SET"
                + " nome_cl ='"+nome+"',cpf_cl = '"+cpf+
                "',email_cl = '"+email+"', numerocnh_cl = '"+cnh+
                "',nascimento_cl = '"+dataNascimento+"',telefone_cl = '"+telefone+
                "',endcidade_cl = '"+endCidade+"', endrua_cl = '"+endRua+
                "',endnumero_cl = "+endNumero+",endcep_cl = "+endCEP+
                ", endbairro_cl = '"+endBairro+"'WHERE id_cl = "+id_cl+";";
        
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
      
       
      public void editVeiculo(int id_ve, String marca, String modelo, String cor, String placa, String cambio, String direcao, 
            double potencia, boolean vidroseletricos, boolean arcondicionado, double valor, String anofabricacao,String dataaqusicao){
         
       
         String sql = "UPDATE veiculo SET"
                + " marca_ve ='"+marca+"',modelo_ve= '"+modelo+
                "',cor_ve = '"+cor+"', placa_ve = '"+placa+
                "',cambio_ve= '"+cambio+"',direcao_ve = '"+direcao+
                "',potencia_ve= '"+potencia+"', vidroseletricos = "+vidroseletricos+
                ",arcondicionado_ve = "+arcondicionado+",anofabricacao,_ve = "+anofabricacao+
                ", valor_ve = "+valor+" ,dataaqusicao_cl = '"+dataaqusicao+"'"
                + "WHERE id_ve = "+id_ve+";";
                
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
      
         public void editAluguel(int id_alu, String dataInicio, String dataFim, double valor, 
            double potencia, int id_cl,int id_ve){
         
       
         String sql = "UPDATE veiculo SET"
                + " dataInicio_alu ='"+dataInicio+"',dataFim_alu= '"+dataFim+
                "', valor_alu = "+valor+", id_cl= "+id_cl+", id_ve= "+id_ve+
                " + WHERE id_alu = "+id_alu+";";
        
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
}
