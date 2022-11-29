package co.com.poli.nearworkauto.models;

import lombok.*;

public class UserCreateRequest {
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private Long cellPhone;
    private String address;
    private String role;

    private static UserCreateRequest userCreateRequest;
    public UserCreateRequest(String email, String password, String name, String lastName, String documentType, String documentNumber, Long cellPhone, String address, String role) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.cellPhone = cellPhone;
        this.address = address;
        this.role = role;
    }

    public static UserCreateRequest getUserCreateRequest() {
        return userCreateRequest;
    }
    public static void setUserCreateRequest(UserCreateRequest userCreateRequest) {
        UserCreateRequest.userCreateRequest = userCreateRequest;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Long getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Long cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
