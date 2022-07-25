package com.ai.project.controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ai.project.model.CelebrityVO;
import com.ai.project.service.CelebrityService;

@Controller
public class APIController {
	
	@Autowired
	CelebrityService cService;
	
	// index view
	@RequestMapping("/")
	public String indexView() {
		return "index";
	}
	
	// 1. 콘솔에 출력해보기
	/*
	 * @RequestMapping("/celebFace") public String celebFace() {
	 * 
	 * cService.CelebrityFace(); return "celebFaceView"; }
	 */	
	
	
	@RequestMapping("/celebFace") 
	public String celebFace(Model model) {
	ArrayList<CelebrityVO> celList = cService.CelebrityFace();
	//model 보내기
	cService.CelebrityFace();
	
	return "celebFaceView"; }
	
}
