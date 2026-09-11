package business;

public class GeradorPin extends GeradorSenha{

    @Override
    public String gerarSenha() {
        String pin;
        do {
            StringBuilder valor = new StringBuilder(6);
            for (int i = 0; i < 6; i++) {
                valor.append(sortearCaractere(NUMEROS));
            }
            pin = valor.toString();
        } while (digitosIguais(pin) || sequenciaCrescente(pin) || sequenciaDecrescente(pin));

        return pin;
    }

    private boolean digitosIguais(String pin) {
        for (int i = 1; i < pin.length(); i++) {
            if (pin.charAt(i) != pin.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    private boolean sequenciaCrescente(String pin) {
        for (int i = 1; i < pin.length(); i++) {
            if (pin.charAt(i) != pin.charAt(i - 1) + 1) {
                return false;
            }
        }
        return true;
    }

    private boolean sequenciaDecrescente(String pin) {
        for (int i = 1; i < pin.length(); i++) {
            if (pin.charAt(i) != pin.charAt(i - 1) - 1) {
                return false;
            }
        }
        return true;
    }
}
