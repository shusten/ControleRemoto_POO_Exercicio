package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // =========    Métodos Especiais  =============


    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
