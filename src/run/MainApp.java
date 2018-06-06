//Abiturient: id, Фамилия, Имя, Адрес, Телефон, Оценки.
//Создать массив объектов. Вывести:
//a) список абитуриентов, имеющих неудовлетворительные оценки;
//b) список абитуриентов, у которых сумма баллов выше заданной;
//c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов (вывести также полный список абитуриентов, имеющих полупроходную сумму).
package run;

import entity.Abiturient;
import entity.University;

public class MainApp {

	public static void main(String[] args) {
		University university = new University();
		university.setUniversityName("Yale");
		university.abiturients = new Abiturient[5];
		int marksCount = 5;
		university.abiturients[0] = new Abiturient(1, "Maria", "White", "2 ave NY", 123456, marksCount);
		university.abiturients[1] = new Abiturient(2, "Alice", "Black", "45 ave NY", 222456, marksCount);
		university.abiturients[2] = new Abiturient(3, "Sam", "Anderson", "33 ave NY", 654321, marksCount);
		university.abiturients[3] = new Abiturient(4, "John", "Smith", "22 ave NY", 333456, marksCount);
		university.abiturients[4] = new Abiturient(5, "David", "Doe", "3 ave NY", 444456, marksCount);
		
		double unsatisfactoryMark = 3;
		double setHighSum = 20;

		university.printAbiturients();
		//university.printAbiturientsWithUnsatisfactoryMarks(unsatisfactoryMark);
		//university.printAbiturientsWithHighThanSetSumOfMarks(setHighSum);
		university.printAbiturientsWithHighestSumOfMarks(2);
		

	}

}
