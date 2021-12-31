package com.activeclub.core.usermanagement.bean.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author 59456
 * @Date 2021/9/7
 * @Descrip
 * @Version 1.0
 */
public class UserUpsertDto implements Serializable {
    private static final long serialVersionUID = -2021642129117119756L;

    @JsonIgnore
    private Long id;

    @JsonIgnore
    private Long flag;

    @NotBlank(message = "user code can't be null ! ")
    private String code;

    private String password;
    private String phoneNumber;
    private String identityNumber;

    private String name;
    private Short originType;
    private Short infoLevel;
    private String attributeJson;
    private String comment;

    @JsonIgnore
    private Date createTime;

    @JsonIgnore
    private Date updateTime;

    private String creator;
    private String modifier;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private String ext5;


}
