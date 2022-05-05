package com.generateData.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ContactId;
    private String FirstName,LastName,AddressStreet,AddressCity,AddressState,AddressZip,CreateAt,UpdateAt;

    public Contact() {
    }


    public Contact(Integer contactId, String firstName, String lastName, String addressStreet, String addressCity, String addressState, String addressZip, String createAt, String updateAt) {
        ContactId = contactId;
        FirstName = firstName;
        LastName = lastName;
        AddressStreet = addressStreet;
        AddressCity = addressCity;
        AddressState = addressState;
        AddressZip = addressZip;
        CreateAt = createAt;
        UpdateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "ContactId=" + ContactId +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", AddressStreet='" + AddressStreet + '\'' +
                ", AddressCity='" + AddressCity + '\'' +
                ", AddressState='" + AddressState + '\'' +
                ", AddressZip='" + AddressZip + '\'' +
                ", CreateAt='" + CreateAt + '\'' +
                ", UpdateAt='" + UpdateAt + '\'' +
                '}';
    }

    public Integer getContactId() {
        return ContactId;
    }

    public void setContactId(Integer contactId) {
        ContactId = contactId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddressStreet() {
        return AddressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        AddressStreet = addressStreet;
    }

    public String getAddressCity() {
        return AddressCity;
    }

    public void setAddressCity(String addressCity) {
        AddressCity = addressCity;
    }

    public String getAddressState() {
        return AddressState;
    }

    public void setAddressState(String addressState) {
        AddressState = addressState;
    }

    public String getAddressZip() {
        return AddressZip;
    }

    public void setAddressZip(String addressZip) {
        AddressZip = addressZip;
    }

    public String getCreateAt() {
        return CreateAt;
    }

    public void setCreateAt(String createAt) {
        CreateAt = createAt;
    }

    public String getUpdateAt() {
        return UpdateAt;
    }

    public void setUpdateAt(String updateAt) {
        UpdateAt = updateAt;
    }
}
