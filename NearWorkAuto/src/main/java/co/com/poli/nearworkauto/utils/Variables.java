package co.com.poli.nearworkauto.utils;

public class Variables {

	public static String ENV_URL;

	public static void loadEnvironmentVariables() {
		if (System.getProperty("ENVURL") == null) {
			ENV_URL="http://localhost:8080";
		} else {
			ENV_URL = System.getProperty("ENVURL");
		}
	}

}
