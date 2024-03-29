// Generated from C:/devel/student_project/enkel/src/main/antlr\Enkel.g4 by ANTLR 4.7.2
package examples.enkel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnkelParser}.
 */
public interface EnkelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(EnkelParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(EnkelParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkelParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(EnkelParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(EnkelParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkelParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(EnkelParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(EnkelParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(EnkelParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(EnkelParser.ValueContext ctx);
}