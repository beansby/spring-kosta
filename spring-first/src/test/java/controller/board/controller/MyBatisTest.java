package controller.board.controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//classpath*:/config/*.xml
@ContextConfiguration(locations = {"file:src/main/resources/config/*.xml"})
public class MyBatisTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testFactory() throws Exception {
        System.out.println(">>>>>>>> sqlFactory 출력:"+sqlSessionFactory);

    }

    @Test
    public void testSession() throws Exception {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            System.out.println(">>>>>>>> session 출력:"+session);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}