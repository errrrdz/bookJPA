package book.web.cty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import book.web.cty.pojo.User;
/**
 * user数据访问接口
 * @author Administrator
 *
 */
public interface UserDao extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>{
	
}
