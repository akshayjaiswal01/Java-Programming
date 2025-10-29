import java.util.Arrays;

public class Test 
{
	private int tid;
	private String subname;
	private String date;
	Question [] qlist;
	
	
	public Test() 
	{
		super();
	}


	public Test(int tid, String subname, String date, Question[] qlist) 
	{
		super();
		this.tid = tid;
		this.subname = subname;
		this.date = date;
		this.qlist = qlist;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getSubname() {
		return subname;
	}


	public void setSubname(String subname) {
		this.subname = subname;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Question[] getQlist() {
		return qlist;
	}


	public void setQlist(Question[] qlist) {
		this.qlist = qlist;
	}


	@Override
	public String toString() {
		return "Test [tid=" + tid + ", subname=" + subname + ", date=" + date + ", qlist=" + Arrays.toString(qlist)
				+ "]";
	}
	
	
	
	
	
	
}
