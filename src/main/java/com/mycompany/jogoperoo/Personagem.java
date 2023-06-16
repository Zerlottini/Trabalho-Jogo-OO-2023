/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogoperoo;

public class Personagem {
     //Atributos
  private String nome;
  private int hp;
  private boolean status;

  //Método construtor//
  public Personagem(String nome, int hp, boolean status) {
    this.nome = nome;
    this.hp = hp;
    this.status = status;
  }

  //Get//
  public String getNome() {
    return this.nome;
  }
  public int getHP() {
    return this.hp;
  }
  public boolean getStatus(){
    return this.status;
  }

  //Set//
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setHP(int hp){
    this.hp = hp;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }
  
}
