
import Models.Administrador;
import Models.Cliente;
import java.text.ParseException;
import locafacil.BD.Busca;
import locafacil.BD.Conexao;
import locafacil.BD.Edit;
import locafacil.BD.Insert;
import locafacil.BD.Delete;



public class LocaFacil {

    public static void main(String[] args) throws ParseException {
        Administrador adm;
        Conexao con = new Conexao();
        Insert ins = new Insert();
        Edit edt = new Edit();
        Delete del = new Delete();
        Busca busca = new Busca();
        Cliente cl;
        //ins.insertAdm("Paulo Cesar", "00000000000", "paulo@gmail.com", "16515dfadf");
      
        //ins.insertCliente("Alef Souza", "566161651", "alesouza@gmail.com", "665654654", "25/11/1994", "98028904", "Casa da mae joana", 
              //"Rua Dos Bobos", 0, 55668000, "Esmeralda");
        // edt.editAdm("Jose Ricardo Silva","1233456789", "joser@gmail", "53tgs342ds", 1);
        //del.deleteAdm(2);
        //adm = busca.buscaAdmEmail("ricardinhodelas@gmail.com");
        cl = busca.buscaClienteNome("Alef Souza");
        System.out.println(cl.toString());
    }
    
}
