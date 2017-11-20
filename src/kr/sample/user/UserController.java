package kr.sample.user;

import java.util.UUID;

public class UserController {
	public String createID() {
		return UUID.randomUUID().toString();
	}
}
