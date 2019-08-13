package academy.commons.config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * @author DATVP.RC
 *
 */
public class CommonUtil {

	/**
	 * @return ID generator
	 */
	public static String generateUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * @param value
	 * @return password hash code
	 * @throws NoSuchAlgorithmException
	 */
	public static String MD5Encrypt(String value) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(value.getBytes());
		byte byteData[] = md.digest();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}
}
