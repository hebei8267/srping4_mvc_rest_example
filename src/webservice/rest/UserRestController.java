package webservice.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserRestController {

	/**
	 * 基于ContentNegotiationManager,根据URL的后缀渲染不同的格式 eg. /api/v1/user/1.xml 返回xml
	 * /api/v1/user/1.json 返回json /api/v1/user/1 返回xml(why?)
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserDTO getUser(@PathVariable("id") Long id) {

		UserDTO dto = new UserDTO();

		return dto;

	}
}
