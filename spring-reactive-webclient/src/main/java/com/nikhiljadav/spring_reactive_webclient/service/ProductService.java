package com.nikhiljadav.spring_reactive_webclient.service;

import com.nikhiljadav.spring_reactive_webclient.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final WebClient webClient;

    public ProductService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<Product> getAllProducts() {
        return webClient.get()
                .retrieve()
                .bodyToFlux(Product.class);
    }

    public Mono<Product> getProductById(Long id) {
        return webClient.get()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Product.class);
    }

    public Mono<Product> createProduct(Product product) {
        return webClient.post()
                .bodyValue(product)
                .retrieve()
                .bodyToMono(Product.class);
    }

    public Mono<Product> updateProduct(Long id, Product updatedProduct) {
        return webClient.put()
                .uri("/{id}", id)
                .bodyValue(updatedProduct)
                .retrieve()
                .bodyToMono(Product.class);
    }

    public Mono<Void> deleteProduct(Long id) {
        return webClient.delete()
                .uri("/{id}", id)
                .retrieve()
                .bodyToMono(Void.class);
    }
}
