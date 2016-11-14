

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.kidd.api.domain.User;
import com.kidd.api.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
@Transactional
@Rollback(value = false)
public class BaseTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testHessian(){
		User user = new User(null,"张三",1);
		userService.save(user);
	}
	
}
