/**
 * 
 */
package Ques01;

import java.time.LocalDate;

/**
 * 
 */
public class Program {
	public static void main(String[] args) {
// add Value Department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Sale Hà Nội";

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Marketing";

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Business assistant";

		Department dep4 = new Department();
		dep4.id = 4;
		dep4.name = "Sale Hải Phòng";

		Department dep5 = new Department();
		dep5.id = 5;
		dep5.name = "Business assistant Hải Phòng";

		Department dep6 = new Department();
		dep6.id = 6;
		dep6.name = "Sale Thái Bình";

		Department dep7 = new Department();
		dep7.id = 7;
		dep7.name = "Business assistant Thái Bình";

//add value Positon

		Position pos1 = new Position();
		pos1.id = 111;
		pos1.name = PositionName.DEV;

		Position pos2 = new Position();
		pos2.id = 112;
		pos2.name = PositionName.PM;

		Position pos3 = new Position();
		pos3.id = 113;
		pos3.name = PositionName.SCRUM_MASTER;

		Position pos4 = new Position();
		pos4.id = 114;
		pos4.name = PositionName.DEV;

		Position pos5 = new Position();
		pos5.id = 115;
		pos5.name = PositionName.TEST;

		Position pos6 = new Position();
		pos6.id = 116;
		pos6.name = PositionName.TEST;
// add value Account
		Account acc1 = new Account();
		acc1.id = 11;
		acc1.email = "a11@gmail.com";
		acc1.userName = "a11u";
		acc1.fullName = "Hoàng Văn A11";
		acc1.depID = dep1;
		acc1.positionID = pos2;
		acc1.createDate = LocalDate.of(2023, 11, 24);

		Account acc2 = new Account();
		acc2.id = 12;
		acc2.email = "a12@gmail.com";
		acc2.userName = "a12u";
		acc2.fullName = "Hoàng Văn A12";
		acc2.depID = dep1;
		acc2.positionID = pos3;
		acc2.createDate = LocalDate.of(2022, 07, 27);

		Account acc3 = new Account();
		acc3.id = 13;
		acc3.email = "a13@gmail.com";
		acc3.userName = "a13u";
		acc3.fullName = "Hoàng Văn A13";
		acc3.depID = dep3;
		acc3.positionID = pos4;
		acc3.createDate = LocalDate.of(2022, 05, 22);

		Account acc4 = new Account();
		acc4.id = 14;
		acc4.email = "a14@gmail.com";
		acc4.userName = "a14u";
		acc4.fullName = "Hoàng Văn A14";
		acc4.depID = dep2;
		acc4.positionID = pos5;
		acc4.createDate = LocalDate.of(2022, 05, 24);

		Account acc5 = new Account();
		acc5.id = 15;
		acc5.email = "a15@gmail.com";
		acc5.userName = "a15u";
		acc5.fullName = "Hoàng Văn A15";
		acc5.depID = dep2;
		acc5.positionID = pos6;
		acc5.createDate = LocalDate.of(2022, 10, 8);

		Account acc6 = new Account();
		acc6.id = 16;
		acc6.email = "a16@gmail.com";
		acc6.userName = "a16u";
		acc6.fullName = "Hoàng Văn A16";
		acc6.depID = dep3;
		acc6.positionID = pos1;
		acc6.createDate = LocalDate.of(2022, 9, 24);

// add value Group
		Group gr1 = new Group();
		gr1.id = 1111;
		gr1.name = "DEV";
		gr1.creatorID = acc1.id;
		gr1.createDate = LocalDate.of(2022, 10, 6);

		Group gr2 = new Group();
		gr2.id = 1112;
		gr2.name = "SCRUM_MASTER";
		gr2.creatorID = acc4.id;
		gr2.createDate = LocalDate.of(2022, 7, 5);

		Group gr3 = new Group();
		gr3.id = 1113;
		gr3.name = "TEST";
		gr3.creatorID = acc6.id;
		gr3.createDate = LocalDate.of(2022, 8, 4);

// add value GroupAccount
		GroupAccount gracc1 = new GroupAccount();
		gracc1.id = 11111;
		gracc1.accountId = acc1.id;
		gracc1.joinDate = LocalDate.of(2022, 11, 10);

		GroupAccount gracc2 = new GroupAccount();
		gracc2.id = 11112;
		gracc2.accountId = acc2.id;
		gracc2.joinDate = LocalDate.of(2022, 11, 10);

		GroupAccount gracc3 = new GroupAccount();
		gracc3.id = 11113;
		gracc3.accountId = acc3.id;
		gracc3.joinDate = LocalDate.of(2022, 11, 10);

		GroupAccount gracc4 = new GroupAccount();
		gracc4.id = 11114;
		gracc4.accountId = acc4.id;
		gracc4.joinDate = LocalDate.of(2022, 11, 10);

		GroupAccount gracc5 = new GroupAccount();
		gracc5.id = 11115;
		gracc5.accountId = acc5.id;
		gracc5.joinDate = LocalDate.of(2022, 11, 10);

		GroupAccount gracc6 = new GroupAccount();
		gracc6.id = 11116;
		gracc6.accountId = acc6.id;
		gracc6.joinDate = LocalDate.of(2022, 11, 10);

//add value TypeQuestion
		TypeQuestion tq1 = new TypeQuestion();
		tq1.id = 111111111;
		tq1.name = TypeQuesName.ESSAY;

		TypeQuestion tq2 = new TypeQuestion();
		tq2.id = 111111112;
		tq2.name = TypeQuesName.MULTIPLE_CHOICE;

		TypeQuestion tq3 = new TypeQuestion();
		tq3.id = 111111113;
		tq3.name = TypeQuesName.ESSAY;
// In ra gía trị

		System.out.println("ID cua Account so 1: " + acc1.id);
		System.out.println("Ten cua Department thu 2: " + dep2.name);
		System.out.println("ID cua Position thu 2: " + pos2.id);
		System.out.println("Ten cua group thu 1: " + gr1.name);
		System.out.println("ID cua group account thu 1: " + gracc1.id);
		System.out.println("Type question cua cau hoi thu 3: " + tq3.name);

	}

}
