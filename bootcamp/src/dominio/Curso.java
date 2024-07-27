package dominio;

public class Curso extends Atividade{

    private int cargaHoraria;

    public Curso(){}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: {" +
                "Titulo: '" + getTitulo() + '\'' +
                ", Descricao: '" + getDescricao() + '\'' +
                ", Carga Horaria: " + cargaHoraria +
                '}';
    }
}
