package dev.alexfog;

import dev.alexfog.entities.SimpleEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;

class ModelConverterTest {

  @Test
  void convert() {
    final Class<SimpleEntity> entityClass = SimpleEntity.class;
    final EntityModel model = ModelConverter.convert(entityClass);
    Assertions.assertEquals(model.getFields(), asList(entityClass.getDeclaredFields()));
  }
}
