
package company;

import java.util.Date;


public class Report {
    
    private int time;
    private Date date;
    private String task;
    private String project;
    
    public Report(int time, Date date, String task, String project){
        this.time = time;
        this.date = date;
        this.task = task;
        this.project = project;
    }
    
    public int getTime(){
        return time;
    }
    
    public Date getDate(){
        return date;
    }
    
    public String getTask(){
        return task;
    }
    
    public String getProject(){
        return project;
    }
    
    public void setTime(int time){
        this.time = time;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public void setTask(String task){
        this.task = task;
    }
    
    public void setProject(String project){
        this.project = project;
    }
    
    
    
}
