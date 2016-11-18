//用动态数组实现管理
import java.util.Scanner;
public class MainClass {


	
	static int menu_select(Scanner scanner) {
		int menuchoice = -1;
		System.out.printf("\n");
		System.out.printf("\t\t\t  学生信息管理系统功能菜单		\n");
		System.out.printf("\t\t\t       作者：齐心			\n");
		System.out.printf("\t\t\t  =======================		\n");
		System.out.printf("\t\t\t  1.插入学生信息记录			\n");
		System.out.printf("\t\t\t  2.删除学生信息记录			\n");
		System.out.printf("\t\t\t  3.更新学生信息记录			\n");
		System.out.printf("\t\t\t  4.显示所有学生信息记录		\n");
		System.out.printf("\t\t\t  5.按学号查询指定学生信息		\n");
		System.out.printf("\t\t\t  0.结束程序				\n");
		System.out.printf("\t\t\t  =======================		\n");
		System.out.printf("\t\t\t请输入您的选择：		\n");
		menuchoice = scanner.nextInt();
		return menuchoice;
	}

	/**
	 * 输入学生信息
	 * @param stu
	 * @param scanner
	 */
	static void inputStudent(Student stu, Scanner scanner) {
		System.out.println("请输入学生的学号:");
		stu.setSno(scanner.next());
		System.out.println("请输入学生的姓名:");
		stu.setSname(scanner.next());
		System.out.println("请输入学生的系部:");
		stu.setSdept(scanner.next());
	}

	/**
	 * 更新学生信息
	 * @param stu
	 * @param scanner
	 */
	static void updateStudent(Student stu, Scanner scanner) {
		System.out.println("请输入要更新的学生的姓名:");
		stu.setSname(scanner.next());
		System.out.println("请输入要更新的学生的系部:");
		stu.setSdept(scanner.next());
	}

	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		String sno;
		int menuChoice;
		Scanner scanner = new Scanner(System.in);
		StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
		do {
			menuChoice = menu_select(scanner);
			switch (menuChoice) {
			// 插入学生信息记录
			case 1:
				Student newStu = new Student();
				inputStudent(newStu, scanner);
				studentDAOImpl.insertStudent(newStu);
				break;
				// 删除学生信息记录
			case 2:
				System.out.println("请输入要删除学生信息的学号：");
				sno = scanner.next();
				studentDAOImpl.deleteStudent(sno);
				break;
				// 更新学生信息记录
			case 3:
				System.out.println("请输入要更新学生信息的学号：");
				sno = scanner.next();
				Student updateStu = studentDAOImpl.findStudentBySno(sno);
				if (updateStu != null) {
					System.out.println("要更新的学生信息显示如下:");
					studentDAOImpl.displayStudentBySno(updateStu.getSno());
					updateStudent(updateStu, scanner);
					studentDAOImpl.updateStudent(updateStu);
				} else {
					System.out.println("要更新的学生信息不存在!");
				}
				break;
				// 显示所有学生信息记录
			case 4:
				studentDAOImpl.displayAllStudent();
				break;
				// 按学号查询指定学生信息
			case 5:
				System.out.println("请输入查询学生信息的学号：");
				sno = scanner.next();
				studentDAOImpl.displayStudentBySno(sno);
				break;
			case 0:
				
				break;
			default:
				System.out.println("对不起，您输入的功能编号有错!请重新输入!!!");
				break;
			}
		} while (menuChoice != 0);
		scanner.close();
	}
}
