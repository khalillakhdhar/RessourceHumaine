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
       return !chaine.isEmpty(); // ! = not
       //equivalent
//       if(chaine.isEmpty())
//           return false;
//       else
//           return true;
    }

    @Override
    public boolean verifLongueur(String password) {
        return password.length()>8; // true si expression correcte / false sinon



    }

}
