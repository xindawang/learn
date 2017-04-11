package design_pattern.operation_factory;

public class Operation {
	private double _numberA = 0;
	private double _numberB = 0;
	
	public double getNumberA(){
		return _numberA;
	}
	
	public void setNumberA(double value){
		this._numberA = value;
	}
	
	public double getNumberB(){
		return _numberB;
	}
	
	public void setNumberB(double value){
		this._numberB = value;
	}
	
	public double GetResult(){
		double result = 0;
		return result;
	}
}

class OperationAdd extends Operation {
	public double GetResult(){
		double result =0;
		result = getNumberA() + getNumberB();
		return result;
	}
}

class OperationSub extends Operation {
	public double GetResult(){
		double result =0;
		result = getNumberA() - getNumberB();
		return result;
	}
}

class OperationMul extends Operation {
	public double GetResult(){
		double result =0;
		result = getNumberA() * getNumberB();
		return result;
	}
}

class OperationDiv extends Operation {
	public double GetResult(){
		double result =0;
		if (getNumberB()==0){
			try {
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		result = getNumberA() / getNumberB();
		return result;
	}
}