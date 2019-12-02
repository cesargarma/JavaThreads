package Threads.Thread5;

public class Cuenta {
    private int saldo;

    public Cuenta(int cantidad){
        this.saldo = cantidad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void retirarDinero(int cantidad, String nombrePersona){
        if(cantidad < getSaldo()){
            System.out.println("La persona " + nombrePersona + " solicita retirar dinero (" + cantidad + "), y si puede hacerlo");
            restar(cantidad);
        }
        else System.out.println(nombrePersona + ": No hay dinero suficiente.");
    }

    private void restar (int cantidad){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        saldo -= cantidad;
        saldoNegativo();
    }

    private void saldoNegativo() {
        if(getSaldo() < 0) System.out.println("Tenemos menos de 0€ en la cuenta!!!");
    }
}
