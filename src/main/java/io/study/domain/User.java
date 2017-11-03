package io.study.domain;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class User {
	@NonNull
	private Integer id;
	@NonNull
	private String user;
	
	@NonNull
	private String email;
	
	


}
