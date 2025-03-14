package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class TesteCliente {

    public static void main(String[] args) {

        // Instanciar objetos
        Cliente objCliente = new Cliente();

        //  entradas
        objCliente.setIdade(18);
        objCliente.setNome("Leonardo Saavedra");
        objCliente.setEmail("leonardosscampos@gmail.com");
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