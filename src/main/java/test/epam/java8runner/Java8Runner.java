package test.epam.java8runner;

import test.epam.java8.Task01LambdaExp;
import test.epam.java8.Task02Predicates;
import test.epam.java8.Task03FunctionInterface;
import test.epam.java8.Task04ConsumerSupplier;
import test.epam.java8.Task05BiFunction;
import test.epam.java8.Task06PremitiveInterfaces;
import test.epam.java8.Task07ConstructorReference;
import test.epam.java8.Task09DateTime;

public class Java8Runner {

	public static void main(String[] args) {

		Task03FunctionInterface.mainTask03functionOperator();
		Task02Predicates.mainTask02Predicates();
		Task01LambdaExp.mainTask01LambdaExp();
		Task04ConsumerSupplier.mainTask04ConsumerSupplier();
		Task05BiFunction.mainTask05BiFunction();
		Task06PremitiveInterfaces.mainPremitiveInterfaces(2);
		Task07ConstructorReference.mainConstructorReferenceTest();
		Task09DateTime.mainTask09DateTime();
	}
}