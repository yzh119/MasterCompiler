package Master.Exception;

/**
 * Created by expye(Zihao Ye) on 2016/3/31.
 */
public class CompilationError extends Error {
    public CompilationError (String error) {
        super(error);
    }
}
