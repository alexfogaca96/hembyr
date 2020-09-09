package dev.alexfog;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class EntityModel {

  private final Collection<Field> fields;

  private EntityModel(final Collection<Field> fields) {
    this.fields = fields;
  }

  public static EntityModel empty() {
    return new EntityModel(List.of());
  }

  public static EntityModel filled(final Collection<Field> fields) {
    return new EntityModel(requireNonNull(fields));
  }

  public static EntityModel filled(final Field... fields) {
    return new EntityModel(Arrays.asList(fields));
  }

  public EntityModel add(final Field field) {
    this.fields.add(requireNonNull(field));
    return this;
  }

  public EntityModel addAll(final Collection<Field> fields) {
    this.fields.addAll(requireNonNull(fields));
    return this;
  }

  public EntityModel addAll(final Field... fields) {
    this.fields.addAll(Arrays.asList(fields));
    return this;
  }

  public Collection<Field> getFields() {
    return fields;
  }
}
