package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DbUtil.connect()) {
            System.out.println("Connected to database workshop2...");
        } catch (SQLException e) {
            System.out.println("Exception occurred...");
            e.printStackTrace();
        }

        // UserDao methods tested in MainDao class in entity package
    }
}