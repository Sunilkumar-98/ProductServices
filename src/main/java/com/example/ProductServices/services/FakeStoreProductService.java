package com.example.ProductServices.services;

import com.example.ProductServices.dtos.FakeStoryProductDto;
import com.example.ProductServices.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService {
    @Override
    public Product getProductById(long id) {
        /*
        Take the id from input , and call this endpoint
        http://fakestoreapi.com/products/ + id
         */
        // to call 3rd party api rest template is used
        String url = "https://fakestoreapi.com/products/"+ id;
        RestTemplate restTemplate = new RestTemplate();
    FakeStoryProductDto fakeStoryProductDto=  restTemplate.getForObject(url, FakeStoryProductDto.class);

        return convertFakeStoreProductoProduct(fakeStoryProductDto);
    }

    private Product convertFakeStoreProductoProduct(FakeStoryProductDto dto){
        Product product= new Product();
        product.setCategory(dto.getCategory());
        product.setDescription(dto.getDescription());
        product.setName(dto.getTitle());
        return product;

    }
}
