package com.electro.cigma.service.products;

import com.electro.cigma.customexception.custom.GlobalServerException;
import com.electro.cigma.customexception.custom.InvalidRequest;
import com.electro.cigma.customexception.custom.ProductNotFound;
import com.electro.cigma.entity.Advertisement;
import com.electro.cigma.entity.Products;
import com.electro.cigma.entity.UsersReview;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.electro.cigma.dtos.AdProductView;
import com.electro.cigma.dtos.AllProductDisplay;
import com.electro.cigma.dtos.SearchPage;
import com.electro.cigma.dtos.View;

import java.io.IOException;
import java.util.List;

public interface ProductMandatoryServices {

    ResponseEntity<?> addProducts(Products products);
    ResponseEntity<?> submitProductReview(int productId, UsersReview usersReview) throws ProductNotFound;
    ResponseEntity<?> addThumbnail(int productId,MultipartFile file) throws ProductNotFound, IOException;
    ResponseEntity<?> addProductImages(int productId,MultipartFile[] files) throws ProductNotFound, IOException;
    double overallRatingCalc(Products products,int newRating);
    List<View> handleNewDeals();
    Products getProductById(int id) throws ProductNotFound, InvalidRequest;
    AllProductDisplay getProductView(int page, int size);
    ResponseEntity<?> handleProductDetailsUpdate(int id,String title,String price);
    ResponseEntity<?> handleProductStockUpdate(int id, int stock);
    ResponseEntity<?> handleProductTrending(int id, boolean trend);
    int handleGetAllproducts();
    ResponseEntity<?> addAdvertisement(int productId,MultipartFile multipartFile) throws IOException ;
    List<AdProductView> searchProduct(String name);
    List<Advertisement> getAdvertisement();
    ResponseEntity<String> deleteAdvertisement(int id);
    long handleAdCount();
    SearchPage productSearch(String query, int limit, int page, double price, double rating, boolean outOfStock, boolean topDeals) throws GlobalServerException;
    AllProductDisplay handleProductSearch(int page,int size,String query);
    List<Advertisement> displayAd();
    public Advertisement displaySpecificAd();
    public List<View> getCategoryBasedProducts(int id);
    public List<View> getBestSellers();

    }
