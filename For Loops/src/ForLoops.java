
public class ForLoops
	{

		public static void main(String[] args)
			{
				//challengeOne();
				//challengeTwo();
				//challengeThree();
				//challengeFour();
				challengeFive();
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
				// TODO Auto-generated method stub
				
			}

		private static void challengeSeven()
			{
				// TODO Auto-generated method stub
				
			}

		private static void challengeEight()
			{
				// TODO Auto-generated method stub
				
			}

	}
