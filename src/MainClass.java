//�ö�̬����ʵ�ֹ���
import java.util.Scanner;
public class MainClass {


	
	static int menu_select(Scanner scanner) {
		int menuchoice = -1;
		System.out.printf("\n");
		System.out.printf("\t\t\t  ѧ����Ϣ����ϵͳ���ܲ˵�		\n");
		System.out.printf("\t\t\t       ���ߣ�����			\n");
		System.out.printf("\t\t\t  =======================		\n");
		System.out.printf("\t\t\t  1.����ѧ����Ϣ��¼			\n");
		System.out.printf("\t\t\t  2.ɾ��ѧ����Ϣ��¼			\n");
		System.out.printf("\t\t\t  3.����ѧ����Ϣ��¼			\n");
		System.out.printf("\t\t\t  4.��ʾ����ѧ����Ϣ��¼		\n");
		System.out.printf("\t\t\t  5.��ѧ�Ų�ѯָ��ѧ����Ϣ		\n");
		System.out.printf("\t\t\t  0.��������				\n");
		System.out.printf("\t\t\t  =======================		\n");
		System.out.printf("\t\t\t����������ѡ��		\n");
		menuchoice = scanner.nextInt();
		return menuchoice;
	}

	/**
	 * ����ѧ����Ϣ
	 * @param stu
	 * @param scanner
	 */
	static void inputStudent(Student stu, Scanner scanner) {
		System.out.println("������ѧ����ѧ��:");
		stu.setSno(scanner.next());
		System.out.println("������ѧ��������:");
		stu.setSname(scanner.next());
		System.out.println("������ѧ����ϵ��:");
		stu.setSdept(scanner.next());
	}

	/**
	 * ����ѧ����Ϣ
	 * @param stu
	 * @param scanner
	 */
	static void updateStudent(Student stu, Scanner scanner) {
		System.out.println("������Ҫ���µ�ѧ��������:");
		stu.setSname(scanner.next());
		System.out.println("������Ҫ���µ�ѧ����ϵ��:");
		stu.setSdept(scanner.next());
	}

	/**
	 * ������
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
			// ����ѧ����Ϣ��¼
			case 1:
				Student newStu = new Student();
				inputStudent(newStu, scanner);
				studentDAOImpl.insertStudent(newStu);
				break;
				// ɾ��ѧ����Ϣ��¼
			case 2:
				System.out.println("������Ҫɾ��ѧ����Ϣ��ѧ�ţ�");
				sno = scanner.next();
				studentDAOImpl.deleteStudent(sno);
				break;
				// ����ѧ����Ϣ��¼
			case 3:
				System.out.println("������Ҫ����ѧ����Ϣ��ѧ�ţ�");
				sno = scanner.next();
				Student updateStu = studentDAOImpl.findStudentBySno(sno);
				if (updateStu != null) {
					System.out.println("Ҫ���µ�ѧ����Ϣ��ʾ����:");
					studentDAOImpl.displayStudentBySno(updateStu.getSno());
					updateStudent(updateStu, scanner);
					studentDAOImpl.updateStudent(updateStu);
				} else {
					System.out.println("Ҫ���µ�ѧ����Ϣ������!");
				}
				break;
				// ��ʾ����ѧ����Ϣ��¼
			case 4:
				studentDAOImpl.displayAllStudent();
				break;
				// ��ѧ�Ų�ѯָ��ѧ����Ϣ
			case 5:
				System.out.println("�������ѯѧ����Ϣ��ѧ�ţ�");
				sno = scanner.next();
				studentDAOImpl.displayStudentBySno(sno);
				break;
			case 0:
				
				break;
			default:
				System.out.println("�Բ���������Ĺ��ܱ���д�!����������!!!");
				break;
			}
		} while (menuChoice != 0);
		scanner.close();
	}
}
