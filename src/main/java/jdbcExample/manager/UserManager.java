package jdbcExample.manager;


import jdbcExample.db.DBConnectionProvider;
import jdbcExample.model.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserManager {
    private Connection connection;

    public UserManager() {
        try {
            connection = DBConnectionProvider.getInstance().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void addUser(User user) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "Insert into user (name ,surname ,email,password)Values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getSurname());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, user.getPassword());
        preparedStatement.executeUpdate();

        ResultSet resultSet = preparedStatement.getGeneratedKeys();

        if (resultSet.next()) {
            int id = resultSet.getInt(1);
            user.setId(id);
        }

    }

    public List<User> getAllUsers() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT* FROM user");
        List<User> users = new LinkedList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getNString("name"));
            user.setSurname(resultSet.getNString("surname"));
            user.setEmail(resultSet.getNString("email"));
            user.setName(resultSet.getNString("password"));
            users.add(user);

        }
        return users;
    }
    public void deleteUserById(int id ) throws SQLException{
        PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM user WHERE id=?");
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
    }
}
