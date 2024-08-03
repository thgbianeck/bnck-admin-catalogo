package br.com.bnck.admin.catalogo.domain.category;

import java.util.List;
import java.util.Optional;

public interface CategoryGateway {

    Category create(Category aCategory);

    void deleteById(CategoryID anId);

    Optional<Category> findById(CategoryID anId);

    Category update(Category aCategory);

    List<CategoryID> existsByIds(Iterable<CategoryID> ids);

}
