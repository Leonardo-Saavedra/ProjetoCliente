package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class TesteCliente {

    public static void main(String[] args) {

        // Instanciar objetos
        Cliente objCliente = new Cliente();

        //  entradas
        objCliente.setIdade(20);
        objCliente.setNome("Felipe Oliveira");
        objCliente.setAltura(1.82);

        //saidas
        System.out.println("idade: " + objCliente.getIdade());
        // nome
        System.out.println("nome: " + objCliente.getNome());

        // altura
        System.out.println("altura: " + objCliente.getAltura());

    }
}