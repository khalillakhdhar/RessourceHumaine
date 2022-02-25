/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud;

import com.mycompany.ressourcehumaine.Employee;

/**
 *
 * @author khali
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Connect c=new Connect();
        Employee em=new Employee("admin","admin","y", "z", 10, 2022, "a", "20999888");
        CrudUser cru=new CrudUser();
        em.setId(2);
        //cru.updateEmployee(em);
       // cru.deleteEmployee(2);
        cru.showUsers("khaled");
        //cru.createEmployee(em);
        
    }
    
}
