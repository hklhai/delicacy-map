package cn.edu.ncut.food.model.base;

/**
 * Created by Ocean Lin on 2018/11/12.
 *
 * @author Lin
 */
public class Message {

    private int code;
    private String message;
    private boolean success;

    public Message() {
    }

    public Message(int code, String message) {
        this.code = code;
        this.message = message;
        this.success = true;
    }

    public Message(int code, String message, boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
