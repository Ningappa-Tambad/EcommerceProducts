package com.springacademy.productservicejune24.Services;

import com.springacademy.productservicejune24.dtos.FakeStoreProductDto;
import com.springacademy.productservicejune24.models.Category;
import com.springacademy.productservicejune24.models.Product;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }


    @Override
    public Product getSingleProduct(long productId) {

        //Call fakestore product service to fetch product with given id ==> HTTP

     FakeStoreProductDto fakeStoreProductDto= restTemplate.getForObject(
              "https://fakestoreapi.com/products/" + productId + "/", FakeStoreProductDto.class
      );

     //Convert FakeStoreProductDto into Product

     return convertFakeStoreProductToProduct(fakeStoreProductDto);

       //ce class");
    }

    @Override
    public List<Product> getAllProducts()
    {
        FakeStoreProductDto[] fakeStoreProductDtos= restTemplate.getForObject(
                "https://fakestoreapi.com/products",
               FakeStoreProductDto[].class
        );
        //COnvert list of fakestoreproductdto into list<product>

        List<Product> products = new ArrayList<>();

        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductDtos)
        {
            products.add(convertFakeStoreProductToProduct(fakeStoreProductDto));
        }

        return products;
    }

    @Override
    public Product UpdateProduct(Long id, Product product) {

        //PATCH

        RequestCallback requestCallback = restTemplate.httpEntityCallback(product, FakeStoreProductDto.class);
        HttpMessageConverterExtractor<FakeStoreProductDto> responseExtractor = new HttpMessageConverterExtractor(FakeStoreProductDto.class, restTemplate.getMessageConverters());
      FakeStoreProductDto  response= restTemplate.execute("https://fakestoreapi.com/products" +id, HttpMethod.PATCH, requestCallback, responseExtractor);


        return convertFakeStoreProductToProduct(response);
    }

    @Override
    public Product ReplaceProduct(Long id, Product product) {
        return null;
    }

    private Product convertFakeStoreProductToProduct(FakeStoreProductDto fakeStoreProductDto) {

        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());

        Category category = new Category();

        category.setDescription(fakeStoreProductDto.getDescription());
        product.setCategory(category);





        return product;

    }
}
