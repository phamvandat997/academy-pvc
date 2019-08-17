package academy.commons.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import academy.commons.jpa.TblUsers;

/**
 * @author DATVP.RC
 *
 */
@Transactional
@Repository
public interface TblUserRepo extends CrudRepository<TblUsers, String>, JpaSpecificationExecutor<TblUsers> {

	// find user by user id
	@Query(value = "select u.* from TblUser u where u.id = :id")
	TblUsers findOneUser(@Param("id") String id);
}
