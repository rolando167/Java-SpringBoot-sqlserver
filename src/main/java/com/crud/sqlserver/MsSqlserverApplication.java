package com.crud.sqlserver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.crud.sqlserver.models.Cards;

 

@SpringBootApplication
public class MsSqlserverApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(MsSqlserverApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		String sql  = "SELECT  * FROM spring.CARDS";
		List<Cards>  cards = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cards.class));
		cards.forEach(System.out :: println);
	}

}
