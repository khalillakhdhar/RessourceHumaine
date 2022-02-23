/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ressourcehumaine;

/**
 *
 * @author khali
 */
public class Employee {
    private int id;
    private String nom,prenom,email,mdp;
    private int age,recrutement;
    private String grade;
     private String tel;
     
    
    
    // 0033067888 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRecrutement() {
        return recrutement;
    }

    public void setRecrutement(int recrutement) {
        this.recrutement = recrutement;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Employee(int id, String nom, String prenom, String email, String mdp, int age, int recrutement, String grade, String tel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.age = age;
        this.recrutement = recrutement;
        this.grade = grade;
        this.tel = tel;
    }

    public Employee() {
    }

    public Employee(String nom, String prenom, String email, String mdp, int age, int recrutement, String grade, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.age = age;
        this.recrutement = recrutement;
        this.grade = grade;
        this.tel = tel;
    }
    
    
    
    
}
