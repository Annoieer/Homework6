package homework_6.paymentscore.mapper;

import homework_6.paymentscore.dto.ProductTypeDto;
import homework_6.paymentscore.entity.ProductType;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeMapper {
    private final ModelMapper modelMapper;

    public ProductTypeMapper() {
        this.modelMapper = new ModelMapper();
    }

    public ProductTypeDto toDto(ProductType productType) {
        return modelMapper.map(productType, ProductTypeDto.class);
    }
}
