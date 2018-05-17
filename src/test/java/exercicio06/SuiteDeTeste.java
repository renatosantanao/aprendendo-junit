package exercicio06;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio01.MeuPrimeiroTeste;
import exercicio02.ValidacaoVedadeiroFalso;
import exercicio03.ValidacaoIgualdade;
import exercicio04.PreEPosCondicoesDeTeste;
import exercicio05.PreEPosCondicoesDaClasse;

@RunWith(Suite.class)
@SuiteClasses({
	MeuPrimeiroTeste.class,
	ValidacaoVedadeiroFalso.class,
	ValidacaoIgualdade.class,
	PreEPosCondicoesDeTeste.class,
	PreEPosCondicoesDaClasse.class
})

public class SuiteDeTeste {

}
