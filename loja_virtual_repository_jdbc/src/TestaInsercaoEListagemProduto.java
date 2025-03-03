import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.dao.ProdutoDAO;
import br.com.alura.jdbc.ConnectionFactory;
import br.com.alura.modelo.Produto;

public class TestaInsercaoEListagemProduto {
	public static void main(String[] args) throws SQLException {
		Produto comoda = new Produto("C�moda", "C�moda Vertical");

		try (Connection connection = new ConnectionFactory().conectar()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(connection);
			produtoDAO.salvar(comoda);
			List<Produto> listaDeProdutos= produtoDAO.listar();
			
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
			
		}
	}
}
