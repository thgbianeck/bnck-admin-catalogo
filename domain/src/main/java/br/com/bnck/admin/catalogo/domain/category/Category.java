package br.com.bnck.admin.catalogo.domain.category;

import java.time.Instant;
import java.util.Objects;

import br.com.bnck.admin.catalogo.domain.AggregateRoot;

public class Category extends AggregateRoot<CategoryID> {

   private String name;
   private String description;
   private boolean isActive;
   private Instant createdAt;
   private Instant updatedAt;
   private Instant deletedAt;

   private Category(
         final CategoryID anId,
         final String aName,
         final String aDescription,
         final boolean isActive,
         final Instant aCreatedAt,
         final Instant anUpdatedAt,
         final Instant aDeletedAt) {
      super(anId);
      this.name = aName;
      this.description = aDescription;
      this.isActive = isActive;
      this.createdAt = Objects.requireNonNull(aCreatedAt, "'createdAt' should not be null");
      this.updatedAt = Objects.requireNonNull(anUpdatedAt, "'updatedAt' should not be null");
      this.deletedAt = aDeletedAt;
   }

   public static Category newCategory(
         final String aName,
         final String aDescription,
         final boolean isActive) {
      final var id = CategoryID.unique();
      final var now = Instant.now();
      final var deletedAt = isActive ? null : now;
      return new Category(
            id,
            aName,
            aDescription,
            isActive,
            now,
            now,
            deletedAt);
   }

   public static Category with(
         final CategoryID anId,
         final String name,
         final String description,
         final boolean active,
         final Instant createdAt,
         final Instant updatedAt,
         final Instant deletedAt) {
      return new Category(
            anId,
            name,
            description,
            active,
            createdAt,
            updatedAt,
            deletedAt);
   }

   public static Category with(final Category aCategory) {
      return with(
            aCategory.getId(),
            aCategory.name,
            aCategory.description,
            aCategory.isActive(),
            aCategory.createdAt,
            aCategory.updatedAt,
            aCategory.deletedAt);
   }

   public String getName() {
      return name;
   }

   public String getDescription() {
      return description;
   }

   public boolean isActive() {
      return isActive;
   }

   public Instant getCreatedAt() {
      return createdAt;
   }

   public Instant getUpdatedAt() {
      return updatedAt;
   }

   public Instant getDeletedAt() {
      return deletedAt;
   }

}