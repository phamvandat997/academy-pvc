package academy.commons.repo;

import javax.transaction.Transactional;
import academy.commons.jpa.TblUsers;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author DATVP.RC
 *
 */
@Transactional
@Repository
public interface TblUserRepo extends CrudRepository<TblUsers,String>, JpaSpecificationExecutor<TblUsers>{

	@Query(value = "select p from tbl_users u where u.id = :userId")
	TblUsers findUserWithUserId(@Param("userId") String userId);
	
	
}
