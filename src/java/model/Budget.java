package model;
// Generated 25-may-2018 8:47:00 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Budget generated by hbm2java
 */
public class Budget  implements java.io.Serializable {


     private Integer id;
     private Request request;
     private long budget;
     private Date date;
     private Date time;
     private String state;
     private Set orders = new HashSet(0);

    public Budget() {
    }

	
    public Budget(Request request, long budget, Date date, Date time, String state) {
        this.request = request;
        this.budget = budget;
        this.date = date;
        this.time = time;
        this.state = state;
    }
    public Budget(Request request, long budget, Date date, Date time, String state, Set orders) {
       this.request = request;
       this.budget = budget;
       this.date = date;
       this.time = time;
       this.state = state;
       this.orders = orders;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Request getRequest() {
        return this.request;
    }
    
    public void setRequest(Request request) {
        this.request = request;
    }
    public long getBudget() {
        return this.budget;
    }
    
    public void setBudget(long budget) {
        this.budget = budget;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }




}


