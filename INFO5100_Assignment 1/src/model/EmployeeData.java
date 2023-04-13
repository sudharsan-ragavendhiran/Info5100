/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sudharsan
 */
public class EmployeeData {
    private ArrayList<Employee> empData;
    private ArrayList<Employee> filteredEmpData;
    public EmployeeData(){
        this.empData = new ArrayList<Employee>();
        this.filteredEmpData = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmpData() {

            return empData;
    }
    
    
    
    public ArrayList<Employee> SearchEmpData(int col, String searchKeyword) {
        ArrayList<Employee> empSearch = new ArrayList();
        for(Employee employee: empData)
        {
            
            if(col == 0){
                if(employee.getEmployeeName().equals(searchKeyword))
                {
                    empSearch.add(employee);
                }
            }
            else if(col == 1){
                if(employee.getEmployeeId().equals(searchKeyword))
                {
                    empSearch.add(employee);
                }
            }
            else if(col == 3){
                if(employee.getEmployeePosition().equals(searchKeyword))
                {
                    empSearch.add(employee);
                }
            }
            else if(col == 2){
                if(employee.getEmployeeLevel().equals(searchKeyword))
                {
                    empSearch.add(employee);
                }
            }
            else if(col == 4){
                if(employee.getEmployeeEmail() .equals(searchKeyword))
                {
                    empSearch.add(employee);
                }
            }
            //System.out.println(empSearch.size());
            
            
        }
        //System.out.println("out");
        //System.out.println(empSearch.size());
        return empSearch;      
//            colName = switch (colName) {
//                case "Name" -> "0";
//                case "EmployeeId" -> "1";
//                case "Position" -> "2";
//                default -> "0";
//            };
//            
            }
//        else{
//           return empData;
//    }
        
    public void setEmpData(ArrayList<Employee> empData) {
        this.empData = empData;
    }
    public Employee addNewEmp(){
        Employee newEmp= new Employee();
        empData.add(newEmp);
        return newEmp;
    }
    public void deleteEmp (Employee emp){
        empData.remove(emp);
    }

    public ArrayList<Employee> searchEmployee(String name) {
        ArrayList<Employee> empSearch = new ArrayList();
        for(Employee employee: empData)
        {
            
            if(employee.getEmployeeName().equals(name))
            {
                empSearch.add(employee);
            }
            
        }
        return empSearch;
        
    }
    
    
    
}
