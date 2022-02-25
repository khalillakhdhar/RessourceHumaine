/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import com.mycompany.ressourcehumaine.Employee;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author khali
 */
public class CrudUser implements CrudInterface {
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
        
        
        }
        catch(Exception ex)
        {
            JOptionPane.showConfirmDialog(null, "Mise à jour impossible");
        
        }    }

    @Override
    public void deleteEmployee(int id) {
 try
        {
        
        
        }
        catch(Exception ex)
        {
            JOptionPane.showConfirmDialog(null, "supression impossible");
        
        }    }
    
}
