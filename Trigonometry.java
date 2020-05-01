import java.util.*;
public class Trigonometry
{
	//different methods for different trigonometry operations
	void cosine(int a)
	{
		double val=Math.cos(a);
		System.out.println("cos("+a+") = "+val);
	}

	void sine(int a)
	{
		double val=Math.sin(a);
		System.out.println("sin("+a+") = "+val);
	}
	
	void tangent(int a)
	{
		double val=Math.tan(a);
		System.out.println("tan("+a+") = "+val);
	}

	//for sec, cosec and cot we will calculate sin,cos ,tan and use relation sin=1/cosec etc
	void sec(int a)
	{
		double val=Math.cos(a);
		double secval= 1/val;
		System.out.println("sec("+a+") = "+secval);
	}

	void cosec(int a)
	{
		double val=Math.sin(a);
		double cosecval= 1/val;
		System.out.println("cosec("+a+") = "+cosecval);
	}

	void cot(int a)
	{ 
		double val=Math.tan(a);
		double cotval= 1/val;
		System.out.println("cot("+a+") = "+cotval);
	}
}
	
