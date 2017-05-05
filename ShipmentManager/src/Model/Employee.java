package Model;

import java.sql.*;

/**
 * @filename    Employee.java
 * @date        Apr 28, 2017
 * @author      rwatkins
 */
public class Employee {
    private int employee_id;
    private String first_name;
    private String last_name;
    private String middle_name;
    private String social_security;
    private int security_clearance;
    private Date last_update;

    /**
     * @return the employee_id
     */
    public int getEmployee_id() {
        return employee_id;
    }

    /**
     * @param employee_id the employee_id to set
     */
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the middle_name
     */
    public String getMiddle_name() {
        return middle_name;
    }

    /**
     * @param middle_name the middle_name to set
     */
    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    /**
     * @return the social_security
     */
    public String getSocial_security() {
        return social_security;
    }

    /**
     * @param social_security the social_security to set
     */
    public void setSocial_security(String social_security) {
        this.social_security = social_security;
    }

    /**
     * @return the security_clearance
     */
    public int getSecurity_clearance() {
        return security_clearance;
    }

    /**
     * @param security_clearance the security_clearance to set
     */
    public void setSecurity_clearance(int security_clearance) {
        this.security_clearance = security_clearance;
    }

    /**
     * @return the last_update
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     * @param last_update the last_update to set
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

}
