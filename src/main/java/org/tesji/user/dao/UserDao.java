package org.tesji.user.dao;

import java.util.List;

import org.tesji.user.model.Usuario;

public interface UserDao {
	
	
	public void guardarusuario(Usuario usuario);
	
	public Usuario getById(Long id);
	
	public List<Usuario> findAll();
	
	public void removeById(Usuario usuario);
	
	

}
