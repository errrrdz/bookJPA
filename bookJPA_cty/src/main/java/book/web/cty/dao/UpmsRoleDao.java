package book.web.cty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import book.web.cty.pojo.UpmsRole;
/**
 * upmsRole数据访问接口
 * @author Administrator
 *
 */
public interface UpmsRoleDao extends JpaRepository<UpmsRole,Long>,JpaSpecificationExecutor<UpmsRole>{
	
}
