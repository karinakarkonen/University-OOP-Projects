
package company;

import java.util.ArrayList;
import java.util.List;

public class Project {
    
    private int id;
    private List<Integer> tasksId;
    private List<Integer> access;
    private String name;
    
    public Project(int id, List<Integer>tasksId, List<Integer>access, String name){
        
        this.id = id;
        this.tasksId = new ArrayList<>(tasksId);
        this.access = new ArrayList<>(access);
        this.name = name;
        
    }
    
    public int getId(){ 
        return id;
    }
    
    public List<Integer> getTasksId(){
        return tasksId;
    }
    
    public List<Integer> getAccessList(){
        return access;
    }
    
    public String getName(){
        return name;
    }
    
    public void setId(int id){
        this.id= id;
    }
    
    public void setTasksId(List<Integer>tasksId){
        this.tasksId = new ArrayList<>(tasksId);
    }
    
    public void setAccess(List<Integer> access){
        this.access = new ArrayList<>(access);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void addTask(int taskId){
        this.tasksId.add(taskId); 
    }
    
    public void addAccess(int employeeId){
        this.access.add(employeeId);
    }
    
}
