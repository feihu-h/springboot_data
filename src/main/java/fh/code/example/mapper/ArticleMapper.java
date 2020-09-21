package fh.code.example.mapper;

import fh.code.example.pojo.Article;
import org.apache.ibatis.annotations.Mapper;


public interface ArticleMapper {
    // 根据id查找对应的文章
    public Article selectArticle(Integer id);
}
