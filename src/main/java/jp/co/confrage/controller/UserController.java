package jp.co.confrage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import jp.co.confrage.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository repository;
	public void select() {
		List<String> list = repository.findByPk();
		for(String l: list) {
			System.out.println(l);
		}
	}
}
