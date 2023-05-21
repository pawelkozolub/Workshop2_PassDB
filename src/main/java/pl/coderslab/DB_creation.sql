-- commands to run in order to create database if it is not existing
-- run once if workshop2 database does not exists
CREATE DATABASE workshop2
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(60) NOT NULL
);