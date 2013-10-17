public double calc(double a, String operator, double b) {
	double res 0.0;
	switch(operator) {
		case "+": 
			res = a + b;
			break;
		case "-":
			res = a - b;
			break;
		case "*":
			res = a * b;
			break;
		case "/":
			res = a / b;
			break;
		case "^":
			res = a * a;
			break;
		case "%":
			res = a % b;
			break;
		case "sin":
			res = Math.sin(a);
			break;
		case "cos":
			res = Math.cos(a);
			break;
		case "tan":
			res = Math.tan(a);
			break;
		default:
			r = Double.NaN;
			break;
	}
	return res;
}