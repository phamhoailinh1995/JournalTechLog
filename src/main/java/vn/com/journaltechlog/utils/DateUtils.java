package vn.com.journaltechlog.utils;

public class DateUtils {
	public static java.sql.Date getDateSQL(long date) {
		return new java.sql.Date(date);
	}
	public static java.util.Date getDateJava(long date) {
		return new java.util.Date(date);
	}
	public static long getTimeFromDateSQL(java.sql.Date dateSQL) {
		return dateSQL.getTime();
	}
	public static long getTimeFromDateJava(java.util.Date dateJava) {
		return dateJava.getTime();
	}
	public static java.util.Date convertDateSQLToDateJava(java.sql.Date dateSQL) {
		return getDateJava(getTimeFromDateSQL(dateSQL));
	}
	public static java.sql.Date convertDateJavaToDateSQL(java.util.Date dateJava) {
		return getDateSQL(getTimeFromDateJava(dateJava));
	}
}
