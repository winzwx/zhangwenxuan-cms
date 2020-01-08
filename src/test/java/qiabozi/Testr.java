package qiabozi;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.zwx.xm.dao.Vote_ContentDao;
import com.zwx.xm.entity.Vote_Content;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class Testr {
	@Autowired
	private Vote_ContentDao vote_ContentDao;
	@Test
	public void test1() {
		List<Vote_Content> list = vote_ContentDao.select(new Vote_Content());
		System.out.println(list);
	}
}
