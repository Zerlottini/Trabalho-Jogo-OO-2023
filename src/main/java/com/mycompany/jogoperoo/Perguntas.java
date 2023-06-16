
package com.mycompany.jogoperoo;

import java.util.ArrayList;

public class Perguntas {
//Atributos
    private String enunciado;
    private ArrayList<Alternativas> alternativa;
    private int opcaoCorreta;

    //Construtor 
    public Perguntas(String enunciado, ArrayList<String> alternativas, int opcaoCorreta) {
        this.enunciado = enunciado;
        this.alternativa = alternativa;
        this.opcaoCorreta = opcaoCorreta;
      
    }

    //Getters e Setters
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public ArrayList<Alternativas> getAlternativas() {
        return alternativa;
    }

    public void setAlternativas(ArrayList<String> alternativas) {
        this.alternativa = alternativa;
    }
  
    public int getOpcaoCorreta() {
        return opcaoCorreta;
    }

    public void setOpcaoCorreta(int opcaoCorreta) {
        this.opcaoCorreta = opcaoCorreta;
    }
  }
