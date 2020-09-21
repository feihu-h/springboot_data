package fh.code.example.repository;

import fh.code.example.pojo.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,String> {
    // 根据方法名构建查询条件
    List<Person> findByAddress_City(String name);

}


