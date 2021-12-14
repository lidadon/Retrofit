package ru.geekbrains;

import com.github.javafaker.Faker;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import retrofit2.Response;
import retrofit2.Retrofit;
import ru.geekbrains.dto.Product;
import ru.geekbrains.service.CategoryService;
import ru.geekbrains.service.ProductService;
import ru.geekbrains.utils.RetrofitUtils;

public abstract class BaseTest {
    static Retrofit client;
    static ProductService productService;
    static CategoryService categoryService;
    Faker faker = new Faker();
    Product product;
    Product wrongProduct;
    Product productWithId;

    @BeforeAll
    static void beforeAll() {
        client = RetrofitUtils.getRetrofit();
        productService = client.create(ProductService.class);
        categoryService = client.create(CategoryService.class);
    }
}
