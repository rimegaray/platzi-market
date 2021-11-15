package com.platzi.market.domain;

import com.platzi.market.persistence.entity.ProductEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
public class Category {

    private Long categoryId;

    private String description;

    private Boolean status;

}
