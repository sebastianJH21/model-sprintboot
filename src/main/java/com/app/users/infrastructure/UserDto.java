package com.app.users.infrastructure;

public class UserDto {
    private Long id;
    private String userName;
    private String password;
    private String role_id;

    // Empty constructor
    public UserDto() {
    }

    // Constructor with parameters
    public UserDto(Long id, String userName, String password, String role_id) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role_id = role_id;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString() method
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", user_name='" + userName + '\'' +
                ", id_rol='" + password + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
