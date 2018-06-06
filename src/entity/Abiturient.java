//Abiturient: id, Фамилия, Имя, Адрес, Телефон, Оценки.
package entity;

import java.text.DecimalFormat;

public class Abiturient {
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private int phoneNumber;
	private double[] marks;

	public Abiturient() {
		id = 0;
		firstName = "null";
		lastName = "null";
		address = "null";
		phoneNumber = 0;
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
		}

	}

	public Abiturient(int id, String firstName, String lastName, String address, int phoneNumber, int marksCount) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.marks = createRandomMarks(marksCount);
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public double[] getMarks() {
		return marks;
	}

	public void printAbiturient() {
		System.out.println(this.id + " " + this.firstName + " " + this.getLastName() + " " + this.getAddress() + " "
				+ this.getPhoneNumber());
		for (int i = 0; i < marks.length; i++) {
			String formattedDouble = new DecimalFormat("#0.00").format(marks[i]);
			System.out.print(formattedDouble + ", ");
		}
		System.out.println();
	}

	public double[] createRandomMarks(int marksCount) {
		double[] marksArray = new double[marksCount];
		for (int i = 0; i < marksCount; i++) {
			marksArray[i] = Math.random() * 10;
		}
		return marksArray;
	}

}
