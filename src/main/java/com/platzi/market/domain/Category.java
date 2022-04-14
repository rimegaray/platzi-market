package com.platzi.market.domain;

import com.platzi.market.persistence.entity.ProductEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Category {

    private Long categoryId;

    private String description;

    private Boolean status;

    /*@Getter
    public enum StateEnumTDO {

        EXITO("Exito"),
        ERROR("Error");

        private final String value;

        StateEnumTDO(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static StateEnumTDO fromValue(String v) {
            return Arrays.stream(values()).filter(e-> e.value().equalsIgnoreCase(v))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(v));
        }

    }

    @Getter
    public enum EstadoEnumDto {

        EXITO("Exito"),
        ERROR("Error");

        private final String value;

        EstadoEnumDto(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static EstadoEnumDto fromValue(String v) {
            return Arrays.stream(values()).filter(e-> e.value().equalsIgnoreCase(v))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(v));
        }

    }*/

}
