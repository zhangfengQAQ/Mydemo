package com.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MapperTest {
    @Test
    public void testM(){
      SqlSession sqlSession= myBatisOne.getSqlSession();
        PersonsMapper personsMapper=sqlSession.getMapper(PersonsMapper.class);
        List<Persons> persons=personsMapper.getPersons();
        System.out.println(persons.toString());
    }
}
