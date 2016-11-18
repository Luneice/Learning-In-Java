//定义学生类Student.java，
//该类有学号、姓名和系部三个成员变量，
//并用get和set方法进行属性的封装，
//请参考类图进行编写。
public class Student {
	private String sno;
	private String name;
	private String part;

	//set student`s id
	public void setSno(String id) {
		this.sno = id;
	}
	//set student`s name
	public void setSname(String name) {
		this.name = name;
	}
	//set student`s part
	public void setSdept(String part) {
		this.part = part;
	}
	public String getSno() {
		// TODO Auto-generated method stub
		return this.sno;
	}
	public String getSname() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public String getSdept() {
		// TODO Auto-generated method stub
		return this.part;
	}


}
