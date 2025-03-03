package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter(urlPatterns="/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		long antes = System.currentTimeMillis();

		String acao = request.getParameter("acao");

		// executa a a��o
		chain.doFilter(request, response);

		long depois = System.currentTimeMillis();

		System.out.println("Tempo de execu��o da a��o " + acao + " -> " + (depois - antes));
	}

}
