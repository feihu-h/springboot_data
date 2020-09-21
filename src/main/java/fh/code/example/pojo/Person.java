package fh.code.example.pojo;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;

/**
 * 进行redis 的整合测试使用
 */
@RedisHash("persons") //制定实体对象在redis 中的存储空间
@Data
public class Person {

    @Id //用来标识实体类主键
    private String id;
    @Indexed // 用来标识对应属性在redis 中生成二级索引
    private String firstName;
    @Indexed
    private String lastName;
    private Address address;
}
