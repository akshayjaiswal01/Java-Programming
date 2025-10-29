
public class Question 
{
	private int qno;
	private String qText;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	private int marks;
	
	
	public Question() 
	{
		super();
	}


	public Question(int qno, String qText, String opt1, String opt2, String opt3, String opt4, String ans, int marks) {
		super();
		this.qno = qno;
		this.qText = qText;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.marks = marks;
	}


	public int getQno() {
		return qno;
	}


	public void setQno(int qno) {
		this.qno = qno;
	}


	public String getqText() {
		return qText;
	}


	public void setqText(String qText) {
		this.qText = qText;
	}


	public String getOpt1() {
		return opt1;
	}


	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}


	public String getOpt2() {
		return opt2;
	}


	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}


	public String getOpt3() {
		return opt3;
	}


	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}


	public String getOpt4() {
		return opt4;
	}


	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}


	public String getAns() {
		return ans;
	}


	public void setAns(String ans) {
		this.ans = ans;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Question [qno=" + qno + ",\n qText=" + qText + ",\n opt1=" + opt1 + ",\n opt2=" + opt2 + ",\n opt3=" + opt3
				+ ",\n opt4=" + opt4 + ",\n ans=" + ans + ",\n marks=" + marks + "]";
	}
	
	
	
	
}
