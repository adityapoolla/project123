package com.example.demo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.util.Assert;

import com.example.demo.dao.MovieRepository;
import com.example.demo.model.Movie;
import com.example.demo.util.TestDummy;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@SpringBootTest
@AutoConfigureMockMvc
class TestBackendApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private MovieRepository movieRepository;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		when(movieRepository.findAll()).thenReturn(TestDummy.getMovies());
		MvcResult result = this.mockMvc.perform(get("/api/movies")).andDo(print()).andExpect(status().isOk())
				.andReturn();
		System.out.println();
		Gson gson = new Gson();
		List<Movie> movies = gson.fromJson(result.getResponse().getContentAsString(), new TypeToken<List<Movie>>(){}.getType());
		Assert.isTrue(movies.size() == 2, "Movies list length must be 2");
	}

}
