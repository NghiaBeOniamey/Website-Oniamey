package com.shop.oniamey.repository.product;

import com.shop.oniamey.core.admin.product.model.response.PropertyResponse;
import com.shop.oniamey.entity.SleeveLength;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SleeveLengthRepository extends JpaRepository<SleeveLength, Long> {

    @Query(
            value = """
                    SELECT id, 
                    name as name,
                    created_at as createdAt,
                    updated_at as updatedAt,
                    created_by as createdBy,
                    updated_by as updatedBy,
                    deleted as deleted
                    FROM sleeve_length order by created_at desc;
                    """,
            nativeQuery = true
    )
    List<PropertyResponse> getAll();

}
