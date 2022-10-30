package com.uc.jpaspec.mapper;

import com.uc.jpaspec.model.dto.PurchasedDto;
import com.uc.jpaspec.model.entity.Purchased;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-30T18:34:59+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.3 (Amazon.com Inc.)"
)
@Component
public class PurchasedDtoMapperImpl implements PurchasedDtoMapper {

    @Override
    public PurchasedDto convert(Purchased entity) {
        if ( entity == null ) {
            return null;
        }

        PurchasedDto purchasedDto = new PurchasedDto();

        return purchasedDto;
    }

    @Override
    public List<PurchasedDto> convertList(List<Purchased> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PurchasedDto> list = new ArrayList<PurchasedDto>( entityList.size() );
        for ( Purchased purchased : entityList ) {
            list.add( convert( purchased ) );
        }

        return list;
    }
}
