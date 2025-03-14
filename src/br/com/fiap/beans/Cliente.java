package br.com.fiap.beans;

public class Cliente {

    // tipo de dados e atributos

//    dado da idade
    int idade;
//    dado do nome
    String  nome;
//    dado do e-mail
    String email;
//    dado da altura
    double altura;

    // metodos Setters (entrada)

//    Set Idade
    public void setIdade(int idade){ this.idade = idade; }
//    Set Nome
    public void setNome(String nome) { this.nome = nome; }
//    Set email
    public void setEmail(String email){ this.email = email; }
//    Set Altura
    public void setAltura(double altura) { this.altura = altura; }

    // metodos Getters (retornar \ exibir)

//    Get Idade
    public int getIdade(){return idade;}
//    Get Nome
    public String getNome() { return nome; }
//    Get Email
    public String getEmail() { return email; }
//    Get Altura
    public double getAltura() { return altura; }


}
