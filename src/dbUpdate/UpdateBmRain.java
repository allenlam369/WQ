package dbUpdate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.BmRain;

public class UpdateBmRain {

	static Connection con; // for mssql
	static private EntityManager em = EntityManagerUtil.getEntityManager(); // for postgres

	public static void main(String[] args) throws SQLException {
		if (con == null) {
			con = ConnectMssql.getConnection();
		}

		String dbName = "bm_rain";
		getRowsFromMssql(dbName);

		con.close();
	}

	private static void getRowsFromMssql(String dbName) {
		try {
			if (con != null) {
				Statement stmt = con.createStatement();

				String SQL = "SELECT * FROM WPG." + dbName + " where sdatetime > '2021-04-01'";
				ResultSet rs = stmt.executeQuery(SQL);

				int count = 0;
				// Iterate through the data in the result set and process it.
				while (rs.next()) {
					int id = rs.getInt("id");

					// is this id existing in local postgres table?
					if (!isExist(id)) {
						BmRain br = new BmRain();
						br.setId(rs.getInt("id"));
						br.setBmvisitId(rs.getString("bmvisit_id"));
						br.setBeachCode(rs.getString("beach_code"));
						br.setSdatetime(rs.getTimestamp("sdatetime"));
						br.setRainStationCode(rs.getString("rain_station_code"));
						br.setRainfall(rs.getBigDecimal("rainfall"));
						br.setRainfallMax3hr(rs.getBigDecimal("rainfall_Max_3hr"));
						br.setRainfallMaxTime(rs.getTimestamp("rainfall_max_time"));
						br.setRainfallLast12hr(rs.getBigDecimal("rainfall_last_12hr"));
						br.setRainfallLast24hr(rs.getBigDecimal("rainfall_last_24hr"));
						br.setRainfallLast72hr(rs.getBigDecimal("rainfall_last_72hr"));
						br.setRiskRainMax3hr(rs.getString("risk_rain_max_3hr"));
						br.setRiskRainLast12hr(rs.getString("risk_rain_last_12hr"));
						br.setRiskRainLast24hr(rs.getString("risk_rain_last_24hr"));
						br.setRiskRainLast72hr(rs.getString("risk_rain_last_72hr"));
						br.setValidUser(rs.getString("valid_user"));
						br.setValidDate(rs.getTimestamp("valid_date"));
						br.setValidCode(rs.getBigDecimal("valid_code"));

						System.out.println("new " + br);

						count++;
					}

				} // while

				System.out.println(count + " rows fetched");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static boolean isExist(int id) {
		// TODO Auto-generated method stub

		em.getTransaction().begin();

		try {
			em.getTransaction().begin();
			@SuppressWarnings("unchecked")
			String hql = "from BmRain where id = :id";
			Query q = em.createQuery(hql);
			q.setParameter("id", id);
//			List<BmRain> list = q.getResultList();

			BmRain bm = (BmRain) q.getSingleResult();

			if (bm == null) {
				return false;
			} else {
				System.err.println("existing " + bm);
			}

//			em.getTransaction().commit();
		} catch (Exception e) {
//			em.getTransaction().rollback();
			e.printStackTrace();
		}

		return false;
	}

}
