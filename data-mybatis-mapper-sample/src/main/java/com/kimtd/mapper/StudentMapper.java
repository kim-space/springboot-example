package com.kimtd.mapper;

import com.kimtd.comm.MyMapper;
import com.kimtd.model.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;



@Mapper
public interface StudentMapper extends MyMapper<Student>{

    List<Student> likeName(String name);

    Student getById(int id);

    String getNameById(int id);

}
