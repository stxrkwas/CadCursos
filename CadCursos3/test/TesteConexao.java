/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import conexao.Conexao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.sql.*;

/**
 *
 * @author Malu Passo Silva
 */
public class TesteConexao {
    

    public TesteConexao() {
    }
    
    @Test
    public void testConecta() {
        Conexao conexao = new Conexao();
        assertTrue(conexao.conecta());
    }

    @Test
    public void testDesconecta() {
        Conexao conexao = new Conexao();
        conexao.conecta();
        conexao.desconecta();
        // Optionally, verify that the connection is closed using a mock or reflection
    }

    @Test
    public void testExecutaSQL() {
        Conexao conexao = new Conexao();
        conexao.conecta();
        String sql = "SELECT * FROM tbl_usuario";
        conexao.executaSQL(sql);
        // Optionally, verify that the resultset contains expected data
        conexao.desconecta();
    }
    
    /*@BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }*/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
