package com.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrghisInfoDto implements Serializable {
    private String code;
    private String name;
    private String timestamp;

}
