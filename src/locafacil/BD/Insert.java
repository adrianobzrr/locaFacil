package locafacil.BD;

import Models.Administrador;
import Models.Cliente;
import Models.Veiculos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;

public class Insert {
    
    public void insertAdm(Administrador adm){
        String sql = "INSERT INTO administrador (nome_adm,cpf_adm,email_adm,senha_adm) VALUES('"+adm.getNome()+ "','"+adm.getCpf()+
                "','"+adm.getEmail()+"','"+adm.getSenha()+"')";
        Conexao con = new Conexao();
        con.execute(sql);
    }
    
    public void insertCliente(Cliente cl) throws ParseException{
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        //Date dataFormatada = formato.parse(cl.getDataNascimento());
        //System.out.println(dataFormatada);
        String sql = "INSERT INTO cliente (nome_cl,cpf_cl,email_cl,numerocnh_cl,nascimento_cl,telefone_cl,endcidade_cl,"
                + "endrua_cl, endnumero_cl,endcep_cl,endbairro_cl) VALUES('"
                +cl.getNome()+ "','"
                +cl.getCpf()+ "','"
                +cl.getEmail()+ "','"
                +cl.getCnh()+ "','"
                +cl.getDataNascimento()+ "','"
                +cl.getTelefone()+ "','"
                +cl.getEndCidade()+ "','"
                +cl.getEndRua()+ "',"
                +cl.getEndNumero()+ ","
                +cl.getEndCEP()+ ",'"
                +cl.getEndBairro()+ "')";
        Conexao con = new Conexao();
        con.execute(sql);
    }
    
    public void insertVeiculo(Veiculos ve, int id_adm) throws ParseException{
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        //Date dataFormatada = formato.parse(cl.getDataNascimento());
        //System.out.println(dataFormatada);
        int id_ve =0 ;
        String sql = "INSERT INTO veiculo (marca_ve,modelo_ve,cor_ve,placa_ve,cambio_ve,direcao_ve,potencia_ve,"
                + "vidroseletricos_ve,arcondicionado_ve,anofabricacao_ve,valor_ve,dataaquisicao_ve) VALUES('"
                +ve.getMarca()+ "','"
                +ve.getModelo()+ "','"
                +ve.getCor()+ "','"
                +ve.getPlaca()+ "','"
                +ve.getCambio()+ "','"
                +ve.getDirecao()+ "',"
                +ve.getPotencia()+ ","
                +ve.getVidroseletricos()+ ","
                +ve.getArcondicionado()+ ","
                +ve.getAnofabricacao()+ ","
                +ve.getValor()+ ",'"
                +ve.getDataaqusicao()+ "')";
        Conexao con = new Conexao();
        con.execute(sql);
        ResultSet rs = con.executaBusca("Select * from veiculo");
        try {
                while(rs.next()){
                    id_ve = rs.getInt("id_ve");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        sql = "INSERT INTO gerenciaveiculo (id_adm,id_ve,acao) VALUES("+id_adm+","+id_ve+",'inserção')";
        con.execute(sql);
    }
    
    
}
