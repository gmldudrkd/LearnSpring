package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	//@ResponseBody : 리턴타입이 HTTP의 응답메세지로 전송
		@RequestMapping("/doJSON")
		public @ResponseBody ProductVO doJSON() {
			logger.info("doJSON...2");
			ProductVO vo = new ProductVO("샘플상품", 30000);
			return vo;
		}
}
