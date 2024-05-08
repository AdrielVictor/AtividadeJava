package Adriel.Victor.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public class Cliente {
	    // Atributos
	    private String nome;
	    private String email;
	    private int numeroCelular;

	    // Construtor
	    public Cliente(String nome, String email, int numeroCelular) {
	        this.nome = nome;
	        this.email = email;
	        this.numeroCelular = numeroCelular;
	    }

	    // Métodos getters e setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public int getNumeroCelular() {
	        return numeroCelular;
	    }

	    public void setNumeroCelular(int numeroCelular) {
	        this.numeroCelular = numeroCelular;
	    }
	}

	public class Loja {
	    // Atributos
	    private String local;
	    private double cnpj;

	    // Construtor
	    public Loja(String local, double cnpj) {
	        this.local = local;
	        this.cnpj = cnpj;
	    }

	    // Métodos getters e setters
	    public String getLocal() {
	        return local;
	    }

	    public void setLocal(String local) {
	        this.local = local;
	    }

	    public double getCnpj() {
	        return cnpj;
	    }

	    public void setCnpj(double cnpj) {
	        this.cnpj = cnpj;
	    }
	}

	public class Produto {
	    // Atributos
	    private double codigo;
	    private double preco;

	    // Construtor
	    public Produto(double codigo, double preco) {
	        this.codigo = codigo;
	        this.preco = preco;
	    }

	    // Métodos getters e setters
	    public double getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(double codigo) {
	        this.codigo = codigo;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }
	}

	public class Carrinho {
	    // Atributos
	    private double codigoProduto;
	    private double precoProduto;

	    // Construtor
	    public Carrinho(double codigoProduto, double precoProduto) {
	        this.codigoProduto = codigoProduto;
	        this.precoProduto = precoProduto;
	    }

	    // Métodos getters e setters
	    public double getCodigoProduto() {
	        return codigoProduto;
	    }

	    public void setCodigoProduto(double codigoProduto) {
	        this.codigoProduto = codigoProduto;
	    }

	    public double getPrecoProduto() {
	        return precoProduto;
	    }

	    public void setPrecoProduto(double precoProduto) {
	        this.precoProduto = precoProduto;
	    }
	}

}