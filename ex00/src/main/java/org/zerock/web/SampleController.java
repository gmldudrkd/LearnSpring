package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ProductVO;



@Controller //컨트롤러임을 명시해주는 애노테이션
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	// @RequestMapping : 특정한 URI경로에 해당하는 메소드가실행
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA called................");
	}
	
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called.................");
	}
	
	// @ModelAttribute : 해당객체를 뷰까지 전달, 파라미터
	@RequestMapping("doC")
	public String doC( @ModelAttribute("msg") String msg) {
		logger.info("doC called.................");
		return "result";
	}
	
	@RequestMapping("/doD")
	public String doD(Model model) {
		ProductVO product = new ProductVO("sample product", 10000);
		logger.info("doD");
		//model 클래스를 지원 > 뷰에 데이터를 전달하는 컨데이너 :: product의 데이터를 가지고전달
		model.addAttribute(product); 
		
		//리턴 값으로 사용된 값이 .jsp 파일명으로 사용됨
		return "productDetail";
	}
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		logger.info("doE");
		
		rttr.addFlashAttribute("msg", "This is the Message! with redirected");
		return "redirect:/doF"; //해당컨틀롤러 재호출
	}
	@RequestMapping("/doF")
	public void doF(@ModelAttribute String msg) {
		logger.info("doF....");
	}
	
}
