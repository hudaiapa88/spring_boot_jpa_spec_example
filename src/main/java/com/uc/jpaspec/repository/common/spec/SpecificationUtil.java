package com.uc.jpaspec.repository.common.spec;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class SpecificationUtil {
    public static <T> Specification<T> bySearchQuery(List<SearchFilter> searchFilters, Class<T> clazz) {

        return (Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criterailBuilder) -> {

            List<Predicate> predicates = new ArrayList<>();

         /*   // Add Predicates for tables to be joined

            if (joinColumnProps != null && !joinColumnProps.isEmpty()) {
                for (JoinColumnProps joinColumnProp : joinColumnProps) {
                    addJoinColumnProps(predicates, joinColumnProp, criterailBuilder, root);
                }
            }

            List<SearchFilter> searchFilters = searchQuery.getSearchFilters();

            if (searchFilters != null && !searchFilters.isEmpty()) {

                for (final SearchFilter searchFilter : searchFilters) {
                    addPredicates(predicates, searchFilter, criterailBuilder, root);
                }
            }*/

            searchFilters.stream().forEach((searchFilter)->{
                if(Optional.ofNullable(searchFilter.getJoinColumnName()).isPresent()){
                    addJoinColumnProps(predicates, searchFilter, criterailBuilder, root);
                }
                else {
                    addPredicates(predicates, searchFilter, criterailBuilder, root);
                }
            });

            if (predicates.isEmpty()) {
                return criterailBuilder.conjunction();
            }

            return criterailBuilder.and(predicates.toArray(new Predicate[0]));

        };
    }

    private static <T> void addJoinColumnProps(List<Predicate> predicates, SearchFilter searchFilter,
                                               CriteriaBuilder criteriaBuilder, Root<T> root) {

        Join<Object, Object> joinParent = root.join(searchFilter.getJoinColumnName());
        String property = searchFilter.getField();
        Path expression = joinParent.get(property);
        addPredicate(predicates, searchFilter, criteriaBuilder, expression);

    }

    private static <T> void addPredicates(List<Predicate> predicates, SearchFilter searchFilter,
                                          CriteriaBuilder criterailBuilder, Root<T> root) {
        String property = searchFilter.getField();
        Path expression = root.get(property);

        addPredicate(predicates, searchFilter, criterailBuilder, expression);

    }

    private static void addPredicate(List<Predicate> predicates, SearchFilter searchFilter,
                                     CriteriaBuilder criterailBuilder, Path expression) {
        switch (searchFilter.getOperator()) {
            case "==":
                predicates.add(criterailBuilder.equal(expression, searchFilter.getValue()));
                break;
            case "=like=":
                predicates.add(criterailBuilder.like(expression, "%" + searchFilter.getValue() + "%"));
                break;
            case "=notlike=":
                predicates.add(criterailBuilder.notLike(expression, "%" + searchFilter.getValue() + "%"));
                break;
            case "=in=":
                predicates.add(criterailBuilder.in(expression).value(RequiredType.castToRequiredType(
                        expression.getJavaType(),
                        searchFilter.getValues())));
                break;
            case "=out=":
                predicates.add(criterailBuilder.in(expression).value(RequiredType.castToRequiredType(
                        expression.getJavaType(),
                        searchFilter.getValues())).not());
                break;
            case  "=gt=":
                predicates.add(criterailBuilder.greaterThan(expression, (Comparable) searchFilter.getValue()));
                break;
            case "=lt=":
                predicates.add(criterailBuilder.lessThan(expression, (Comparable) searchFilter.getValue()));
                break;
            case "=ge=":
                predicates.add(criterailBuilder.greaterThanOrEqualTo(expression, (Comparable) searchFilter.getValue()));
                break;
            case "=le=":
                predicates.add(criterailBuilder.lessThanOrEqualTo(expression, (Comparable) searchFilter.getValue()));
                break;
            case "!=":
                predicates.add(criterailBuilder.notEqual(expression, searchFilter.getValue()));
                break;
        /*    case "IsNull":
                predicates.add(criterailBuilder.isNull(expression));
                break;
            case "NotNull":
                predicates.add(criterailBuilder.isNotNull(expression));
                break;*/
            default:
                System.out.println("Predicate is not matched");
                throw new IllegalArgumentException(searchFilter.getOperator() + " is not a valid predicate");
        }

    }

}
