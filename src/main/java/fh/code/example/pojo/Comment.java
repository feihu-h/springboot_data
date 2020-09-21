package fh.code.example.pojo;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity //一个实体
@Table(name = "t_comment") //对应表
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键自增
    private Integer id;
    private String content;
    private String author;
    @Column(name = "a_id")
    private Integer aId;// 外键，文章id
}
