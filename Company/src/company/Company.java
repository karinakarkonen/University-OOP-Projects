
package company;

import java.util.*;
public class Company {

   
    public static void main(String[] args) {
       
        CEO ceo = new CEO("admin", "1234");
        
        Employee emp1 = new Employee(1, "Karina", "pass1");
        Employee emp2 = new Employee(2, "TestKullanicisi", "pass2");
        
        ceo.assignEmployee(emp1);
        ceo.assignEmployee(emp2);
        
        Project project1 = new Project(1, Arrays.asList(1, 2, 3), Arrays.asList(1,2), "Project A");
        ceo.addProject(project1);
        
        Report report1 = new Report(5, new Date(), "Kodlama", "Project A");
        ceo.addReport(report1);
        
        System.out.println("Calisan Sayisi: " + ceo.getEmployees().size());
        System.out.println("Proje sayisi: " + ceo.getProjects().size());
        System.out.println("Rapor sayisi: " + ceo.getReport().size());
        System.out.println("\n------ CALISANLAR -------");
        for(Employee e : ceo.getEmployees()){
            System.out.println("ID: " + e.getId() + ". Kullanici adi: " + e.getLogin() + ", Sifre: " + e.getPassword());
        }
        
    }
    
}
