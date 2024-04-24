package alanna.salamander.core.exception;

/**
 * 框架基础异常类，所有自定义异常都应直接使用该异常类或者继承自该异常类。
 * @author alanna
 * @since 0.1
 */
@SuppressWarnings("unused")
public class ServiceException extends RuntimeException {

    public ServiceException() {
    }

    public ServiceException(String errorMsg) {
        super(errorMsg);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String errorMsg, Throwable cause) {
        super(errorMsg, cause);
    }
}
