
package company;

import java.util.*;


public class CEO {
    
    private String login;
    private String password;
    
    private List<Project> projects;
    private List<Employee> employees;
    private List<Report> reports;
    
    public CEO(String login, String password){
        this.login = login;
        this.password = password;
        this.projects = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.reports = new ArrayList<>();
    }
    
    public void addProject(Project project){
        projects.add(project);
    }
    
    public void assignEmployee(Employee employee){
        employees.add(employee);
    }
    
    public void addReport(Report report){
        reports.add(report);
    }
    
    public String getLogin(){
        return login;
    }
    
    public String getPassword(){
        return password;
    }
    
    public List<Project> getProjects(){
        return projects;
    }
    
    public List<Employee> getEmployees(){
        return employees;
    }
    
    public List<Report> getReport(){
        return reports;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
}
