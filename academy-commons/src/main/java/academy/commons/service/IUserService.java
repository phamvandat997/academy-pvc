package academy.commons.service;

import academy.commons.jpa.TblUsers;

/**
 * @author DATVP.RC
 *
 */
public interface IUserService {

	// find one user by user id.
	public TblUsers getUserDetail(final String id);
}
