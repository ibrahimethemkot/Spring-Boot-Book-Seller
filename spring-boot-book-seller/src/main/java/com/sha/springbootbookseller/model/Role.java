package com.sha.springbootbookseller.model;

import lombok.Getter;
import lombok.Setter;

public enum Role {
    USER, //default rol olacak
    ADMIN, //CRUD işlemleri için rol
    SYSTEM_MANAGER // internal işlemler için rol
}