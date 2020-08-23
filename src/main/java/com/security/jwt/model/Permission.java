package com.security.jwt.model;

import lombok.Getter;

public enum Permission {
    DEVELOPERS_READ("developers:read"),
    DEVELOPERS_WRITE("developers:write");

    @Getter
    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }
}
