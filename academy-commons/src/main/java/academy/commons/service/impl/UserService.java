package academy.commons.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academy.commons.jpa.TblUsers;
import academy.commons.repo.TblUserRepo;
import academy.commons.service.IUserService;

/**
 * @author DATVP.RC
 *
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private TblUserRepo userRepo;

	@Override
	public TblUsers getUserDetail(String id) {
		return userRepo.findOneUser(id);
	}

}
