/**
 * 
 */
package edu.buffalo.cse715.parsing.expression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class GExpression extends Expression {

	private Expression expression;

	public GExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GExpression(Expression expression) {
		super();
		this.expression = expression;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

}
