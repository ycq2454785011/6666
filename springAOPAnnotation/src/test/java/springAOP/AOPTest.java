package springAOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dzkj.biz.UserBiz;

public class AOPTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBiz ub = ac.getBean(UserBiz.class);
		ub.findAll();
		ub.delete(100);
		
	}
}
