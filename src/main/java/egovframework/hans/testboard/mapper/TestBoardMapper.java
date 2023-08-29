package egovframework.hans.testboard.mapper;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.hans.testboard.model.TestBoardVO;

@Mapper("testBoardMapper")
public interface TestBoardMapper {
	public List<TestBoardVO> getTestBoardAllList() throws Exception;
	public TestBoardVO getTestBoardView(String seqno) throws Exception;
	public int insertTestBoard(TestBoardVO vo) throws Exception;
	public int updateTestBoard(TestBoardVO vo) throws Exception;
	public int deleteTestBoard(String seqno) throws Exception;
}
