package hotel;

/**
 * Clase que modela el objeto Cuarto.
 * */
public class Room {

    /** Tipo de habitación */
    private String typeRoom;
    /** Costo diario de la habitación */
    private double costDayHotel;
    /** Días reservados de la habitación*/
    private int daysReservation;
    /** Descuento por noches */
    private double discount;
    /** Subtotal */
    private double subtotalPay;
    /** Pago total */
    private double totalPay;


    /** Constructor de la clase */
    public Room(String typeRoom, double costDayHotel, int daysReservation){
        this.typeRoom = typeRoom;
        this.costDayHotel = costDayHotel;
        this.daysReservation = daysReservation;
    }

    /**
     * Método que calcula el subtotal.
     * @return discount Descuento por noches
     * */
    public double subtotalPayment() {
        subtotalPay = this.costDayHotel * this.daysReservation;
        return subtotalPay;
    }

    /**
     * Método que realiza el descuento.
     * @return discount Descuento por noches
     * @param daysReservation Días reservados
     * */
    public double discountCost(int daysReservation){

        if (daysReservation<=3) {
            this.discount = this.subtotalPay * 0.02;
        } else if (daysReservation>=4 || daysReservation<=7) {
                this.discount = this.subtotalPay * 0.1;
        } if (daysReservation>=8) {
            this.discount = this.subtotalPay * 0.25;
        }
        return this.discount;
    }

    /**
     * Método que calcula el pago total.
     * @return totalPay Pago total
     * */
    public double totalPayment() {
        totalPay = this.subtotalPay - this.discount;
        return totalPay;
    }


    /**
     * Método que imprime la factura de pago del la estadía del hotel.
     * @return result Factura.
     * */
    public String printInnvoiceReservation(){
        return ("----------------\n" +
                "***HOTEL CASTILLO***\n" +
                "Reservaste " + this.daysReservation + " días en una habitación " + this.typeRoom + "\n" +
                "Subtotal: $" + this.subtotalPayment() + "\n" +
                "Descuento por noches: $" + this.discountCost(daysReservation) + "\n" +
                "Valor total a pagar: $" + this.totalPayment() + "\n" +
                "----------------");
    }
}
