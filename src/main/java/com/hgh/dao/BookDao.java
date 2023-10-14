package com.hgh.dao;

import com.hgh.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    @Insert("insert  into t_article values(null,#{title},#{content})")
    public void save(Book book);

    @Update("update into t_article set title=#{title},content=#{content} where  id=#{id}")
    public void update(Book book);

    @Delete("delete from t_article where id = #{id}")
    public void delete(Integer id);

    @Select("select * from t_article where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from t_article")
    public List<Book> getAll();

}
