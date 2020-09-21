package fh.code.example.mapper;

import fh.code.example.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper  // 标记为mybatis 接口，
public interface CommentMapper {

    @Select("select * from t_comment where id =#{id}")
    public Comment findById(Integer id);
}
