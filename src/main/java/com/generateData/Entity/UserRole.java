package com.generateData.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserRoleId;
    private String UserRole,CreatedAt,UpdatedAt;

    public UserRole() {
    }

    public UserRole(Integer userId, String userRole, String createdAt, String updatedAt) {
        UserRoleId = userId;
        UserRole = userRole;
        CreatedAt = createdAt;
        UpdatedAt = updatedAt;
    }

    public Integer getUserRoleId() {
        return UserRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        UserRoleId = userRoleId;
    }

    public String getUserRole() {
        return UserRole;
    }

    public void setUserRole(String userRole) {
        UserRole = userRole;
    }

    public String getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        CreatedAt = createdAt;
    }

    public String getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        UpdatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "UserId=" + UserRoleId +
                ", UserRole='" + UserRole + '\'' +
                ", CreatedAt='" + CreatedAt + '\'' +
                ", UpdatedAt='" + UpdatedAt + '\'' +
                '}';
    }
}
