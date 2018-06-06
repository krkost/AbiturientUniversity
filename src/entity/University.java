package entity;

public class University {
	private String universityName;
	public static Abiturient[] abiturients;

	// public University() {
	// universityName = "null";
	// for (int i = 0; i < abiturients.length; i++) {
	// abiturients[i] = new Abiturient();
	// }
	// }

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public void printAbiturients() {
		for (int i = 0; i < abiturients.length; i++) {
			abiturients[i].printAbiturient();
			System.out.println();
		}
	}

	public void printAbiturientsWithUnsatisfactoryMarks(double unsatisfactoryBoundaryValue) {
		int flagForNoAbiturientWithUnsatisfactoryMarks = 0;
		for (int i = 0; i < abiturients.length; i++) {
			for (int j = 0; j < abiturients[i].getMarks().length; j++) {
				if (abiturients[i].getMarks()[j] <= unsatisfactoryBoundaryValue) {
					abiturients[i].printAbiturient();
					flagForNoAbiturientWithUnsatisfactoryMarks++;
					break;
				}
			}
			System.out.println();
		}
		if (flagForNoAbiturientWithUnsatisfactoryMarks == 0) {
			System.out.println("There is no abiturients with unsatisfactory marks!");
		}
	}

	public void printAbiturientsWithHighThanSetSumOfMarks(double setHighSum) {
		System.out.println("Abiturients with sum of marks more than " + setHighSum + ":");
		for (int i = 0; i < abiturients.length; i++) {
			double sumOfMarks = 0;
			for (int j = 0; j < abiturients[i].getMarks().length; j++) {
				sumOfMarks = sumOfMarks + abiturients[i].getMarks()[j];
			}
			if (sumOfMarks >= setHighSum) {
				abiturients[i].printAbiturient();
				System.out.println("");
			}
		}
	}

	public void printAbiturientsWithHighestSumOfMarks(int numberOfAbiturients) {
		double[] sumsOfMarks = new double[abiturients.length];
		for (int i = 0; i < abiturients.length; i++) {
			for (int j = 0; j < abiturients[i].getMarks().length; j++) {
				sumsOfMarks[i] = sumsOfMarks[i] + abiturients[i].getMarks()[j];
			}
		}

		// sort abiturients by sum of their marks and put to another array
		Abiturient[] abTemp = abiturients;
		for (int i = 0; i < abiturients.length; i++) {
			for (int j = 0; j < abiturients.length - 1; j++) {
				if (sumsOfMarks[j] < sumsOfMarks[j + 1]) {
					double tmp = sumsOfMarks[j];
					sumsOfMarks[j] = sumsOfMarks[j + 1];
					sumsOfMarks[j + 1] = tmp;
					Abiturient ab = abTemp[j];
					abTemp[j] = abTemp[j + 1];
					abTemp[j + 1] = ab;
				}
			}
		}
		System.out.println(numberOfAbiturients + " abiturients with the highest sum of Marks:");
		int k = 0;
		while (k < numberOfAbiturients) {
			abTemp[k].printAbiturient();
			System.out.println("");
			k++;
		}

	}

}
