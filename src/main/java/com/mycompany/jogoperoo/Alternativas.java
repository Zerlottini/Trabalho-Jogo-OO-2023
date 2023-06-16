
package com.mycompany.jogoperoo;

public class Alternativas {
  
  private String enunciado_A;
  private boolean status;

  //Construtor
  public Alternativas(String enunciado_A, boolean status){
    this.enunciado_A = enunciado_A;
    this.status = status;
  }

  //Get
  public String getEnunciado(){
    return this.enunciado_A;
  }
  public boolean getStatusA(){
     return this.status;
  }

  //Set
  public void setEnunciado(String enunciado_A) {
    this.enunciado_A = enunciado_A;
  }
  public void setStatusA(boolean status){
    this.status = status;
  }
}