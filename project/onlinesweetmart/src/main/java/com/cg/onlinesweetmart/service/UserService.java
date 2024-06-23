package com.cg.onlinesweetmart.service;

import java.util.List;

import com.cg.onlinesweetmart.dto.UserResponseDto;
import com.cg.onlinesweetmart.entity.User;

public interface UserService {

	/**
	 * Retrieves a list of all users.
	 *
	 * @return List of all users.
	 */
	List<UserResponseDto> showAllUsers();

	/**
	 * Updates an existing user.
	 *
	 * @param user The user to be updated.
	 * @return The updated user.
	 * @throws SweetMartAPIException If the user to be updated is not found.
	 */
	UserResponseDto updateUser(User user);

	/**
	 * Cancels a user by their ID.
	 *
	 * @param userId The ID of the user to be canceled.
	 * @throws SweetMartAPIException If the user to be canceled is not found.
	 */
	void cancelUser(long userId);

	User showUser(long userId);

	User getUserByUsernameOrEmail(String usernameOrEmail);

}