package com.jiangdaxian.helloword.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jiangdaxian.common.util.properties.PropertiesUtils;

@Controller
public class PropertiesController {
	private static final Logger LOG = LoggerFactory.getLogger(PropertiesController.class);
	
	@RequestMapping(value = "/echo/index", method = { RequestMethod.POST, RequestMethod.GET })
	public String index(HttpServletRequest request, Model model) {
		LOG.info("进入首页");
		List<String> jdxList = new ArrayList<String>();
		jdxList.add("1");
		jdxList.add("2");
		jdxList.add("3");
		jdxList.add("4");

		Map<String, Object> jdxMap = new HashMap<String, Object>();
		jdxMap.put("1", "111");
		jdxMap.put("2", "222");
		jdxMap.put("3", "333");
		jdxMap.put("4", "444");

		model.addAttribute("jdx", "jiangdaxian");
		model.addAttribute("jdxList", jdxList);
		model.addAttribute("jdxMap", jdxMap);

		return "/echo/index";
	}
}
