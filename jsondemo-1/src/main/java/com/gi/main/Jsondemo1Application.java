package com.gi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jsondemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jsondemo1Application.class, args);
	}

//	@Autowired
//	MetaDataService mdService;
//	@Bean
//	CommandLineRunner runner(MetaDataService mdService) {
//		return args -> {
//			// read json and write to db
//			ObjectMapper mapper = new ObjectMapper();
//			TypeReference<List<Root>> typeReference = new TypeReference<List<Root>>(){};
//			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/InputJson.json");
//			try {
//				List<Root> root = mapper.readValue(inputStream,typeReference);
//				mdService.savedata(root);
//				System.out.println("Data Saved!");
//			} catch (IOException e){
//				System.out.println("Unable to save data: " + e.getMessage());
//			}
//		};
//	}
}
