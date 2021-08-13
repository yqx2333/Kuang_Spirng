package com.yqx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author fanzx
 * @create 2021/8/13 14:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
// 等价于  <bean class="com.yqx.pojo.User" id="user" /> 但需要先配置扫描包扫描
@Component
public class User {

    // public String name = "于清晰";

    @Value("于清晰2333")
    public String name;

}
