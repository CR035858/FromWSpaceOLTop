package com.gl.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.shop.entity.Product;
import com.gl.shop.service.ProductService;

@Controller
@RequestMapping("/navigate")
public class NavigationController {

	@Autowired
	ProductService productService;
	
	
	@RequestMapping("/buyGoods")
	public String showBuyGoodsPage(Model model)
	{
		String message = "Welcome!!! You Can Buy Wide Range of Goods at Best Prices";
		model.addAttribute("mymessage", message);
		List <String> categories = productService.getCategoriesSvc();
		Product product = new Product();
		model.addAttribute("product", product);
		model.addAttribute("categories", categories);
		return "buyerspage1";
	}
	
	@RequestMapping("/sellGoods")
	public String showSellGoodsPage(Model model)
	{
		String message = "Welcome!!! You Can Sell Wide Range of Goods at Win-Win Prices";
		model.addAttribute("mymessage", message);
		return "sellerspage";
	}
	@RequestMapping("/categories")
	public String showCategoriesPage(Model model)
	{
		String message = "Welcome!!! You Can Buy Wide Range of Goods from Diverse Categories";
		model.addAttribute("mymessage", message);
		return "categoriespage";
	}
	@RequestMapping("/electronics")
	public String showElectronicsPage(Model model)
	{
		String message = "Welcome!!! You Can Buy Wide Range of Electronics Goods at Best Prices";
		model.addAttribute("mymessage", message);
		return "electronicspage";
	}
	@RequestMapping("/hardware")
	public String showHardwarePage(Model model)
	{
		String message = "Welcome!!! You Can Buy Wide Range of Hardware at Best Prices";
		model.addAttribute("mymessage", message);
		return "hardwarepage";
	}
	@RequestMapping("/software")
	public String showSoftwarePage(Model model)
	{
		String message = "Welcome!!! You Can Buy Wide Range of Software at Best Prices";
		model.addAttribute("mymessage", message);
		return "softwarepage";
	}
	@RequestMapping("/appliances")
	public String showAppliancesPage(Model model)
	{
		String message = "Welcome!!! You Can Buy Wide Range of Home Appliances at Best Prices";
		model.addAttribute("mymessage", message);
		return "appliancespage";
	}
	@RequestMapping("/cosmetics")
	public String showCosmeticsPage(Model model)
	{
		String message = "Welcome!!! You Can Buy Wide Range of Cosmetics at Best Prices";
		model.addAttribute("mymessage", message);
		return "cosmeticspage";
	}
	@RequestMapping("/complaints")
	public String goToComplaintsPage(Model model)
	{
		String message = "We Regret for the Inconvenience!!! You Can Raise your complaint Here";
		model.addAttribute("mymessage", message);
		return "complaintspage";
	}
	@RequestMapping("/suggestions")
	public String goToSuggestionsPage(Model model)
	{
		String message = "Welcome!!! You Can provide your  valuable suggestions here...";
		model.addAttribute("mymessage", message);
		return "suggestionspage";
	}
	@RequestMapping("/appreciation")
	public String goToAppreciationPage(Model model)
	{
		String message = "Welcome!!! You Can express your Heartfelt Appreciations Here ....";
		model.addAttribute("mymessage", message);
		return "appreciationpage";
	}
	@RequestMapping("/trackOrder")
	public String showTrackOrderPage(Model model)
	{
		String message = "Welcome!!! You Can Track Your Order Status over here";
		model.addAttribute("mymessage", message);
		return "trackorderpage";
	}
	@RequestMapping("/addCard")
	public String showAddCardPage(Model model)
	{
		String message = "Welcome!!! You Can Add Card Details Here";
		model.addAttribute("mymessage", message);
		return "addcardpage";
	}
	@RequestMapping("/dayDeals")
	public String showDayDealsPage(Model model)
	{
		String message = "Welcome!!! Best Deals of the Day";
		model.addAttribute("mymessage", message);
		return "daydealspage";
	}
	@RequestMapping("/contact")
	public String showContactsPage(Model model)
	{
		String message = "Welcome!!! To the Contacts Page..";
		model.addAttribute("mymessage", message);
		return "contactspage";
	}
}
