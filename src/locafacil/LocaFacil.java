
import Models.Administrador;
import Models.Cliente;
import Models.Veiculos;
import java.text.ParseException;
import locafacil.BD.Busca;
import locafacil.BD.Conexao;
import locafacil.BD.Edit;
import locafacil.BD.Insert;
import locafacil.BD.Delete;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LocaFacil {

    public static void main(String[] args) throws ParseException, SQLException {
        Administrador adm = new Administrador("Paulo Cesar", "00000000000", "paulo@gmail.com", "16515dfadf");
        Conexao con = new Conexao();
        Insert ins = new Insert();
        Edit edt = new Edit();
        Delete del = new Delete();
        Busca busca = new Busca();
        Veiculos ve = new Veiculos("VolksWagen", "Polo", "Preto", "sgfy-958", 
                "manual", "hidráulica", 1.0, true, false,
                45000.00, 2019, "12/8/2020");
        Cliente cl = new Cliente("Paulo Nobre", "01779563485", "pnobre@gmail.com", "665654654", "09/01/1994", "94663401", "São Miguel", 
              "Rua Eneas Bobo", 51, 59925000, "Maria Manuela");
        //ins.insertAdm(adm);
        //ins.insertCliente(cl);
        ins.insertVeiculo(ve, 1);
        //edt.editAdm("Jose Ricardo Silva","1233456789", "joser@gmail", "53tgs342ds", 1);
        //del.deleteAdm(1);
        //adm = busca.buscaAdmEmail("ricardinhodelas@gmail.com");
        //cl = busca.buscaClienteNome("Alef Souza");
        //System.out.println(cl.toString());
        
        
    }
    
}
