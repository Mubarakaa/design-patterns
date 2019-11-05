package com.mb.design_patterns.behavorial.interpreter;

public class AndExpression implements Expression {
	
	private Expression terminal1 = null;
	private Expression terminal2 = null;

	public AndExpression(Expression terminal1, Expression terminal2) {
		this.terminal1 = terminal1;
		this.terminal2 = terminal2;
	}
	
	public boolean interpret(String context) {
		return terminal1.interpret(context) && terminal2.interpret(context);
	}

}
