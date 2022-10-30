package com.uc.jpaspec.repository.common.spec;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Builder
public class SearchFilter {
    private String field;
    private String operator;
    private String value;
    private String joinColumnName;
    private List<String> values;//Used in case of IN operator


    public static SearchFilter convert(String query) {

        final List<String> operators = Arrays.asList("==", "=like=", "=notlike=", "=in=", "=out=", "=gt=", "=lt=", "=ge=", "=le=", "!=");
        Optional<String> operator = operators.stream().filter((op) -> query.contains(op)).findFirst();
        if (operator.isPresent()) {
            String[] fieldAndValue = query.split(operator.get());
            if (operator.get().equals("=in=") || operator.get().equals("=out=")) {
                return SearchFilter.builder().field(getField(fieldAndValue[0])).joinColumnName( getColumn(fieldAndValue[0])).operator(operator.get())
                        .values(Arrays.asList(fieldAndValue[1].replace("(", "").replace(")", "").split(","))).build();
            } else {

                return SearchFilter.builder().field(getField(fieldAndValue[0])).joinColumnName(getColumn(fieldAndValue[0])).operator(operator.get()).value(fieldAndValue[1]).build();
            }
        } else {
            new RuntimeException("Operator not found");
        }
        return null;

    }
    protected static String getColumn(String value){
        return value.contains(".") ?  value.split("\\.")[0] : null;
    }
    protected static String getField(String value){
        return value.contains(".") ? value.split("\\.")[1] : value;
    }


}
