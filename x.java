class a
{
	public static void main(String x[]) {
		int y=1,h = 1;
		for(int i = 0;i<400;i++)
		{
			for(int j=0;j<3;j++)
			{
				i = i + 40;
				System.out.println("mom"+y);
				y++;
			}
			System.out.println("hello"+h);
			h++;
		}
/*
		i=0
		i<400
			j=0
			j<3
				i=40
				mom1
			j=1
			j<3
				i=80
				mom2
			j=2
			j<3
				i=120
				mom3
			j=3
			j<3
			hello1
		i=121
		i<400
			j=0
			j<3
				i=161
				mom1
			j=1
			j<3
				i=201
				mom2
			j=2
			j<3
				i=241
				mom3
			j=3
			j<3
			hello2
		i=242
		i<400	*/
						
		
	}
}