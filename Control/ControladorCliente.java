public class ControladorCliente {

public List<Cliente> clientes;

public void criar(Cliente cliente){
	clientes.add(cliente);
}

public void alterar(Cliente cliente){
	if(pesquisar(cliente)){
		clientes.remove(cliente);
		clientes.add(cliente)
	}
}

public void excluir(Cliente cliente){
	if(pesquisar(cliente)){
		clientes.remove(cliente);
	}
}

public Cliente pesquisar(Cliente cliente){
	clientes.get(cliente);
}


}