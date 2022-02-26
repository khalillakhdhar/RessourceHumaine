/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import com.mycompany.ressourcehumaine.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author khali
 */
public class CrudUser implements CrudInterface  {
public Connect c=new Connect();

    @Override
    public void createEmployee(Employee em) {
        try
        {
            // préparation
                String sql = "INSERT INTO `employee`(`nom`, `prenom`, `email`, `mdp`, `age`, `recrutement`, `grade`, `tel`) VALUES (?,?,?,?,?,?,?,?)"; // declaration de query
                PreparedStatement statement=Connect.conn.prepareStatement(sql);
                // affectation des valeurs
                statement.setString(1, em.getNom());
                statement.setString(2, em.getPrenom());
                statement.setString(3, em.getEmail());
                statement.setString(4, em.getMdp());
                statement.setInt(5, em.getAge());
                statement.setInt(6, em.getRecrutement());
                statement.setString(7, em.getGrade());
                statement.setString(8, em.getTel());
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "ajouté avec succés");
        }
        catch(Exception ex)
        {
            JOptionPane.showConfirmDialog(null, "ajout impossible");
        
        }
        
    }

    @Override
    public void updateEmployee(Employee em) {
 try
        {
            int tab[ ] = new int[4];
            int tabs[ ];
     
        
           // préparation
                String sql = "UPDATE `employee` SET `nom`=?,`prenom`=?,`email`=?,`mdp`=?,`age`=?, `recrutement`=?, `grade`=?, `tel`=? WHERE `id`=?"; // declaration de query
                PreparedStatement statement=Connect.conn.prepareStatement(sql);
                // affectation des valeurs
                statement.setString(1, em.getNom());
                statement.setString(2, em.getPrenom());
                statement.setString(3, em.getEmail());
                statement.setString(4, em.getMdp());
                statement.setInt(5, em.getAge());
                statement.setInt(6, em.getRecrutement());
                statement.setString(7, em.getGrade());
                statement.setString(8, em.getTel());
                statement.setInt(9, em.getId());
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "modifier avec succés");
        }
        catch(Exception ex)
        {
            JOptionPane.showConfirmDialog(null, "Mise à jour impossible");
        
        }    }

    @Override
    public void deleteEmployee(int id) {
 try
        {
          String sql = "Delete FROM employee WHERE `id`=?"; // corp de requete
        PreparedStatement statement=  Connect.conn.prepareStatement(sql); // preparation
        
       
        statement.setInt(1, id);
        statement.executeUpdate(); // retourne un int 
        JOptionPane.showMessageDialog(null, "supprimer avec succés");

        
        }
        catch(Exception ex)
        {
            JOptionPane.showConfirmDialog(null, "supression impossible");
        
        }    }
    public void showUsers(String nom)
    {
    try
    {
    String sql = "SELECT * FROM `employee` WHERE nom=?"; // retourne un tableau
    PreparedStatement pst = Connect.conn.prepareStatement(sql);
    pst.setString(1, nom);
    // fin de préparation
ResultSet rs=pst.executeQuery();
while(rs.next())
{
System.out.print(rs.getInt("id")+" prenom"+rs.getString("prenom"));

}
    
    
    }
    catch(Exception ex)
    {
    
    }
    
    
    }
    
}
