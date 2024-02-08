package com.alana.cms.domain.vo;

import lombok.Data;
import com.alana.cms.domain.models.Role;

@Data
public class UserRequest {
    String identity;
    String name;
    Role role;

}
