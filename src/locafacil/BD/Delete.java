
package locafacil.BD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Yasmim
 */
public class Delete{
       
       public void deletedm(String nome, String cpf, String email, String senha, int id){
         
       
        
         String sql = "DELETE from administrador WHERE"
                 + " nome_adm ='"+nome+"',cpf_adm = '"+cpf+
                "',email_adm = '"+email+"',senha_adm = '"+senha+"', id_adm = "+id+";";
                
         
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
      
      
       public void deleteCliente(int id_cl, String nome, String cpf, String email, String cnh, String dataNascimento, String telefone, 
            String endCidade, String endRua, int endNumero, int endCEP, String endBairro){
         
       
         String sql = "DELETE from cliente WHERE"
                + " nome_cl ='"+nome+"',cpf_cl = '"+cpf+
                "',email_cl = '"+email+"', numerocnh_cl = '"+cnh+
                "',nascimento_cl = '"+dataNascimento+"',telefone_cl = '"+telefone+
                "',endcidade_cl = '"+endCidade+"', endrua_cl = '"+endRua+
                "',endnumero_cl = "+endNumero+",endcep_cl = "+endCEP+
                ", endbairro_cl = '"+endBairro+"', id_cl = "+id_cl+";";
                
         
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
      
       
      public void deleteVeiculo(int id_ve, String marca, String modelo, String cor, String placa, String cambio, String direcao, 
            double potencia, boolean vidroseletricos, boolean arcondicionado, double valor, String anofabricacao,String dataaqusicao){
         
       
         String sql = "DELETE from veiculo WHERE"
                + " marca_ve ='"+marca+"',modelo_ve= '"+modelo+
                "',cor_ve = '"+cor+"', placa_ve = '"+placa+
                "',cambio_ve= '"+cambio+"',direcao_ve = '"+direcao+
                "',potencia_ve= '"+potencia+"', vidroseletricos = "+vidroseletricos+
                ",arcondicionado_ve = "+arcondicionado+",anofabricacao,_ve = "+anofabricacao+
                ", valor_ve = "+valor+" ,dataaqusicao_cl = '"+dataaqusicao+"'"
                + ",id_ve = "+id_ve+";";
                
         
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
      
      
         public void deleteAluguel(int id_alu, String dataInicio, String dataFim, double valor, 
            double potencia, int id_cl,int id_ve){
         
       
         String sql = "DELETE from aluguel WHERE"
                + " dataInicio_alu ='"+dataInicio+"',dataFim_alu= '"+dataFim+
                "', valor_alu = "+valor+", id_cl= "+id_cl+", id_ve= "+id_ve+
                " + ,id_al = "+id_alu+";";
              
         
         System.out.println(sql);
         Conexao con = new Conexao();
         con.execute(sql);
       }
    
    
}
