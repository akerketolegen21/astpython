package Statements;
import java.beans.Expression;
import java.util.List;

public class IfStatement implements Statement {
    Expression condition;
    List<Statement> body;
    List<Statement> elsebody;

    public IfStatement(Expression cond, List<Statement> body, List<Statement> elsebody) {
        this.condition = cond;
        this.body = body;
        this.elsebody = elsebody;
    }
}
