/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.HibernateDao;
import entities.Pessoa;

/**
 *
 * @author willian
 */
public class ControlePessoa {
    private HibernateDao hibernatedao = new HibernateDao();
    public boolean cadastrarProduto(Pessoa p) throws Exception {   
        boolean result = false;
         
        if (p != null && p.getNome().length() > 0
                && p.getEncaminhamento().length() > 0 && p.getRendaFamiliar() != 0.0f
                && p.getCadastro()!= 0 && p.getCadastro() != 0) {

            // insere no modelo de dados
            hibernatedao.persist(p);
            System.out.println(p.toString());
            
            result = true;
        }
        return result;
    }

    public boolean atualizarPessoa(Pessoa p) throws Exception {
        boolean result = false;
         if (p != null && p.getNome().length() > 0
                && p.getEncaminhamento().length() > 0 && p.getRendaFamiliar() != 0.0f
                && p.getCadastro()!= 0 && p.getCadastro() != 0) {

            hibernatedao.persist(p);

            System.out.println("UPDATED -> " + p.toString());
            result = true;
        }
        
        return result;
        
        
    }
}
