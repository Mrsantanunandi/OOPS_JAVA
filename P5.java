
class P5 {
    public static void main(String[] args) {
        int i,j;
	int h = 5;
	System.out.println(h);
        for(i=1;i<=h;i++)
        {
	
		for(int sp = 1;sp<=h-i;sp++)
		{
			System.out.print(" ");
		}

            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
