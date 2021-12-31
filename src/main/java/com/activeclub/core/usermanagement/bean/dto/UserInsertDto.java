package com.activeclub.core.usermanagement.bean.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Author 59456
 * @Date 2021/8/16
 * @Descrip
 * @Version 1.0
 */
public class UserInsertDto implements Serializable {
    private static final long serialVersionUID = -4483112152808987463L;

    @NotBlank(message = "user code can't be null ! ")
    private String code;

    @NotBlank(message = "user password can't be null ! ")
    private String password;

    @NotBlank(message = "user phoneNumber can't be null ! ")
    private String phoneNumber;

    @NotBlank(message = "user identityNumber can't be null ! ")
    private String identityNumber;

    @NotBlank(message = "user name can't be null ! ")
    private String name;

    private Short originType;
    private Short infoLevel;
    private String attributeJson;
    private String comment;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private String ext5;
}
