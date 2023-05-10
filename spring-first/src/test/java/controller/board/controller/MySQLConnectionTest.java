package controller.board.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.sql.Connection;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/resources/config/*.xml"})
public class MySQLConnectionTest {

    @Autowired
    private DataSource ds;

    @Test
    public void testConnection() throws Exception {
        try (Connection conn = ds.getConnection()) {
            System.out.println(">>>>>>>>>>> Connection 출력 : "+conn);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}