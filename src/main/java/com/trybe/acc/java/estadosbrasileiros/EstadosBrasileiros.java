package com.trybe.acc.java.estadosbrasileiros;

import java.util.Random;

public class EstadosBrasileiros {
  /**
   * Método principal para a execuçao do código.
   * 
   */
  public static void main(String[] args) {
    // Sorteia uma UF.
    String[] siglas = {"CE", "SC", "AM"};
    int pos = new Random().nextInt(siglas.length);

    // Mostra o nome do estado.
    mostraNomeEstado(siglas[pos]);
  }

  static void mostraNomeEstado(String uf) {
    // Seu código aqui
	  String[] nomescompletos = { "Ceara", "Santa Catarina", "Amazonas" };
	  String nomeEstado ;
	  
	  
	  if (uf == "CE" ) {
		  nomeEstado = nomescompletos[0];
		  
	 } else if (uf == "SC") {
		 nomeEstado = nomescompletos[1];
	 } else {
		 nomeEstado = nomescompletos[2];
	 }
	  
	  imprime(nomeEstado);
  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(String nomeEstado) {
    System.out.println(nomeEstado);
  }
}
