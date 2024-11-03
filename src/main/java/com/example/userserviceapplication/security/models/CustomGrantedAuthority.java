package com.example.userserviceapplication.security.models;

import com.example.userserviceapplication.models.Role;
import org.springframework.security.core.GrantedAuthority;
public class CustomGrantedAuthority implements GrantedAuthority {
    private String authority;
    public CustomGrantedAuthority(Role role) {
        this.authority = role.getValue();
    }
    @Override
    public String getAuthority() {
        return authority;
    }
}