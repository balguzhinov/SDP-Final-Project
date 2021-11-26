package adapter;

public class QRAdapter implements PaymentMethod {

    QR qr = new QR();

    public QRAdapter(QR newQr) {
        this.qr = newQr;
    }

    @Override
    public void pay() {
        qr.scan();
    }
}
