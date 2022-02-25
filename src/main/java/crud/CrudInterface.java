/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crud;

import com.mycompany.ressourcehumaine.Employee;

/**
 *
 * @author khali
 */
public interface CrudInterface {
    public void createEmployee(Employee em);
    public void updateEmployee(Employee em);
    public void deleteEmployee(int id);
}
