import java.lang.reflect.Field;

public class ModelConverter {

  public static EntityModel convert(final Class<?> clazz) {
    final Field[] declaredFields = clazz.getDeclaredFields();
    return EntityModel.filled(declaredFields);
  }
}
