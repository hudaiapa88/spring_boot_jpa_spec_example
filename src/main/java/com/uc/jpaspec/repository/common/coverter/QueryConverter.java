package com.uc.jpaspec.repository.common.coverter;

import com.uc.jpaspec.repository.common.spec.SearchFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class QueryConverter {
    public static List<SearchFilter> convert(String filter) {
        List<String> queries = getQueryList(filter);
        return queries.stream().map((query) -> SearchFilter.convert(query)).collect(Collectors.toList());


    }

    protected static List<String> getQueryList(String filter) {
        return Arrays.stream(filter.split(";")).collect(Collectors.toList());
    }
}
