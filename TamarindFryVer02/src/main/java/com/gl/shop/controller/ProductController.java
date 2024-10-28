package com.gl.shop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.shop.entity.OrderDetail;
import com.gl.shop.entity.Product;
import com.gl.shop.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/productByCategory")
	public String showProductsByCategory(Model model,@ModelAttribute("product") Product product)
	{
		System.out.println("About to show Products Categorywise");
		Product producta = new Product();
		
		List <String> categories = productService.getCategoriesSvc();
		model.addAttribute("categories", categories);
		
		List <Product> products = productService.getProductByCategory(product.getCategory());
		model.addAttribute("products", products);
		model.addAttribute("product", producta);
		return "buyerspage2";
	}
	
	@RequestMapping("/buyProduct")
	public String showBuyProductPage(Model model,@RequestParam("productId") int productId)
	{
		//Product product = new Product();
		Product product = productService.getProductById(productId);
		
		OrderDetail orderDetail = new OrderDetail();
		
		model.addAttribute("product", product);
		model.addAttribute("orderDetail", orderDetail);
		Map <Integer,Object> contents = new HashMap<Integer,Object>();
		contents.put(1, product);
		contents.put(2, orderDetail);
		model.addAttribute("contents", contents);
		
		return "buyProduct";
	}
	
	//  /products/productByCategory

}
