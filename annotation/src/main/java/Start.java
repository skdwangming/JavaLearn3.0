import java.lang.annotation.Annotation;

/**
 * @Classname Start
 * @Description TODO
 * @Date 2020/7/11 00:00
 * @Author wm
 */
public class Start implements Annotation {


    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
