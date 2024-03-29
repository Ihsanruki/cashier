package com.smk.cashier.model;

public class User extends Model{
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }
    //update

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", dateCreated=" + dateCreated +
                ", lastModified=" + lastModified +
                ", createdBy=" + createdBy +
                ", updateBy=" + updateBy +
                '}';
    }
}
