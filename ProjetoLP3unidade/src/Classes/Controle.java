/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Classes.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Thamires
 */
public class Controle {
    
     private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    // FUNÇÃO PARA SALVAR OS FUNCIONÁRIOS
    public boolean salvar(Funcionario f) {
        if (f != null) {
            funcionarios.add(f);
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Funcionario> exibirlista(){
        return funcionarios;
    }
}
   

