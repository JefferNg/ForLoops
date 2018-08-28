import java.util.Scanner;
public class ForLoops
	{

		static int lowerBound;
		static int upperBound;
		static int total;
		
		public static void main(String[] args)
			{				
				//challengeOne();
				//challengeTwo();
				//challengeThree();
				//challengeFour();
				//challengeFive();
				challengeSix();
				challengeSeven();
				challengeEight();			

			}

		private static void challengeOne()
			{
				
				for(int i = 1; i <= 5; i++)
					{
						System.out.println(i);
					}
				
				
				
				
			}

		private static void challengeTwo()
			{
				
				for(int i = 2; i <= 10; i = i + 2)
					{
						System.out.println(i + ". I Love Mullen");
					}
				
				
				
				
			}

		private static void challengeThree()
			{
				for(int i = 1; i <= 5; i++)
					{
						System.out.print(i + " ");
					}
				
			}

		private static void challengeFour()
			{
				for(int i = 10; i > 0; i--)
					{
						System.out.println(i);
						try
							{
								Thread.sleep(1000);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				System.out.println("Liftoff!!!");
				
				
			}

		private static void challengeFive()
			{
				int total =	0;
				for(int i = 5; i <= 100; i = i + 5)
					{
						total += i;
						
						
					}
				System.out.println(total);
				
				
			}

		private static void challengeSix()
			{
				
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter a lowerbound number");
				lowerBound = userInput.nextInt();
				
				System.out.println("Enter an upperbound number");
				upperBound = userInput.nextInt();
				
				total = 0;
				
				for(int i = lowerBound; i <= upperBound; i++)
					{
						total += i;
					}
				
				System.out.println("The sum of all numbers between "+ lowerBound + " and " + upperBound + " is " + total);
				
				
				
				
			}

		private static void challengeSeven()
			{
				
				for(int i = lowerBound; i <= upperBound; i++)
					{
						
						if(i % 3 == 0)
							{
								total += i;
							}
						
						System.out.println(total);
						
					}
				
				
				
				
			}

		private static void challengeEight()
			{
				
			
			
			
				
			}

	}
