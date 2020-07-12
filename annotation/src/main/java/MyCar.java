/**
 * @Classname MyCar
 * @Description TODO
 * @Date 2020/7/11 10:36
 * @Author wm
 */
public class MyCar extends Car {

    public static void main(String[] args) {
        Class<MyCar> myCarClass = MyCar.class;
        boolean annotationPresent = myCarClass.isAnnotationPresent(Log.class);
        System.out.println(annotationPresent);

    }
}
