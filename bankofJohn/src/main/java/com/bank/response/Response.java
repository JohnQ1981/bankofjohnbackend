package com.bank.response;

import lombok.Data;
//@Data==> @Getter+@Setter+toString+ hasCode+ equals
@Data
public class Response {
	
	boolean isSuccess;
	String message;

}
