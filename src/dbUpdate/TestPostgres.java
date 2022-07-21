package dbUpdate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TestPostgres {
	static private EntityManager em = EntityManagerUtil.getEntityManager(); // for postgres

	public static void main(String[] args) {
		String tableName = "BmRain";
		String idName = "id";
		if (isExist(tableName, idName, 1000)) {
			System.out.println("row exists");
		}

		else {
			System.out.println("row does not exist");
		}
	}

	private static boolean isExist(String tableName, String idName, int id) {
		try {
			em.getTransaction().begin();

			Query q = em.createQuery("SELECT e." + idName + " FROM " + tableName + " e WHERE e." + idName + " = :id");
			q.setParameter("id", id);
			@SuppressWarnings({ "rawtypes" })
			List list = q.getResultList();

			return !list.isEmpty();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
