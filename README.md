# Workshop2_PassDB

An example of an object-oriented data access layer as the UserDao class to perform operations on the database. 

Data to be stored in a database called workshop2 in a table called users containing the following columns:

```
+------------------+--------------+------+-----+---------+----------------+
| Field            | Type         | Null | Key | Default | Extra          |
+------------------+--------------+------+-----+---------+----------------+
| id               | int(11)      | NO   | PRI | NULL    | auto_increment |
| email            | varchar(255) | NO   | UNI | NULL    |                |
| username         | varchar(255) | NO   |     | NULL    |                |
| password         | varchar(60)  | NO   |     | NULL    |                |
+------------------+--------------+------+-----+---------+----------------+
```