package fh.code.example.pojo;

import lombok.Data;
import org.springframework.data.redis.core.index.Indexed;

/**
 * 进行redis 的整合测试使用
 */
@Data
public class Address {

    @Indexed
    private String city;
    @Indexed
    private String country;
}
