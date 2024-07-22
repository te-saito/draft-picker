package org.example.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        // データベースのURL、ユーザー名、パスワードを指定
        String jdbcURL = "jdbc:mysql://localhost:3306/draft_picker";
        String username = "draftuser";  // 修正されたユーザー名
        String password = "yutanpo0302";

        try {
            // 必要に応じてドライバのロード
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 接続を確立
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("MySQLデータベースに接続成功！");

            // 接続を使用する処理をここに追加

            // 接続を閉じる
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL JDBCドライバがロードできませんでした。");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("MySQLデータベースへの接続に失敗しました。");
        }
    }
}
