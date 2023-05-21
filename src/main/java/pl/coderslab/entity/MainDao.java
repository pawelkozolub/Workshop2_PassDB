package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        String[] usernameList = {"User.1", "User.2", "User.3", "User.4"};
        User[] userList = new User[usernameList.length];    // null elements

        for (int i = 0; i < userList.length; i++) {
            userList[i] = new User();
            userList[i].setUsername(usernameList[i]);
            userList[i].setEmail(usernameList[i] + "@email.com");
            userList[i].setPassword(usernameList[i] + "pass");
        }

        System.out.println("\nUsers class objects:  (id=0 - since not assigned in DB | password non-hashed)");
        for (User user : userList) {
            System.out.println(user.toString());
        }

        // false - since run only once to put user object attributes into database
        if (false) {
            for (User user : userList) {
                userDao.create(user);
            }
        }

        //User user = userDao.read(userId);
        System.out.println("\nUsers attributes from database:  (unique id | password hashed)");
        System.out.println(userDao.read(4).toString());
        System.out.println(userDao.read(5).toString());
        System.out.println(userDao.read(6).toString());
        System.out.println(userDao.read(7).toString());

        // to delete > userDao.delete(userId)
        userDao.delete(0);

        // user import and update
        User userToUpdate = userDao.read(5);
        userToUpdate.setUsername("NewUser.2");
        userToUpdate.setEmail("newuser2@email.com");
        userToUpdate.setPassword("pass");
        userDao.update(userToUpdate);

        System.out.println("\nUsers attributes after user update:");
        System.out.println(userDao.read(4).toString());
        System.out.println(userDao.read(5).toString());
        System.out.println(userDao.read(6).toString());
        System.out.println(userDao.read(7).toString());

        System.out.println("\nfindAll method to show all users in database:");
        User[] allUsers = userDao.findAll();
        for (User user : allUsers) {
            System.out.println(user.toString());
        }
    }
}
