package med.voll.api.domain.consulta;

public record DadosDetalhamentoConsulta(Object o, Object o1, Object o2, Object o3) {
    public DadosDetalhamentoConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId(), consulta.getData());
    }
}
