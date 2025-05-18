package com.app.users.infrastructure;

public class UserDto {
    private Long id;
    private String email;
    private String userName;
    private String password;
    private String roleId;

    // Empty constructor
    public UserDto() {
    }

    // Constructor with parameters
    public UserDto(Long id, String email, String userName, String password, String roleId) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.roleId = roleId;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    public String getRolId() {
        return roleId;
    }

    public void setRolId(String roleId) {
        this.roleId = roleId;
    }

    // toString() method
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", user_name='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", id_rol='" + roleId + '\'' +
                '}';
    }
}
