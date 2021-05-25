package locafacil.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
    private String url;
    private String usuario;
    private String senha;
    private Connection con;
    
    
    //Método de conexão com o banco de dados
    public Conexao(){
        url = "jdbc:postgresql://localhost:5432/postgres";
        usuario = "postgres";
        senha = "9466";
        
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            criaTabalas();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    //Método genérico de execução. Ele recebe a string com comando específico e apenas executa o comando
    public void execute(String sql){
        try {
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet executaBusca(String sql){
        try {
            java.sql.Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
  
    //Método que cria todas as tabelas. Ele é chamado junto com a conexão. caso não exista as tabelas, cria, caso não, nada acontece
    public void criaTabalas(){
        try {
            String sql = "create table administrador(id_adm serial,"
                    + "nome_adm character varying,cpf_adm character varying not null unique,"
                    + "email_adm character varying unique, senha_adm character varying,"
                    + "primary key (id_adm))";	
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Tabela Administrador criada com sucesso!");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        try {
            String sql = "create table cliente(id_cl serial,nome_cl character varying,"
                    + "cpf_cl character varying not null unique,email_cl character varying unique,"
                    + "numeroCNH_cl character varying,nascimento_cl date,"
                    + "telefone_cl character varying,endCidade_cl character varying,endRua_cl character varying,"
                    + "endNumero_cl int,endCEP_cl int,endBairro_cl character varying,primary key (id_cl))";	
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Tabela Cliente criada com sucesso!");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        try {
            String sql = "create table veiculo(id_ve serial,marca_ve character varying,"
                    + "modelo_ve character varying,cor_ve character varying,placa_ve character varying not null unique,"
                    + "cambio_ve character varying,direcao_ve character varying,potencia_ve float,vidrosEletricos_ve boolean,"
                    + "arCondicionado_ve boolean,anoFabricacao_ve int,valor_ve float,dataAquisicao_ve date,"
                    + "primary key (id_ve))";	
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Tabela de Veiculos criada com sucesso!");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        try {
            String sql = "create table aluguel(id_alu serial,dataInicio_alu date,dataFim_alu date,"
                    + "valor_alu real,id_cl int,id_ve int,primary key (id_alu),foreign key (id_cl) references cliente,"
                    + "foreign key (id_ve) references veiculo)";	
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Tabela de Alugueis criada com sucesso!");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        try {
            String sql = "create table gerenciacliente(\n" +
"	id_adm int,\n" +
"	id_cl int,\n" +
"	acao character varying,\n" +
"	foreign key (id_cl) references cliente,\n" +
"	foreign key (id_adm) references administrador)";	
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Tabela de gerenciaCliente criada com sucesso!");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        try {
            String sql = "create table gerenciaveiculo(\n" +
"	id_adm int,\n" +
"	id_ve  int,\n" +
"	acao character varying,\n" +
"	foreign key (id_adm) references administrador,\n" +
"	foreign key (id_ve) references veiculo)";	
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Tabela de gerenciaVeiculo criada com sucesso!");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        
        try {
            String sql = "create table gerencialuguel(\n" +
"	id_adm int,\n" +
"	id_alu  int,\n" +
"	acao character varying,\n" +
"	foreign key (id_adm) references administrador,\n" +
"	foreign key (id_alu) references aluguel)";	
            java.sql.Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Tabela de gerenciaAluguel criada com sucesso!");
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }


}
