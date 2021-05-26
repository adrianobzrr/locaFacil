
package locafacil.BD;
import Models.Administrador;
import Models.Cliente;
import Models.Veiculos;
import java.sql.ResultSet;

public class Busca {
    
    public Administrador buscaAdmEmailEmail(String email){
        int id = 0;
        String nome = null, cpf = null, email_adm = null, senha = null;
        try {
            String sql = "Select * from administrador where email_adm like '"+email+"';";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    id = rs.getInt("id_adm");
                    nome = rs.getString("nome_adm");
                    cpf = rs.getString("cpf_adm");
                    email_adm = rs.getString("email_adm");
                    senha = rs.getString("senha_adm");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            Administrador adm = new Administrador(id, nome, cpf, email_adm, senha);
            return adm;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Cliente buscaClienteNome(String nome){
        int id = 0, endNumero = 0, endCEP = 0;
        String nome_cliente = null, cpf = null, email = null, numeroCNH = null, 
                nascimento = null, telefone = null, endCidade = null, endRua = null, endBairro = null;
        try {
            String sql = "Select * from cliente where nome_cl like '"+nome+"';";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    id = rs.getInt("id_cl");
                    nome_cliente = rs.getString("nome_cl");
                    cpf = rs.getString("cpf_cl");
                    email = rs.getString("email_cl");
                    numeroCNH = rs.getString("numerocnh_cl");
                    nascimento = rs.getString("nascimento_cl");
                    telefone = rs.getString("telefone_cl");
                    endCidade = rs.getString("endcidade_cl");
                    endRua = rs.getString("endrua_cl");
                    endNumero = rs.getInt("endnumero_cl");
                    endCEP = rs.getInt("endcep_cl");
                    endBairro = rs.getString("endbairro_cl");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            Cliente cl = new Cliente(id, nome_cliente, cpf, email, numeroCNH, nascimento, telefone, 
            endCidade, endRua, endNumero, endCEP, endBairro);
            return cl;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public Veiculos buscaVeiculoId(int id_ve){
        int id =0, anofabricacao = 0;
	String marca = null, modelo = null, cor = null, placa = null, cambio = null , 
                direcao = null, dataaqusicao = null;
        float potencia = 0;
        boolean vidroseletricos = false, arcondicionado = false;
        double valor = 0;
        try {
            String sql = "Select * from veiculo where id_ve = "+id_ve+";";
            Conexao con = new Conexao();
            ResultSet rs = con.executaBusca(sql);
            
            try {
                while(rs.next()){
                    id = rs.getInt("id_ve");
                    marca = rs.getString("marca_ve");
                    modelo = rs.getString("modelo_ve");
                    cor = rs.getString("cor_ve");
                    placa = rs.getString("placa_ve");
                    cambio = rs.getString("cambio_ve");
                    direcao = rs.getString("direcao_ve");
                    potencia = rs.getFloat("potencia_ve");
                    vidroseletricos = rs.getBoolean("vidroseletricos_ve");
                    arcondicionado = rs.getBoolean("arcondicionado_ve");
                    anofabricacao = rs.getInt("anofabricacao_ve");
                    valor = rs.getFloat("valor_ve");
                    dataaqusicao = rs.getString("dataaqusicao_ve");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            Veiculos ve = new Veiculos(id, marca, modelo, cor, placa, 
                cambio, direcao, potencia, vidroseletricos, arcondicionado, 
                valor, anofabricacao, dataaqusicao);
            return ve;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
}
