import java.util.ArrayList;


public class StudentDAOImpl {


	static ArrayList<Student> students = new ArrayList<Student>();


	public void insertStudent(Student newStu) {
		// TODO Auto-generated method stub
		students.add(newStu);
	}

	public void deleteStudent(String sno) {

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getSno().equals(sno) ) {
				students.remove(i);
				System.out.println("ɾ���ɹ���");
				break;
			}
			System.out.println("���ֵ�λ���ǣ�"+i);
		}
		System.out.println("�����ѧ����"+sno);

	}

	public Student findStudentBySno(String sno) {
		// TODO Auto-generated method stub
		//�ж��Ƿ������ѧ��
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getSno().equals(sno) ) {
				return students.get(i);//�����������
			}
		}
		return null;
	}

	public void displayStudentBySno(Object sno) {
		// TODO Auto-generated method stub

		if (students.size() > 0) {
			for (Student stu : students) {
				if (stu.getSno().equals(sno)) {
					System.out.println("ѧ��: " + stu.getSno() + "\t����: "
							+ stu.getSname() + "\tϵ��: " + stu.getSdept());
				}
			}
		}else {
			System.out.println("���ݿ�����ѧ����¼!");
		}
	}

	public void updateStudent(Student updateStu) {
		// TODO Auto-generated method stub

	}

	public void displayAllStudent() {
		// TODO Auto-generated method stub
		if (students.size() > 0) {
			for (Student stu : students) {
				System.out.println("ѧ��: " + stu.getSno() + "\t����: "
						+ stu.getSname() + "\tϵ��: " + stu.getSdept());
			}
		}else {
			System.out.println("���ݿ�����ѧ����¼!");
		}

	}

}
