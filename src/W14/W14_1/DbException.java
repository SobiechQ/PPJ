package W14.W14_1;

public class DbException extends Exception{
    public String errorMessage;
    DbException(String input){
        this.errorMessage=input;
    }
    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}
