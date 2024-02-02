package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;

public class ValidadorHorarioFuncionamentoClinica {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaClinica = dataConsulta.getHour() < 7;
        var depoisDoEncerramentoClinca = dataConsulta.getHour() > 18;
        if(domingo || antesDaAberturaClinica || depoisDoEncerramentoClinca) {
            throw new ValidacaoException("Consulta fora do horario de funcionamento da clinica")
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.DayOfWeek;;
        }
    }
}
