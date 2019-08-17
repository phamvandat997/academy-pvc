package academy.commons.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author DATVP.RC
 *
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestAPIResponse<T extends Object> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int status;
	private String message;
	private T data;

	public RestAPIResponse(APIStatus apiStatus, T content) {
		if (null == apiStatus) {
			throw new IllegalArgumentException("APIStatus not found");
		}
		this.status = apiStatus.getKey();
		this.message = apiStatus.getValue();
		this.data = content;
	}

	public RestAPIResponse(APIStatus apiStatus) {
		this.status = apiStatus.getKey();
		this.message = apiStatus.getValue();
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
}
