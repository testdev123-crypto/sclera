package com.example.School;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "mypass123")) {
			System.out.println("Connection successful!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SpringApplication.run(SchoolApplication.class, args);
	}

}
