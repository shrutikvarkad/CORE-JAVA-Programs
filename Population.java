class Population
{
	public static void main(String [] args)
	{
		long currentPopulation = 312032486;
		long sec5Year = 5*365*24*60*60;
		long birthYear = sec5Year/7;
		long deathYear = sec5Year/13;
		long imgrYear = sec5Year/45;
		long population5year = (currentPopulation + birthYear - deathYear + imgrYear);

		System.out.println(population5year);
	}
}
