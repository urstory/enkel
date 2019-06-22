// Generated from C:/devel/student_project/enkel/src/main/antlr\Enkel.g4 by ANTLR 4.7.2
package examples.enkel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnkelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnkelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnkelParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(EnkelParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkelParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(EnkelParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkelParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(EnkelParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnkelParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(EnkelParser.ValueContext ctx);
}