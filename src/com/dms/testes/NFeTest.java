package com.dms.testes;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.dms.NFe;
import com.dms.estados.PE;
import com.dms.estados.SP;

public class NFeTest {

	private NFe notaFiscal;

	@Before
	public void init() {
		notaFiscal = new NFe();
	}

	@Test
	public void deveGerarUmaNotaFiscalComNumeroEntre_1_e_10() throws Exception {
		notaFiscal = new NFe();

		Integer numero = notaFiscal.getNumero();

		System.out.println("Número da nota: " + numero);

		if (numero < 1 || numero > 10) {
			throw new Exception("Numero da nota fiscal não consta entre 1 e 10");
		}
	}

	@Test
	public void deveObterOValorDoImpostoDaNota() throws Exception {
		notaFiscal = new NFe(2, new Date(), new SP(), new BigDecimal(1000.0));

		System.out.println("Imposto do estado de: " + notaFiscal.getEstado().getUf().getEstado());

		assertEquals(70.0, notaFiscal.getTotalImposto().doubleValue(), 0.005);
	}

	@Test
	public void deveCalcularTotalGeralDaNotaFiscal() {
		notaFiscal = new NFe(3, new Date(), new PE(), new BigDecimal(1000.0));

		System.out.println(notaFiscal.toString());

		assertEquals(1180.0, notaFiscal.getTotalGeral().doubleValue(), 0.005);
	}

}
