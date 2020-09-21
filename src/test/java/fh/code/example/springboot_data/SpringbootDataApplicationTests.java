package fh.code.example.springboot_data;

import fh.code.example.mapper.ArticleMapper;
import fh.code.example.mapper.CommentMapper;
import fh.code.example.pojo.Address;
import fh.code.example.pojo.Article;
import fh.code.example.pojo.Comment;
import fh.code.example.pojo.Person;
import fh.code.example.repository.CommentRepository;
import fh.code.example.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDataApplicationTests {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    void contextLoads() {
        Comment comment = commentMapper.findById(1);
        System.out.println(comment);
    }


    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void xmlMybatis() {
        Article article = articleMapper.selectArticle(1);
        System.out.println(article);
    }

    // 测试整合JPA
    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void selectComment() {
        Optional<Comment> byId = commentRepository.findById(1);
        if (byId.isPresent()) {
        }
        System.out.println(byId.get());
    }

    // 测试整合redis
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void savePerson() {
        Person person = new Person();
        person.setFirstName("张");
        person.setLastName("三");

        Address address = new Address();
        address.setCity("新疆");
        address.setCountry("中国");
        person.setAddress(address);

        personRepository.save(person);
    }

    @Test
    public void selectPerson() {
        List<Person> list = personRepository.findByAddress_City("新疆");
        for (Person person : list) {
            System.out.println(person);
        }
    }

}
