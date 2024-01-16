package org.example;

import jakarta.persistence.*;

@Entity
@Table(name= "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "code_name")
    private String codeName;

    @Column(name = "phone_number")
    private String phoneNumber;

    // Constructors
    public Contact() {

    }

    public Contact(String fullName, String codeName, String phoneNumber) {
        this.fullName = fullName;
        this.codeName = codeName;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //toString method for debugging or logging

    @Override
    public String toString(){
        return "Contact{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", codeName='" + codeName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
