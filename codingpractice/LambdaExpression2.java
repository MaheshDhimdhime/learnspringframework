package codingpractice;

import java.util.ArrayList;
import java.util.List;

//@FunctionalInterface
interface Finable{								//functional interface
	int deductFine(int a,int b);							//single abstarct method-.it has only only definintion doest not have declaration
}

public class LambdaExpression2 {
	public static void main(String[] args) {
		Finable fine=(int a,int b)->(a-b);{
			System.out.println(fine.deductFine(12,13));
			
		};
		
	List<String> mensList=new ArrayList<String>();
	mensList.add("Mahesh");
	mensList.add("Mahesh2");
	mensList.add("Mahesh");
	
	mensList.forEach(
			(names)->{
				System.out.println(names);
			});
	}
	List<LambdaExpression2> lambdaExpression2List=new ArrayList<LambdaExpression2>();

	
}
