package lesson023.service;

import lesson023.entity.data.User;
import lesson023.entity.database.DataBase;
import lesson023.entity.enums.EStatus;
import lesson023.util.Util;

public class AdminManager {

	public void getAll() {
		for (User user : DataBase.getUserList())
			System.out.println(user);
	}

	// yukarıdaki metodun Stream API kullanılmış şekli
	public void getAll2() {
		DataBase.getUserList().stream().forEach(user -> System.out.println(user.toString()));
	}

	public void getUserByActive() {
		System.out.println("- - - aktif edilmiş - - -");
		for (User user : DataBase.getUserList()) {
			if (user.geteStatus() == EStatus.ACTIVE) {
				System.out.println(user);
			}
		}

	}

	public void getUserByPending() {
		System.out.println("- - - onay bekleyen - - -");
		for (User user : DataBase.getUserList()) {
			if (user.geteStatus() == EStatus.PENDING) {
				System.out.println(user);
			}
		}

	}

	public User userIdKontrol(String id) {

		for (int i = 0; i < DataBase.getUserList().size(); i++) {
			if (DataBase.getUserList().get(i).getPassword().equals(id)) {
				System.out.println(id + " id sine sahip kullanıcı aktif edildi");
				return DataBase.getUserList().get(i);
			}
		}
		System.out.println("user not found");
		return null;
	}

	public void setActive() {
		String id = Util.stringDegerAl("Aktif etmek istediğiniz kullanıcının id'sini girin: ");
		User user = userIdKontrol(id);
		if (user != null) {
			user.seteStatus(EStatus.ACTIVE);
		}
	}

}
