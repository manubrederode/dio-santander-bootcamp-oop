package dominio;

import java.time.LocalDate;

public class Mentoria extends Atividade{

    private LocalDate dataMentoria;

    public Mentoria(){}

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria: {" +
                "Titulo: '" + getTitulo() + '\'' +
                ", Descricao: '" + getDescricao() + '\'' +
                ", Data Mentoria: " + dataMentoria +
                '}';
    }
}
