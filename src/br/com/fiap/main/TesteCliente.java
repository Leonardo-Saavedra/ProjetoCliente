package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class TesteCliente {

    public static void main(String[] args) {

        // Instanciar objetos
        Cliente objCliente = new Cliente();

        //  entradas
        objCliente.setIdade(1965);
        objCliente.setNome("Marco Antonio de Souza Campos");
        objCliente.setEmail("quitomvl04@gmail.com");
        objCliente.setAltura(1.70);

        // saidas

        // idade
        System.out.println("idade: " + objCliente.getIdade());
        // nome
        System.out.println("nome: " + objCliente.getNome());
        // email
        System.out.println("e-mail: " + objCliente.getEmail());
        // altura
        System.out.println("altura: " + objCliente.getAltura());


    }
}