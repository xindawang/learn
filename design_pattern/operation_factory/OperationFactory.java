package design_pattern.operation_factory;

public class OperationFactory {
	public static Operation createOperate(String operate){
		Operation oper = null;
		switch (operate){
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
	
	public static void main(String [] args){
		
//		simple factory pattern
//		Operation oper;
//		oper = OperationFactory.createOperate("+");
		
//		class factory applied
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.CreatOperation();
		
		oper.setNumberA(6);
		oper.setNumberB(2);
		System.out.println(oper.GetResult());
	}
}
