//����ѧ����Student.java��
//������ѧ�š�������ϵ��������Ա������
//����get��set�����������Եķ�װ��
//��ο���ͼ���б�д��
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
