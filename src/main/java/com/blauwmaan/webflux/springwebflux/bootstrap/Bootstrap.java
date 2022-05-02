package com.blauwmaan.webflux.springwebflux.bootstrap;

import com.blauwmaan.webflux.springwebflux.domain.Category;
import com.blauwmaan.webflux.springwebflux.domain.Vendor;
import com.blauwmaan.webflux.springwebflux.repository.CategoryRepository;
import com.blauwmaan.webflux.springwebflux.repository.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) {

        if(categoryRepository.count().block() == 0){
            //load data
            System.out.println("#### LOADING DATA ON BOOTSTRAP #####");

            categoryRepository.save(Category.builder()
                    .description("Fruits").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Nuts").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Breads").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Meats").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Eggs").build()).block();

            System.out.println("Loaded Categories: " + categoryRepository.count().block());

            vendorRepository.save(Vendor.builder()
                    .firstName("Björn")
                    .lastName("Versywvel").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("René")
                    .lastName("Walters").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Sonja")
                    .lastName("Cage").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Whoopi")
                    .lastName("Do").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Dean")
                    .lastName("Martin").build()).block();

            System.out.println("Loaded Vendors: " + vendorRepository.count().block());

        }
    }
}
