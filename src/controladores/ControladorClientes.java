/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import modelo.Cliente;

public class ControladorClientes {
    
    private ArrayList<Cliente> misclientes;
    
    public ControladorClientes()
    {
        misclientes = new ArrayList<Cliente>();
    }
    
    public boolean agregarCliente(Cliente a)
    {
        if(existeCliente(a)) 
        {
            return false;
        }
        
        else 
        {
            misclientes.add(a);
            return true;
        }
    }
    
    public boolean existeCliente(Cliente a) {
        
        for(Cliente misClientes : misclientes) 
        {  
            if(misClientes.getCedula().equals(a.getCedula()))
            {
                return true;
            }
        }
        return false;
    }
    
    public void modificarCliente(int indice, String code, String name, double balance, String ctg) {
        
        Cliente cl = new Cliente(code, name, balance, ctg);
        misclientes.set(indice, cl);
    }

    public void eliminarCliente(int indice)
    {
        misclientes.remove(indice);
    }
    
    public ArrayList<Cliente> listaClientes() 
    {
        return misclientes;
    }
}
