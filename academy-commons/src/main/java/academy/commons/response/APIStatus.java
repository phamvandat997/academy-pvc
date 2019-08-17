package academy.commons.response;

/**
 * @author DATVP.RC
 *
 */
public enum APIStatus {

	OK(200, "OK");
	private final int key;
	private final String value;

	APIStatus(int key, String value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

}
