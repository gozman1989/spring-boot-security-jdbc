package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity(name = "admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true, nullable = false, length = 200) @NotEmpty(message = "Please provide an e-mail")
    private String email;

    @Column(name = "password")
    private String password;
    @Column
    protected String phoneNumber;

    @Column(name = "first_name")
    @NotEmpty(message = "Please provide your first name")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Please provide your last name")
    private String lastName;

    @Column
    private Date registerDate;

    @Column(name = "session_token")
    private String sessionToken;

    @Column(name = "session_start_date")
    private Date sessionStartDate;

    @Column(name = "salt")
    private String salt;

    @OneToOne(cascade = CascadeType.DETACH,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "insertedBy")
    private Admin insertedBy;

    @Column(name = "active")
    private boolean active;

    @Column(name = "reset_token")
    private String resetToken;

    @Column(name = "reset_token_expiration_date")
    private Date resetTokenExpirationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Date getSessionStartDate() {
        return sessionStartDate;
    }

    public void setSessionStartDate(Date sessionStartDate) {
        this.sessionStartDate = sessionStartDate;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Admin getInsertedBy() {
        return insertedBy;
    }

    public void setInsertedBy(Admin insertedBy) {
        this.insertedBy = insertedBy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public Date getResetTokenExpirationDate() {
        return resetTokenExpirationDate;
    }

    public void setResetTokenExpirationDate(Date resetTokenExpirationDate) {
        this.resetTokenExpirationDate = resetTokenExpirationDate;
    }
}
