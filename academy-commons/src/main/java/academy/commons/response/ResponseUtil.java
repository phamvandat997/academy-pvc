package academy.commons.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author DATVP.RC
 *
 */
@Component
public class ResponseUtil {

	/**
	 * @param apiStatus
	 * @param data
	 * @return
	 */
	public RestAPIResponse<Object> _createResponse(APIStatus apiStatus, Object data) {
		return new RestAPIResponse<>(apiStatus, data);
	}

	/**
	 * @param apiStatus
	 * @param data
	 * @param httpStatus
	 * @return
	 */
	public ResponseEntity<RestAPIResponse<Object>> _buildResponse(APIStatus apiStatus, Object data,
			HttpStatus httpStatus) {
		return new ResponseEntity<RestAPIResponse<Object>>(_createResponse(apiStatus, data), httpStatus);
	}

	/**
	 * @param data
	 * @return
	 */
	public ResponseEntity<RestAPIResponse<Object>> ok(Object data) {
		return _buildResponse(APIStatus.OK, data, HttpStatus.OK);
	}
}
