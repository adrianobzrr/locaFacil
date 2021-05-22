package locafacil.BD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Insert {
    public void insertAdm(String nome, String cpf, String email, String senha){
        String sql = "INSERT INTO administrador (nome_adm,cpf_adm,email_adm,senha_adm) VALUES('"+nome+ "','"+cpf+
                "','"+email+"','"+senha+"')";
        System.out.println(sql);
        Conexao con = new Conexao();
        con.execute(sql);
    }
    
    public void insertCliente(String nome, String cpf, String email, String cnh, String dataNascimento, String telefone, 
            String endCidade, String endRua, int endNumero, int endCEP, String endBairro) throws ParseException{
        /*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date dataFormatada = formato.parse(dataNascimento);
        System.out.println(dataFormatada);*/
        String sql = "INSERT INTO cliente (nome_cl,cpf_cl,email_cl,numerocnh_cl,nascimento_cl,telefone_cl,endcidade_cl,"
                + "endrua_cl, endnumero_cl,endcep_cl,endbairro_cl) VALUES('"
                +nome+ "','"
                +cpf+ "','"
                +email+ "','"
                +cnh+ "',"
                +dataNascimento+ ",'"
                +telefone+ "','"
                +endCidade+ "','"
                +endRua+ "',"
                +endNumero+ ","
                +endCEP+ ",'"
                +endBairro+ "')";
        System.out.println(sql);
        //Conexao con = new Conexao();
        //con.insert(sql);
    }
}
