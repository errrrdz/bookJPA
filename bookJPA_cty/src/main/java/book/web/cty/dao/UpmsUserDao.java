package book.web.cty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import book.web.cty.pojo.UpmsUser;
/**
 * upmsUser数据访问接口
 * @author Administrator
 *
 */
public interface UpmsUserDao extends JpaRepository<UpmsUser,Long>,JpaSpecificationExecutor<UpmsUser>{
	
}
