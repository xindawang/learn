package design_pattern.operation_factory;

public interface IFactory {
	Operation CreatOperation();
}

class AddFactory implements IFactory{
	@Override
	public Operation CreatOperation() {
		return new OperationAdd();
	}
}

class SubFactory implements IFactory{
	@Override
	public Operation CreatOperation() {
		return new OperationSub();
	}
}

class MulFactory implements IFactory{
	@Override
	public Operation CreatOperation() {
		return new OperationMul();
	}
}

class DivFactory implements IFactory{
	@Override
	public Operation CreatOperation() {
		return new OperationDiv();
	}
}
