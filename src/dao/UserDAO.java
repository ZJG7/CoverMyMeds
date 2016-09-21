package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dto.User;

public class UserDAO {

    public UserDAO() {

    }

//create
    public static boolean createUser(User user) {
        String insertTableSQL = "INSERT INTO users(id, username, password, email, created_at, updated_at) VALUES(?, ?, ?, ?, ?, ?);";

        Connection conn = null;
        PreparedStatement preparedStatement = null;
        boolean success = true;
        try {
            conn = new DatabaseUtil().Get_Connection();
            preparedStatement = conn.prepareStatement(insertTableSQL);
            Date date = new Date(0);
            preparedStatement.setString(1, user.getId());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setDate(5, date);
            preparedStatement.setDate(6, date);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            success = false;
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return success;
    }

//read
    public static User getUser(String id) {
        String usersql = "select * from users where id = '" + id + "'";
        Connection conn = null;
        Statement stmt = null;
        User curUser = new User();
        try {
            conn = new DatabaseUtil().Get_Connection();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(usersql);
            while (result.next()) {
                curUser.setUsername(result.getString("username"));
                curUser.setPassword(result.getString("password"));
                curUser.setEmail(result.getString("email"));
                curUser.setCreatedAt(result.getDate("created_at"));
                curUser.setUpdatedAt(result.getDate("updatedAt"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return curUser;
    }
//update

//destroy

//verify

//    public static Appuser verifyUser(String userName, String Password) {
//        String usersql = "select * from user where username = '" + userName
//                + "' && password = '" + Password + "'";
//        Connection conn = null;
//        Statement stmt = null;
//        Appuser curUser = new Appuser();
//        try {
//            conn = new DatabaseUtil().Get_Connection();
//            stmt = conn.createStatement();
//            ResultSet result = stmt.executeQuery(usersql);
//            while (result.next()) {
//                curUser.setUserName(result.getString("username"));
//                curUser.setEmail(result.getString("email"));
//                curUser.setPhoneNumber(result.getString("phoneNum"));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return curUser;
//    }
//
//    public static Appuser checkEmail(String email) {
//        String usersql = "select * from user where email = '" + email + "'";
//        Connection conn = null;
//        Statement stmt = null;
//        Appuser curUser = new Appuser();
//        try {
//            conn = new DatabaseUtil().Get_Connection();
//            stmt = conn.createStatement();
//            ResultSet result = stmt.executeQuery(usersql);
//            while (result.next()) {
//                curUser.setUserName(result.getString("username"));
//                curUser.setEmail(result.getString("email"));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return curUser;
//    }
//
//
//
//    public static boolean updateUser(Appuser user) {
//        String updateTableSQL = "UPDATE USER SET password = ? ,email=?,phoneNum=? WHERE USERNAME = ?";
//
//        Connection conn = null;
//        PreparedStatement preparedStatement = null;
//        boolean success = true;
//        try {
//            conn = new DatabaseUtil().Get_Connection();
//            preparedStatement = conn.prepareStatement(updateTableSQL);
//            preparedStatement.setString(1, user.getPassword());
//            preparedStatement.setString(2, user.getEmail());
//            preparedStatement.setString(3, user.getPhoneNumber());
//            preparedStatement.setString(4, user.getUserName());
//            preparedStatement.executeUpdate();
//
//        } catch (Exception e) {
//            success = false;
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                try {
//                    preparedStatement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return success;
//    }
//
//    public static boolean updateUserDate(String username, String email) {
//        String updateTableSQL = "UPDATE USER SET email= ? WHERE USERNAME = ?";
//
//        Connection conn = null;
//        PreparedStatement preparedStatement = null;
//        boolean success = true;
//        try {
//            conn = new DatabaseUtil().Get_Connection();
//            preparedStatement = conn.prepareStatement(updateTableSQL);
//            preparedStatement.setString(1, email);
//            preparedStatement.setString(2, username);
//            preparedStatement.executeUpdate();
//
//        } catch (Exception e) {
//            success = false;
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                try {
//                    preparedStatement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return success;
//    }
//
//    public static boolean delete(String userName) {
//        String deleteSQL = "DELETE from user WHERE userName = ?";
//        Connection conn = null;
//        PreparedStatement preparedStatement = null;
//        boolean success = true;
//        try {
//            conn = new DatabaseUtil().Get_Connection();
//            preparedStatement = conn.prepareStatement(deleteSQL);
//            preparedStatement.setString(1, userName);
//            preparedStatement.executeUpdate();
//
//        } catch (Exception e) {
//            success = false;
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                try {
//                    preparedStatement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return success;
//    }
}
