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
				System.out.println("删除成功！");
				break;
			}
			System.out.println("出现的位置是："+i);
		}
		System.out.println("输入的学号是"+sno);

	}

	public Student findStudentBySno(String sno) {
		// TODO Auto-generated method stub
		//判断是否包含此学生
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getSno().equals(sno) ) {
				return students.get(i);//返回这个对象
			}
		}
		return null;
	}

	public void displayStudentBySno(Object sno) {
		// TODO Auto-generated method stub

		if (students.size() > 0) {
			for (Student stu : students) {
				if (stu.getSno().equals(sno)) {
					System.out.println("学号: " + stu.getSno() + "\t姓名: "
							+ stu.getSname() + "\t系部: " + stu.getSdept());
				}
			}
		}else {
			System.out.println("数据库中无学生记录!");
		}
	}

	public void updateStudent(Student updateStu) {
		// TODO Auto-generated method stub

	}

	public void displayAllStudent() {
		// TODO Auto-generated method stub
		if (students.size() > 0) {
			for (Student stu : students) {
				System.out.println("学号: " + stu.getSno() + "\t姓名: "
						+ stu.getSname() + "\t系部: " + stu.getSdept());
			}
		}else {
			System.out.println("数据库中无学生记录!");
		}

	}

}
