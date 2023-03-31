import java.util.regex.Pattern;

public class ClassValidate {
    private static final String CLASS_REGEX = "^[CAP]{1,}+[0-9]{4,}+[GHIKLM]{1,}$";
    public ClassValidate(){
    }
    public boolean validate(String regex){
        return Pattern.matches(CLASS_REGEX,regex);
    }
}
