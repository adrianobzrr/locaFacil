
package locafacil.BD;
import Models.Administrador;
import Models.Aluguel;
import Models.Cliente;
import Models.Veiculos;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Busca {
    
    public Administrador buscaAdmEmailEmail(String email){
        Administrador adm = null;
        try {
            String sql = "Select * from administrador where email_adm like '"+email+"';";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    Administrador adm01 = new Administrador(rs.getInt("id_adm"), rs.getString("nome_adm"),
                            rs.getString("cpf_adm"), rs.getString("email_adm"), rs.getString("senha_adm"));
                    adm = adm01;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            
            return adm;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList buscaClienteNome(String nome){
        ArrayList<Cliente> list = new ArrayList();
        try {
            String sql = "Select * from cliente where nome_cl like '"+nome+"';";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    Cliente cl = new Cliente(rs.getInt("id_cl"), rs.getString("nome_cl"), rs.getString("cpf_cl"),
                            rs.getString("email_cl"), rs.getString("numerocnh_cl"), rs.getString("nascimento_cl"),
                            rs.getString("telefone_cl"), rs.getString("endcidade_cl"), rs.getString("endrua_cl"),
                            rs.getInt("endnumero_cl"), rs.getInt("endcep_cl"), rs.getString("endbairro_cl"));
                    list.add(cl);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public Cliente buscaClienteId(String id_cl){
        Cliente cl = null;
        try {
            String sql = "Select * from cliente where id_cl like '"+id_cl+"';";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    Cliente cl01 = new Cliente(rs.getInt("id_cl"), rs.getString("nome_cl"), rs.getString("cpf_cl"),
                            rs.getString("email_cl"), rs.getString("numerocnh_cl"), rs.getString("nascimento_cl"),
                            rs.getString("telefone_cl"), rs.getString("endcidade_cl"), rs.getString("endrua_cl"),
                            rs.getInt("endnumero_cl"), rs.getInt("endcep_cl"), rs.getString("endbairro_cl"));
                    cl = cl01;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return cl;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public Veiculos buscaVeiculoId(int id_ve){
        Veiculos ve = null;
        try {
            String sql = "Select * from veiculo where id_ve = "+id_ve+";";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    Veiculos ve01 = new Veiculos(rs.getInt("id_ve"), rs.getString("marca_ve"), rs.getString("modelo_ve"),
                            rs.getString("cor_ve"), rs.getString("placa_ve"), rs.getString("cambio_ve"), rs.getString("direcao_ve"),
                            rs.getDouble("potencia_ve"), rs.getBoolean("vidroseletricos_ve"), rs.getBoolean("arcondicionado_ve"),
                            rs.getDouble("valor_ve"), rs.getInt("anofabricacao_ve"), rs.getString("dataaqusicao_ve"));
                    ve = ve01;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            
            return ve;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public ArrayList buscaVeiculoModelo(String modelo_ve){ 
   
        try {
            String sql = "Select * from veiculo where modelo_ve= "+modelo_ve+";";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            ArrayList<Veiculos> list = new ArrayList();
            try {
                while(rs.next()){
                    Veiculos ve = new Veiculos(rs.getInt("id_ve"), rs.getString("marca_ve"), rs.getString("modelo_ve"),
                            rs.getString("cor_ve"), rs.getString("placa_ve"), rs.getString("cambio_ve"), rs.getString("direcao_ve"),
                            rs.getDouble("potencia_ve"), rs.getBoolean("vidroseletricos_ve"), rs.getBoolean("arcondicionado_ve"),
                            rs.getDouble("valor_ve"), rs.getInt("anofabricacao_ve"), rs.getString("dataaqusicao_ve"));
                    list.add(ve);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
     }
      
      
      public Aluguel buscaAluguelId(int id_alu){
        Aluguel alu = null;

        try {
            String sql = "Select * from aluguel where id_alu= "+id_alu+";";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    Aluguel alu01 = new Aluguel(rs.getInt("id_alu"), rs.getString("dataInicio_alu"), rs.getString("dataFim_alu"), 
                            rs.getDouble("valor_alu"), rs.getInt("id_cl"), rs.getInt("id_ve"));
                    alu = alu01;
                  
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            
            return alu;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
     }
      
      
      public ArrayList buscaAluguelIdCliente(int id_cl){
        ArrayList<Aluguel> list = new ArrayList();
        try {
            String sql = "Select * from aluguel where id_cl= "+id_cl+";";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    Aluguel alu = new Aluguel(rs.getInt("id_alu"), rs.getString("dataInicio_alu"),
                    rs.getString("dataFim_alu"), rs.getDouble("valor_alu"), rs.getInt("id_cl"), rs.getInt("id_ve"));
                    list.add(alu);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
     }
    
}
