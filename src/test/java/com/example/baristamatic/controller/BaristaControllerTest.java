package com.example.baristamatic.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.Silent.class)
public class BaristaControllerTest {
	
	private MockMvc mockMvc;
	
	
	
	private BaristaController baristaController;
	
	
	
	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
		this.mockMvc=MockMvcBuilders.standaloneSetup(baristaController).build();
	}
	
	@Test
	public void testInvalidArgument() throws Exception{
		this.mockMvc.perform(MockMvcRequestBuilders
				             .get("/invalid"))
				             .andExpect(status().is4xxClientError());
	}

	
	@Test
	public void testMenu() throws Exception{
		this.mockMvc.perform(MockMvcRequestBuilders
				             .get("/menu"))
				             .andExpect(status().isOk());
	}
	
	@Test
	public void testRestock() throws Exception{
		this.mockMvc.perform(MockMvcRequestBuilders
				             .get("/restock"))
				             .andExpect(status().isOk());
	}
	
	
	@Test
	public void testInventory() throws Exception{
		this.mockMvc.perform(MockMvcRequestBuilders
				             .get("/inventory"))
				             .andExpect(status().isOk());
	}
}
