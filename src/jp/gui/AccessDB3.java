package jp.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccessDB3 {

	private static AccessDB3 instance;
	private Connection con;
	private String url;
	private String user;
	private String password;

	private AccessDB3() {
		url = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgrestest";
	}

	static synchronized AccessDB3 getInstance() {
		if(instance == null) {
			instance = new AccessDB3();
		}
		return instance;
	}

	public void connect() {
		try {
			con = DriverManager.getConnection(url,user,password);
			//System.out.println("データベースに接続しました");
			createTableIfNotExists();//テーブルが無かったら作る
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			con.close();
			System.out.println("データベース接続を閉じました");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private void createTableIfNotExists() {
		String sql = "create table if not exists CDmaxNumber (商品No最終履歴 INTEGER)";
		String sql2 = "SELECT COUNT(商品No最終履歴) FROM CDmaxNumber";
		String insert = "insert into CDmaxNumber values (0)";
		try (PreparedStatement pstmt = con.prepareStatement(sql);
				PreparedStatement pstmt2 = con.prepareStatement(sql2);
				) {
			pstmt.execute();
			ResultSet result =pstmt2.executeQuery();
			while(result .next()) {
				if(result.getInt(1)==0) {
					try(PreparedStatement pstmt3 = con.prepareStatement(insert)){
						pstmt3.execute();
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateNumber(CD cd) {

		//Insert文から新CD情報を受け取って新しく振り分けられた商品番号を番号管理のデータベースに格納する
		//連続追加を想定してCDクラスのカウンタを更新しておく。
		
		String sql = "update CDmaxNumber set  商品No最終履歴  = "+ cd.getItemNum();// +" where  商品No最終履歴 = " + num ;


		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.executeUpdate();
			CD.itemNumCounter++;
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int lastNumplus1() {
		
		int counter=1;  //初期値
		String sql ="select * from CDmaxNumber";
//現在の番号の最大値を獲得して＋１して最新の商品番号を返す
		try (PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet result = pstmt.executeQuery();) {

			while(result.next()) {
				counter = result.getInt(1)+1;
				return counter;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return counter;
	}

}
