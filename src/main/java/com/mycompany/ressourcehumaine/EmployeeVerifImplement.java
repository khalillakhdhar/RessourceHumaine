/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ressourcehumaine;

/**
 *
 * @author khali
 */
public class EmployeeVerifImplement implements UserVerifInterface{

    @Override
    public boolean verifAge(int age) {
      if(age>20)
          return true;
      else
          return false;
    }

    @Override
    public boolean verifVide(String chaine) {
       return !chaine.isEmpty();
       //equivalent
//       if(chaine.isEmpty())
//           return false;
//       else
//           return true;
    }

    @Override
    public boolean verifLongueur(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
