package com.teddy924.api.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MemberPK implements Serializable {

    private String userId;
    private String userEmail;

}
