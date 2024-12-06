package com.sportcenter.dto;

public class RegisterUserRequest {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String ruolo;

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getRuolo() {
        return ruolo;
    }
    public String getUsername() {
        return username;
    }

    public Long getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
