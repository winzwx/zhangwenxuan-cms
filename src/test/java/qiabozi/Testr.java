package qiabozi;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zwx.xm.dao.VoteContentDao;

import com.zwx.xm.entity.VoteContent;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class Testr {
	@Autowired
	private VoteContentDao voteContentDao;
	@Test
	public void test1() {
		List<VoteContent> list = voteContentDao.select(new VoteContent());
		System.out.println(list);
	}
}
