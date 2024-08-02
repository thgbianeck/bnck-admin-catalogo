package br.com.bnck.admin.catalogo.domain.category;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("CategoryTest")
class CategoryTest {

    @Test
    @DisplayName("given a valid params when call new category then instantiate a category")
    void givenAValidParams_whenCallNewCategory_thenInstantiateACategory() {
        final var expectedName = "Filmes";
        final var expectedDescription = "A categoria mais assistida";
        final var expectedIsActive = true;

        final var actualCategory = Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        Assertions.assertNotNull(actualCategory);
        Assertions.assertNotNull(actualCategory.getId());
        Assertions.assertEquals(expectedName, actualCategory.getName());
        Assertions.assertEquals(expectedDescription, actualCategory.getDescription());
        Assertions.assertEquals(expectedIsActive, actualCategory.isActive());
        Assertions.assertNotNull(actualCategory.getCreatedAt());
        Assertions.assertNotNull(actualCategory.getUpdatedAt());
        Assertions.assertNull(actualCategory.getDeletedAt());
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given an invalid null name when call new category and validate then should receive error")
    void givenAnInvalidNullName_whenCallNewCategoryAndValidate_thenShouldReceiveError() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given an invalid empty name when call new category and validate then should receive error")
    void givenAnInvalidEmptyName_whenCallNewCategoryAndValidate_thenShouldReceiveError() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given an invalid name length less than 3 when call new category and validate then should receive error")
    void givenAnInvalidNameLengthLessThan3_whenCallNewCategoryAndValidate_thenShouldReceiveError() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given an invalid name length more than 255 when call new category and validate then should receive error")
    void givenAnInvalidNameLengthMoreThan255_whenCallNewCategoryAndValidate_thenShouldReceiveError() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given a valid empty description when call new category and validate then should receive OK")
    void givenAValidEmptyDescription_whenCallNewCategoryAndValidate_thenShouldReceiveOK() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given a valid false isActive when call new category and validate then should receive OK")
    void givenAValidFalseIsActive_whenCallNewCategoryAndValidate_thenShouldReceiveOK() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given a valid active category when call deactivate then return category inactivated")
    void givenAValidActiveCategory_whenCallDeactivate_thenReturnCategoryInactivated() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given a valid inactive category when call activate then return category activated")
    void givenAValidInactiveCategory_whenCallActivate_thenReturnCategoryActivated() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given a valid category when call update then return category updated")
    void givenAValidCategory_whenCallUpdate_thenReturnCategoryUpdated() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given a valid category when call update to inactive then return category updated")
    void givenAValidCategory_whenCallUpdateToInactive_thenReturnCategoryUpdated() {
        // This method is intentionally left empty to be implemented later.
    }

    @Test
    @Disabled("This test is currently disabled")
    @DisplayName("given a valid category when call update with invalid params then return category updated")
    void givenAValidCategory_whenCallUpdateWithInvalidParams_thenReturnCategoryUpdated() {
        // This method is intentionally left empty to be implemented later.
    }
}
